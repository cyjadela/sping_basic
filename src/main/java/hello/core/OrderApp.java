package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

//test
public class OrderApp {
    public static void main(String[] args) {


        //테스트 해보기 -> 자바로 구현 --> test/member/MemberServiceTest로 대신할 수 있음
        MemberService memberService=new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId=1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"itemA",10000);

        System.out.println("order="+order);
//        System.out.println("order.calculatePrice = "+order.calculatePrcie());


    }
}
