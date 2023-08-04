package com.part06.day44.code.three;

import com.part06.day44.code.one.IRuleConfigParser;

/**
 * @author aserendipper
 * @date 2023/8/4
 * @desc
 */
public interface IRuleConfigParserFactory {
    IRuleConfigParser createParser();
}
