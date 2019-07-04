package com.lng168.article.api.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lng168
 * @since 2019-07-04
 */
@TableName("sys_member")
public class Member extends Model<Member> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 密码
     */
    private String password;
    /**
     * 昵称
     */
    private String nickname;
    private Date timei;
    private Date timeu;
    /**
     * 最后一次在线时间
     */
    @TableField("app_last_online_time")
    private Date appLastOnlineTime;
    /**
     * 推荐号
     */
    @TableField("referral_code")
    private String referralCode;
    /**
     * 会员级别 0:游客;1:试用期有效会员;2:会员;3:过期会员;
     */
    @TableField("member_level")
    private Integer memberLevel;
    /**
     * 截止日期
     */
    @TableField("closing_date")
    private Date closingDate;
    /**
     * 头像
     */
    @TableField("pic_path")
    private String picPath;
    /**
     * uuid
     */
    private String uuid;
    /**
     * 是否推送:0,否;1,是;
     */
    @TableField("is_reminding")
    private Integer isReminding;
    /**
     * 签名
     */
    private String autograph;
    private String openid;
    /**
     * 0：模拟用户，1：真实用户
     */
    private Integer type;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getTimei() {
        return timei;
    }

    public void setTimei(Date timei) {
        this.timei = timei;
    }

    public Date getTimeu() {
        return timeu;
    }

    public void setTimeu(Date timeu) {
        this.timeu = timeu;
    }

    public Date getAppLastOnlineTime() {
        return appLastOnlineTime;
    }

    public void setAppLastOnlineTime(Date appLastOnlineTime) {
        this.appLastOnlineTime = appLastOnlineTime;
    }

    public String getReferralCode() {
        return referralCode;
    }

    public void setReferralCode(String referralCode) {
        this.referralCode = referralCode;
    }

    public Integer getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Integer memberLevel) {
        this.memberLevel = memberLevel;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getIsReminding() {
        return isReminding;
    }

    public void setIsReminding(Integer isReminding) {
        this.isReminding = isReminding;
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Member{" +
        "id=" + id +
        ", mobile=" + mobile +
        ", password=" + password +
        ", nickname=" + nickname +
        ", timei=" + timei +
        ", timeu=" + timeu +
        ", appLastOnlineTime=" + appLastOnlineTime +
        ", referralCode=" + referralCode +
        ", memberLevel=" + memberLevel +
        ", closingDate=" + closingDate +
        ", picPath=" + picPath +
        ", uuid=" + uuid +
        ", isReminding=" + isReminding +
        ", autograph=" + autograph +
        ", openid=" + openid +
        ", type=" + type +
        "}";
    }
}
