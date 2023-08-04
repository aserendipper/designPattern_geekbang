package com.part06.day44.code.two;

import com.part06.day44.code.one.IRuleConfigParser;
import com.part06.day44.code.one.JsonRuleConfigParser;
import com.part06.day44.code.one.XmlRuleConfigParser;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aserendipper
 * @date 2023/8/4
 * @desc
 */
public class RuleConfigParserFactory1 {
    private static final Map<String, IRuleConfigParser> cachedParsers = new HashMap<>();
    
    static {
        cachedParsers.put("json", new JsonRuleConfigParser());
        cachedParsers.put("xml", new XmlRuleConfigParser());
    }
    
    public static IRuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            return null;
        }
        return cachedParsers.get(configFormat.toLowerCase());
    }
}
