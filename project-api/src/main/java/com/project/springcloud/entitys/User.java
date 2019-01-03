package com.project.springcloud.entitys;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author conlon123
 * @since 2019-01-01
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 用户昵称
     */
    private String nickname;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 用户职业 parameter user_occupation_list
     */
    @TableField("user_occupation")
    private Integer userOccupation;
    /**
     * 用户状态(暂未使用)
     */
    @TableField("user_status")
    private Integer userStatus;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 暂未使用
     */
    @TableField("create_device")
    private Integer createDevice;
    /**
     * 用户级别
     */
    @TableField("user_type")
    private String userType;
    /**
     * 用户的标识
     */
    @TableField("open_id")
    private String openId;
    /**
     * 用户的性别，值为1时是男性，值为2时是女性，值为0时是未知
     */
    private String sex;
    /**
     * 用户所在城市
     */
    private String city;
    /**
     * 用户所区域(详细地址)
     */
    private String area;
    /**
     * 用户所在省份
     */
    private String province;
    /**
     * 到店距离 parameter user_distance_list
     */
    private String distance;
    /**
     * 只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段。
     */
    private String unionid;
    /**
     * 冻结创建的时间
     */
    @TableField("freeze_time")
    private Date freezeTime;
    /**
     * 登录失败次数
     */
    @TableField("fail_times")
    private Integer failTimes;
    private Long version;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
