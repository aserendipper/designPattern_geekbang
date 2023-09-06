package com.part08.day69.code.two;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/9/6
 * @desc
 */
public class ToolApplication {

    public static void main(String[] args) {
        List<ResourceFile> resourceFiles = listAllResourceFiles(args[0]);
        for (ResourceFile resourceFile : resourceFiles) {
            Extractor extractor = ExtractorFactory.getExtractor(resourceFile.getType());
            extractor.extract2txt(resourceFile);
        }
    }
    
    public static List<ResourceFile> listAllResourceFiles(String resourceDirectory) {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        //...根据后缀（ppt、word、excel、txt）分别创建不同的类对象
        resourceFiles.add(new PPTFile("a.ppt"));
        resourceFiles.add(new WordFile("b.word"));
        resourceFiles.add(new WordFile("c.word"));
        return resourceFiles;
    }
}
