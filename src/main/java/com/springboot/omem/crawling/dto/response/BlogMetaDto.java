package com.springboot.omem.crawling.dto.response;

import lombok.*;

import java.util.List;
import java.util.Map;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BlogMetaDto {
    List<Detail> details;

    public static class Detail {
        private String  rootPath;
        private List<Map<String, Object>> text;
        private List<Map<String, Object>> url;
    }
}
