package com.springboot.omem.common.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;

import java.util.List;
import java.util.Map;

@Slf4j
public class StringUtil {

    public static JSONObject convertListToJSON(List<Map<String,Object>> list) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JSONObject json = new JSONObject();
        json.put("data", list);
        log.info(json.toString());
        return json;
    }
}
