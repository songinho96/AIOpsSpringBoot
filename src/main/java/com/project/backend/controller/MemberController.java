package com.project.backend.controller;

import com.project.backend.entity.Member;

import com.project.backend.repository.MemberRepository;
import com.project.backend.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RequiredArgsConstructor
@RestController
public class MemberController {


    private final MemberService memberService;
    private final MemberRepository memberRepository;

//    @GetMapping("/api/member")
//    public List<Member> login(
//    ){
//            return memberService.memberList();
//    }

    @PostMapping("/api/write")
    public String memberWrite(String email, String password, String username){
        System.out.println(email + password + username);

        return "";
    }


    @PostMapping("/api/login")
    public String login(@RequestBody Map<String, String> params){
        Member member = memberRepository.findByEmailAndPassword(params.get("email"), params.get("password"));

        System.out.println("member : " + member);

        System.out.println("1: " + params.get("email"));
        if(member != null) {
            return "pass";
        }
        return "error";

    }



//    // 1. 회원가입을 하기위한 연결 컨트롤러 구현 반환 값은 없음
//    @PostMapping("/join")
//    public void memberJoin(@RequestBody Map<String, String> map) {
//
////        member.getId();
////        member.getUsername();
////        member.getPassword();
////        member.getEmail();
//
//        System.out.println(" 1 : " + map.get("password"));
//        System.out.println(" type : " + map.get("password").getClass().getName());
//    }
//


//    @RequestMapping(value = "/api/signUp", method = RequestMethod.POST)
//    public String signUp(Member member){
//        memberService
//    }

    @PostMapping("/api/signUp")
    public Member signUp(@RequestBody Map<String, String> params){
        Member member = new Member();
        member.setEmail(params.get("email"));
        member.setPassword(params.get("password"));
        member.setUsername(params.get("username"));
        System.out.println(params.get("email"));
        memberService.signUser(member);
        return member;
    }
}

