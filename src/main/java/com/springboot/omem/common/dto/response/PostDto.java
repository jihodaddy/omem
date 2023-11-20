package com.springboot.omem.common.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
    private String url;
    private String title;
    private String content;
    private String author;
    private String imageUrl;
    private String publishDate;
}
