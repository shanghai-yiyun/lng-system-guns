package com.lng168.article.rest.modular.member;

import com.lng168.article.api.IMemberService;
import com.lng168.article.api.model.Member;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lng168.article.rest.common.persistence.dao.MemberMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lng168
 * @since 2019-07-04
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements IMemberService {

}
