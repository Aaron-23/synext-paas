FROM percona:5.7.26

USER root
ENV MYSQL_VERSION=5.7.26
ENV TZ=Asia/Shanghai
ENV MYSQL_ROOT_PASSWORD=root123

# Setup gosu for easier command execution
RUN curl -o /usr/local/bin/gosu -SL "https://goodrain-pkg.oss-cn-shanghai.aliyuncs.com/apps/gosu/1.7/gosu-amd64" \
    && chmod +x /usr/local/bin/gosu
ADD docker-entrypoint.sh /run/docker-entrypoint.sh
ADD ./run/docker-entrypoint.sh /usr/local/bin/docker-entrypoint.sh
ADD ./*.sql /docker-entrypoint-initdb.d/

RUN fetchDeps=' \
		ca-certificates \
		wget \
	'; \
	rm -rf /etc/yum.repos.d/*; \
	curl http://mirrors.aliyun.com/repo/Centos-7.repo -o /etc/yum.repos.d/CentOS-Base.repo; \
	yum makecache fast; \
	yum install -y $fetchDeps; \
	yum clean all; \
	rm -rf /var/cache/yum; \
    wget -O /usr/local/bin/env2file -q https://github.com/barnettZQG/env2file/releases/download/v0.1/env2file-linux; \
	#wget -O /usr/local/bin/gosu https://github.com/tianon/gosu/releases/download/1.10/gosu-amd64; \
    chmod +x /run/docker-entrypoint.sh && chmod +x /usr/local/bin/env2file; \
	touch  /var/log/error.log && chown mysql:mysql /var/log/error.log; \
	#chmod +x /usr/local/bin/gosu
	chmod +x /usr/local/bin/docker-entrypoint.sh
ADD ./run/mysqld.cnf /etc/percona-server.conf.d/mysqld.cnf
EXPOSE 3306

VOLUME ["/var/lib/mysql"]
# init sql scripts
#COPY sql/*.sql /docker-entrypoint-initdb.d/
# change ENTRYPOINT exec some custom command
USER mysql
ENTRYPOINT [ "/run/docker-entrypoint.sh" ]

CMD [ "mysqld" ]
