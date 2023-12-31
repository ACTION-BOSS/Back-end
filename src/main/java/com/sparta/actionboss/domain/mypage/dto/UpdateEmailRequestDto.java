package com.sparta.actionboss.domain.mypage.dto;

import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateEmailRequestDto {
    @Email(message = "올바른 이메일 형식이 아닙니다.")
    private String email;
}
