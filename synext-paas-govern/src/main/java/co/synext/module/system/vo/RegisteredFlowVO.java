package co.synext.module.system.vo;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * TRegisteredFlowVO对象
 * </p>
 *
 * @author xu.ran
 * @since 2020-09-10
 */
@Data
@Accessors(chain = true)
@ApiModel(value="TRegisteredFlowVO对象", description="注册流程,关联t_user和t_org,有专家注册和企业注册,企业注册.注册成功之后,短信通知")
public class RegisteredFlowVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
    * id主键
    */
    @ApiModelProperty(value = "1-id主键" )
    private String id;
    /**
    * URL路径中的部门类型,例如 URL路径中的 kjj 
    */
    @ApiModelProperty(value = "2-URL路径中的部门类型,例如 URL路径中的 kjj " )
    private String orgTypePathKey;
    /**
    * 用户ID
    */
    @ApiModelProperty(value = "3-用户ID" )
    private String userId;
    /**
    * 用户类型:1注册企业,2企业个人,3专家
    */
    @ApiModelProperty(value = "4-用户类型:1注册企业,2企业个人,3专家" )
    private String userType;
    /**
    * 业务模块名称,例如专家注册
    */
    @ApiModelProperty(value = "5-业务模块名称,例如专家注册" )
    private String businessModule;
    /**
    * 创建时间
    */
    @ApiModelProperty(value = "6-创建时间" )
    private LocalDateTime createTime;
    /**
    * 提交时间
    */
    @ApiModelProperty(value = "7-提交时间" )
    private LocalDateTime submitTime;
    /**
    * 审批时间
    */
    @ApiModelProperty(value = "8-审批时间" )
    private LocalDateTime approvalDate;
    /**
    * 审批人员ID
    */
    @ApiModelProperty(value = "9-审批人员ID" )
    private String approvalUserId;
    /**
    * 驳回时间
    */
    @ApiModelProperty(value = "10-驳回时间" )
    private LocalDateTime rejectionDate;
    /**
    * 驳回说明
    */
    @ApiModelProperty(value = "11-驳回说明" )
    private String rejectionDescription;
    /**
    * 上报状态:0已填写未提交,1已提交,2,已审核,3已驳回,6已超期
    */
    @ApiModelProperty(value = "12-上报状态:0已填写未提交,1已提交,2,已审核,3已驳回,6已超期" )
    private Integer status;
    /**
    * 排序,查询时倒叙排列
    */
    @ApiModelProperty(value = "13-排序,查询时倒叙排列" )
    private Integer sortno;
    /**
    * 是否有效(0否,1是)
    */
    @ApiModelProperty(value = "14-是否有效(0否,1是)" )
    private Integer active;

}
