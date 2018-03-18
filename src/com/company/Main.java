package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        input();
    }

    public static void input() {
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        try {
            br.readLine();
            Integer.parseInt(br.readLine());
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Wrong format of date");
            try {
                Integer.parseInt(br.readLine());
            } catch (IOException e1) {
                e1.printStackTrace();

                System.out.println("Failed with two tries, dummy");
                System.exit(1);
            }
        }
    }
}
