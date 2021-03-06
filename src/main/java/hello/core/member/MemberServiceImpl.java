package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//MemberService에 대한 구현체
@Component
public class MemberServiceImpl implements MemberService{

    //구현 객체 선택해주기
    //좌변은 인터페이스에 의존하지만, 우변은 구현체에 의존하게 된다 (DIP위반)
    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
