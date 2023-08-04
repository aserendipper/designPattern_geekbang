package com.part06.day44.code.three;

import com.part06.day44.code.one.IRuleConfigParser;
import com.part06.day44.code.one.JsonRuleConfigParser;

/**
 * @author aserendipper
 * @date 2023/8/4
 * @desc
 */
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
