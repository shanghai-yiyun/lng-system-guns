package com.lng168.article.rest.modular.auth.validator.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.lng168.article.api.model.Member;
import com.lng168.article.rest.common.persistence.dao.MemberMapper;
import com.lng168.article.rest.modular.auth.validator.IReqValidator;
import com.lng168.article.rest.modular.auth.validator.dto.Credence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 账号密码验证
 *
 * @author fengshuonan
 * @date 2017-08-23 12:34
 */
@Service
public class DbValidator implements IReqValidator {

    @Autowired
    MemberMapper memberMapper;

    @Override
    public boolean validate(Credence credence) {
        List<Member> users = memberMapper.selectList(new EntityWrapper<Member>().eq("mobile", credence.getCredenceName()));
        if (users != null && users.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
}
