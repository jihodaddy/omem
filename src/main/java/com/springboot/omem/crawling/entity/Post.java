package com.springboot.omem.crawling.entity;

import com.springboot.omem.common.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Post extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id", nullable = false)
    private Long id;

    private String title;
    private String content;
    private String url;
    private String imageUrl;
    private String author;

}
