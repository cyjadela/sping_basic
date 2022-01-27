package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {


        //테스트 해보기 -> 자바로 구현 --> test/member/MemberServiceTest로 대신할 수 있음
        MemberService memberService=new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("member="+member.getName());
        System.out.println("findMember = "+findMember.getName());

    }
}
