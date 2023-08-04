package com.part06.day44.code.four;

import com.part06.day44.code.three.IRuleConfigParserFactory;
import com.part06.day44.code.three.JsonRuleConfigParserFactory;
import com.part06.day44.code.three.XmlRuleConfigParserFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aserendipper
 * @date 2023/8/4
 * @desc
 */
public class RuleConfigParserFactoryMap {
    private static final Map<String, IRuleConfigParserFactory> cachedFactories = new HashMap<>();
    
    static {
        cachedFactories.put("json", new JsonRuleConfigParserFactory());
        cachedFactories.put("xml", new XmlRuleConfigParserFactory());
    }
    
    public static IRuleConfigParserFactory getParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        return cachedFactories.get(type.toLowerCase());
    }
}
