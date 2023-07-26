package com.onekosmos.kernel.blockid.javaPractice;

import java.sql.Array;
import java.util.ArrayList;

public class Practice {
    static String abc = "Hello";
    static String[] arr = new String[5];

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();
        for(int i=abc.length()-1;i>=0;i--){
//            System.out.println(arr[i]);
            output.append(abc.charAt(i));
        }
        System.out.println(output);
    }
}
