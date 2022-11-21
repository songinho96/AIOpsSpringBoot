package com.project.backend.service;

import com.project.backend.entity.Member;
import com.project.backend.repository.ChartRepository;
import com.project.backend.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> memberList() {
        return memberRepository.findAll();
    }

    // 회원 등록
    public void signUser(Member member){
        memberRepository.save(member);
    }




    // 1. 회원가입을 하기위한 실제 비즈니스 로직

    // 1. 회원가압이니까 일단 딱히 반환할 값은 없음
    // 2. 회원가입을 위한 회원데이터가 요청되면 해당 데이터를 멤버 객체의 필드에 연결시켜 DB에 Insert




}
