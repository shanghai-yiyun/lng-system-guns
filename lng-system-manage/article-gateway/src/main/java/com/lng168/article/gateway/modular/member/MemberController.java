package com.lng168.article.gateway.modular.member;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lng168.article.api.IMemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/gateway/sys/member/")
@RestController
public class MemberController {

    @Reference(interfaceClass = IMemberService.class,check = false)
    private IMemberService memberService;
}
