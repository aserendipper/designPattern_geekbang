package com.part06.day44.code.five;

import com.part06.day44.code.one.IRuleConfigParser;
import com.part06.day44.code.one.JsonRuleConfigParser;

/**
 * @author aserendipper
 * @date 2023/8/4
 * @desc
 */
public class JsonConfigParserFactory implements IConfigParserFactory {

    @Override
    public IRuleConfigParser createRuleParser() {
        return new JsonRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new JsonSystemConfigParser();
    }
}
