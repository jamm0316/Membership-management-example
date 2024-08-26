package repository;

import domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);  //예외 시 다른 값 반환
    Optional<Member> findByName(String name);  //예외 시 다른 값 반환
    List<Member> findAll();  //키 값형태로 반환하기 위해 or 리스트 형태로 반환하기위해 그럼 왜 MAP 콜렉션을 쓰지 않는거지?
}
