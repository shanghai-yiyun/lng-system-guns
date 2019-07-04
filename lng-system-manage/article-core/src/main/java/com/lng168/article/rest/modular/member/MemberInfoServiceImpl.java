package com.lng168.article.rest.modular.member;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.lng168.article.api.IMemberInfoService;
import com.lng168.article.api.model.MemberInfo;
import com.lng168.article.rest.common.persistence.dao.MemberInfoMapper;
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
public class MemberInfoServiceImpl extends ServiceImpl<MemberInfoMapper, MemberInfo> implements IMemberInfoService {

}
