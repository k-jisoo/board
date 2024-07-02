package com.sparta.memo.dto;

import com.sparta.memo.entity.Board;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardResponseDto {
    private Long id;
    private String title;
    private String username;
    private String contents;
    private LocalDateTime modifiedAt;

    public BoardResponseDto(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.username = board.getUsername();
        this.contents = board.getContents();
        this.modifiedAt = board.getModifiedAt();
    }

    public BoardResponseDto(Long id, String title, String username, String contents, LocalDateTime modifiedAt) {
        this.id = id;
        this.title = title;
        this.username = username;
        this.contents = contents;
        this.modifiedAt = modifiedAt;
    }
}
