package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int n = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("введите число");
        n = Integer.parseInt(reader.readLine());
        System.out.println(recursionMethod(n));

    }

    public static String recursionMethod(int n) {
        if (n == 0) {
            return "зачем тебе ноль?";
        }
        if (n == 1) {
            return "1";
        }
        return recursionMethod(n - 1) + " " + n;

    }

}
