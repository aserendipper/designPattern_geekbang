package com.part06.day44.code.one;

/**
 * @author aserendipper
 * @date 2023/8/1
 * @desc
 */
public class RuleConfigSource1 {
    
    private RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = createParser(ruleConfigFileExtension);
        if (parser == null) {
            throw new RuntimeException("Rule config file format is not supported: " + ruleConfigFilePath);
        }
        String configText = "";
        // ...从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }
    
    private String getFileExtension(String filePath) {
        // ...解析文件名获取扩展名，比如rule.json，返回json
        return "json";
    }
    
    private IRuleConfigParser createParser(String configFormat) {
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
