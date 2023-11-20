package com.springboot.omem.crawling.dto.request;

import com.springboot.omem.crawling.entity.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostRequestDto {
    private String title;
    private String content;
    private String url;
    private String imageUrl;
    private String author;

    @Builder
    public PostRequestDto(String title, String content, String url, String imageUrl, String author) {
        this.title = title;
        this.content = content;
        this.url = url;
        this.imageUrl = imageUrl;
        this.author = author;
    }

    public Post toEntity() {
        return Post.builder()
                .title(title)
                .content(content)
                .url(url)
                .imageUrl(imageUrl)
                .author(author)
                .build();
    }
}
