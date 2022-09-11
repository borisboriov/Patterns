package com.boris.patterns.Structural_patterns.Decorator;

import lombok.SneakyThrows;

import java.io.FileOutputStream;
import java.util.zip.GZIPOutputStream;

public class Decorator {

    @SneakyThrows
    public static void main(String[] args) {

        GZIPOutputStream gzipOutputStream = new GZIPOutputStream(new FileOutputStream("file.gzip"));

        String string = "Something useful";

        gzipOutputStream.write(string.getBytes());
    }
}
