package hello.core.member;

//회원가입, 회원조희 기능
public interface MemberService {

    //회원가입
    void join(Member member);

    //회원조회
    Member findMember(Long memberId);
}
