package com.sparta.actionboss.domain.auth.repository;

import com.sparta.actionboss.domain.auth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByNickname(String nickName);

    Optional<User> findByKakaoId(Long kakaoId);
}
