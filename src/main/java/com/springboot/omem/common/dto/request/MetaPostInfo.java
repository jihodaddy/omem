package com.springboot.omem.common.dto.request;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MetaPostInfo {
    private String url;
    private String cardPath;
    private String title;
    private List<String> contents;
    private String imageUrl;
}
