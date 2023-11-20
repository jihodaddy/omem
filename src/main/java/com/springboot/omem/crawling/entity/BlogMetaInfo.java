package com.springboot.omem.crawling.entity;

import com.springboot.omem.common.entity.BaseEntity;
import com.springboot.omem.member.entity.Member;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "blog_meta_info")
public class BlogMetaInfo extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blog_meta_info_id", nullable = false)
    private Long id;

    private String url;
    private String title;
    private String author;
    private String category;
    private String contentPath;
    private String postPath;
    private String color;
    private String remark;

    private Date publishedDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
}
