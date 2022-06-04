package com.bomstart.chapter04_mustache.web.dto;

import lombok.Getter;

import java.time.LocalDateTime;

import com.bomstart.chapter04_mustache.domain.post.Posts;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();    }
}
