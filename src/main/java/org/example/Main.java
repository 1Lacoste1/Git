package org.example;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Реверс файла
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        ArrayList<Integer> arrayList = new ArrayList<>();

        try(FileInputStream fileInputStream = new FileInputStream(fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(fileName)
        ) {
            while (fileInputStream.available() > 0) {
                int count = fileInputStream.read();
                arrayList.add(count);
            }

            Collections.reverse(arrayList);

            for(Integer i : arrayList) {
                fileOutputStream.write(i);
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
