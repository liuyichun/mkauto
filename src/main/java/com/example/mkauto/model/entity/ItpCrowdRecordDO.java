package com.example.mkauto.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 人群圈选记录表
 * </p>
 *
 * @author mp-generator
 * @since 2022-01-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("itp_crowd_record")
public class ItpCrowdRecordDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 触达任务ID
     */
    @TableField("task_id")
    private Long taskId;

    /**
     * 手机号码, 加密
     */
    @TableField("phone")
    private String phone;

    /**
     * 标签标记，0. 未知 1. 黑名单 2. 流量方用户 
     */
    @TableField("label")
    private Integer label;

    /**
     * 流量提供方ID
     */
    @TableField("data_provider_id")
    private Integer dataProviderId;

    /**
     * 短信内容
     */
    @TableField("send_content")
    private String sendContent;

    /**
     * 错误码
     */
    @TableField("error_code")
    private String errorCode;

    /**
     * 失败原因
     */
    @TableField("error_msg")
    private String errorMsg;

    /**
     * 任务状态：0发送成功，1发送失败，2未知
     */
    @TableField("send_status")
    private Integer sendStatus;

    /**
     * 发送时间
     */
    @TableField("send_time")
    private LocalDateTime sendTime;

    /**
     * 完成时间
     */
    @TableField("finish_time")
    private LocalDateTime finishTime;

    /**
     * 创建人
     */
    @TableField("create_by")
    private Integer createBy;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;


}
