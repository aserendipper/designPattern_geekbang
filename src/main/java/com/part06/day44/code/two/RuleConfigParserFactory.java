package com.part06.day44.code.two;

import com.part06.day44.code.one.IRuleConfigParser;
import com.part06.day44.code.one.JsonRuleConfigParser;
import com.part06.day44.code.one.XmlRuleConfigParser;

/**
 * @author aserendipper
 * @date 2023/8/4
 * @desc
 */
public class RuleConfigParserFactory {
    public static IRuleConfigParser createParser(String configFormat) {
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else {
            // ...其他解析器
        }
        return parser;
    }
}
