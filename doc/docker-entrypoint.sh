#!/bin/bash
# do something before mysql start
[[ $DEBUG ]] && set -x
# create server_id
# server_id=${HOSTNAME#*-}
# MYSQLC_MYSQLD_SERVER_ID=`expr $server_id + ${STEP_NUM:-0}`
# export MYSQLC_MYSQLD_SERVER_ID
#change mod for err.log
# [[ ! -f /var/log/mysql/error.log ]] && touch /var/log/mysql/error.log
# chmod 0777 /var/log/mysql/error.log
[[ $PAUSE ]] && sleep $PAUSE
## read env and create mysql config file
#/usr/local/bin/env2file create --format mysql --path /etc/my.cnf.d/custom.cnf
# start mysql
exec /usr/local/bin/docker-entrypoint.sh "$@"
