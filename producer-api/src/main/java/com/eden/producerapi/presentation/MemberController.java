package com.eden.producerapi.presentation;

import com.eden.producerapi.application.MemberCreateRequest;
import com.eden.producerapi.application.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/member")
    public ResponseEntity<Void> createMember(@RequestBody MemberCreateRequest memberCreateRequest) {
        memberService.createMember(memberCreateRequest);
        return ResponseEntity.status(201).build();
    }
}
