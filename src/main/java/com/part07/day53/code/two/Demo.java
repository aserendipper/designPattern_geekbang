package com.part07.day53.code.two;

/**
 * @author aserendipper
 * @date 2023/8/14
 * @desc
 */
public class Demo {

    public static void main(String[] args) {
        /**
         * 
         */
        Directory fileSystemTree = new Directory("/");
        Directory node1 = new Directory("/node1");
        Directory node2 = new Directory("/node2");
        fileSystemTree.addSubNode(node1);
        fileSystemTree.addSubNode(node2);
        
        File file1 = new File("/node1/file1");
        File file2 = new File("/node1/file2");
        Directory dir3 = new Directory("/node1/node1");
        node1.addSubNode(file1);
        node1.addSubNode(file2);
        node1.addSubNode(dir3);
        
        File file3 = new File("/node2/file3");
        node2.addSubNode(file3);
        
        System.out.println(fileSystemTree.countNumOfFiles());
        System.out.println(fileSystemTree.countSizeOfFiles());
    }

}
