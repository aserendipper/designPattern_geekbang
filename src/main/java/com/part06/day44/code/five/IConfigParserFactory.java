package com.part06.day44.code.five;

import com.part06.day44.code.one.IRuleConfigParser;

/**
 * @author aserendipper
 * @date 2023/8/4
 * @desc
 */
public interface IConfigParserFactory {
    IRuleConfigParser createRuleParser();
    ISystemConfigParser createSystemParser();
}
