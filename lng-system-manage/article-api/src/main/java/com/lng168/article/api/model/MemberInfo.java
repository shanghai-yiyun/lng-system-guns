package com.lng168.article.api.model;

import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("sys_member_info")
public class MemberInfo extends Model<MemberInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField("members_id")
    private Long membersId;
    /**
     * 会员所属企业，0无企业
     */
    @TableField("ent_id")
    private Integer entId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMembersId() {
        return membersId;
    }

    public void setMembersId(Long membersId) {
        this.membersId = membersId;
    }

    public Integer getEntId() {
        return entId;
    }

    public void setEntId(Integer entId) {
        this.entId = entId;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "MemberInfo{" +
        "id=" + id +
        ", membersId=" + membersId +
        ", entId=" + entId +
        "}";
    }
}
