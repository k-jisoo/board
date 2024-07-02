package com.sparta.memo.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardRequestDto {
    private String title;
    private String username;
    private String contents;
    private String password;
    private LocalDateTime modifiedAt;

    public BoardRequestDto(String title, String username, String contents, String password, LocalDateTime modifiedAt) {
        this.title = title;
        this.username = username;
        this.contents = contents;
        this.password = password;
        this.modifiedAt = modifiedAt;
    }
}
