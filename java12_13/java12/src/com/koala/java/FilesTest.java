package com.koala.java;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * day05：Files新增方法
 * Create by koala on 2021-08-09
 */
public class FilesTest {

    //使用IDEA的单元测试方法，默认的相对路径是在当前module下
    //IO : File
    //NIO 2 : Files操作本地文件的工具类  ； Path:替换原有的File ; Paths :实例化Path
    @Test
    public void testFilesMismatch() throws IOException {
        FileWriter fileWriter = new FileWriter("tmp\\a.txt");
        fileWriter.write("a");
        fileWriter.write("b");
        fileWriter.write("c");
        fileWriter.close();

        FileWriter fileWriterB = new FileWriter("tmp\\b.txt");
        fileWriterB.write("a");
        fileWriterB.write("b");//试试改成 1，看看结果如何
        fileWriterB.write("c");
        fileWriterB.close();

        System.out.println(Files.mismatch(Path.of("tmp/a.txt"),Path.of("tmp/b.txt")));
    }

}
