package com.springboot.omem.common.utils;

import com.springboot.omem.common.dto.request.MetaPostInfo;
import com.springboot.omem.common.dto.response.PostDto;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class CrawlingUtils {
    private static final Map<String, Object> results = new HashMap<>();

    public static void parser(MetaPostInfo info) throws IOException {
        List<PostDto> list = new ArrayList<>();
        try {
            Document doc = Jsoup.connect(info.getUrl()).get();
            selectAllElements(doc.getAllElements());
//            traverseAndSelectElements(doc.select(info.getCardPath()));
            JSONObject json = new JSONObject();
            json.put("data", results);
            log.info("result: {}", json);

        } catch (Exception e){
            log.error(e.getMessage());
        }
    }

    public static void selectAllElements(Elements elements) throws Exception {
        if(elements.size() == 1) return;
        for (Element element : elements) {
            if(element.siblingElements().size() > 3) {
                Map<String, Object> el = new HashMap<>();
                List<Map<String, Object>> item = new ArrayList<>();
                element.siblingElements().forEach(v-> {
                    if(v.hasText()) {
                        el.put("text", v.text());
                    }else if(v.tagName().equals("a")) {
                        if(v.attr("href") != null && v.attr("href") != "#") {
                            el.put("url", v.attr("href") );
                        }
                    }else if(v.tagName().equals("img")) {
                        el.put("img", v.attr("src"));
                    }
//                    item.add(el);
                });
//                el.put(element.className(), item);
                results.put("class [" + element.className()+ "]", el);
            }
            Elements childElements = element.children();
            if (childElements.size() > 1) {
                selectAllElements(childElements);
            }
        }

    }

}