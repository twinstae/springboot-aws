package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

// 데이터 전송용 객체
// Data Transfer Object
// 자기 역할이 거의 없고... 정말 데이터를 담기 위한 객체에요

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
