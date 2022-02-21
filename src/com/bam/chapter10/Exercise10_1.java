package com.bam.chapter10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Exercise10_1 {

    public static void main(String[] args) {

        String pattern = "yyyy-MM-dd";
        DateFormat df = new SimpleDateFormat(pattern);

        for (int i = 1; i <= 12; i++) {
            System.out.println(df);
        }
    }
}
