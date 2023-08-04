package com.part06.day44.code.five;

import com.part06.day44.code.one.IRuleConfigParser;
import com.part06.day44.code.one.XmlRuleConfigParser;

/**
 * @author aserendipper
 * @date 2023/8/4
 * @desc
 */
public class XmlConfigParserFactory implements IConfigParserFactory {

    @Override
    public IRuleConfigParser createRuleParser() {
        return new XmlRuleConfigParser();
    }

    @Override
    public ISystemConfigParser createSystemParser() {
        return new XmlSystemConfigParser();
    }
}
