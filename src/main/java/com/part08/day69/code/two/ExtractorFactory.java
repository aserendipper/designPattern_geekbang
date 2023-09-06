package com.part08.day69.code.two;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aserendipper
 * @date 2023/9/6
 * @desc
 */
public class ExtractorFactory {
    private static final Map<ResourceFileType, Extractor> extractors = new HashMap<>();
    
    static {
        extractors.put(ResourceFileType.PPT, new PPTExtractor());
        extractors.put(ResourceFileType.WORD, new WordExtractor());
        extractors.put(ResourceFileType.PDF, new PdfExtractor());
    }
    
    public static Extractor getExtractor(ResourceFileType type) {
        return extractors.get(type);
    }
}
