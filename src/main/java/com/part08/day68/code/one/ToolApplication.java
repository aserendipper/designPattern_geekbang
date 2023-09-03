package com.part08.day68.code.one;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aserendipper
 * @date 2023/9/3
 * @desc
 */
public class ToolApplication {

    public static void main(String[] args) {
        List<ResourceFile> resourceFiles = listAllResourceFiles(args[0]);
        for (ResourceFile resourceFile : resourceFiles) {
            resourceFile.extract2txt();
        }
    }
    
    private static List<ResourceFile> listAllResourceFiles(String resourceDirectory) {
        List<ResourceFile> resourceFiles = new ArrayList<>();
        //...根据后缀（pdf/ppt/word）使用不同的类解析文件，如：
        resourceFiles.add(new PdfFile("a.pdf"));
        resourceFiles.add(new WordFile("b.word"));
        resourceFiles.add(new PPTFile("c.ppt"));
        return resourceFiles;
    }
}
