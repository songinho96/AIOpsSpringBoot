package com.project.backend.repository;



import com.project.backend.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {

    Member findByEmailAndPassword(String email, String password);

    List<Member> findAll();

    // 실제 회원가입 수행 쿼리 메서드

}
