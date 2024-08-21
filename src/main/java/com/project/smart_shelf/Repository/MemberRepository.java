package com.project.smart_shelf.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.smart_shelf.Model.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    
}
