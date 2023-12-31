package com.sparta.actionboss.domain.auth.dto;

import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CheckEmailRequestDto {
    @Email(message = "올바른 이메일 형식이 아닙니다.")
    private String email;
    private String successKey;
}
