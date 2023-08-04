package com.part06.day44.code.four;

import com.part06.day44.code.one.IRuleConfigParser;
import com.part06.day44.code.one.RuleConfig;
import com.part06.day44.code.three.IRuleConfigParserFactory;

/**
 * @author aserendipper
 * @date 2023/8/1
 * @desc
 */
public class RuleConfigSource {
    
    private RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        
        IRuleConfigParserFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);
        if (parserFactory == null) {
            throw new RuntimeException("Rule config file format is not supported: " + ruleConfigFilePath);
        }
        IRuleConfigParser parser = parserFactory.createParser();
        String configText = "";
        // ...从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }
    
    private String getFileExtension(String filePath) {
        // ...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
}
