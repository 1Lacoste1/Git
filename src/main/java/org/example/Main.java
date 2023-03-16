package org.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
Самые редкие байты
*/

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        byte[] buff = new byte[256];
        int curr = Integer.MAX_VALUE;

        try(FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                buff[fileInputStream.read()] += 1;
            }
        }

        for(int count : buff) {
            if(count > 0 && count < curr) {
                curr = count;
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < buff.length; i++) {
            if(buff[i] == curr) {
                arrayList.add(i);
            }
        }

        for(Integer num : arrayList)
            System.out.print(num + " ");

    }
}
