package com.sparta.actionboss.global.exception;

import com.sparta.actionboss.global.exception.errorcode.ClientErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class MyPageException extends RuntimeException {
    private final ClientErrorCode errorCode;
}
