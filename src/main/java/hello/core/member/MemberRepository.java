package hello.core.member;

public interface MemberRepository {  //회원 저장소

    void save(Member member); //회원 저장

    Member findById(Long memberId); //회원 찾기
}
