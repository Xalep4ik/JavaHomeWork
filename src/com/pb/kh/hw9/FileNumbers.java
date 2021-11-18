package com.pb.kh.hw9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {


    public static void createNumbersFile(){
        Random random = new Random();
        Path path = Paths.get("file\\numbers.txt");


        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            File nums = new File("D:\\JavaHomeWork\\file\\numbers.txt");

            int sizeI = 10;
            int sizeJ = 10;
            int[][] array = new int[sizeI][sizeJ];

            for (int i = 0; i < sizeI; i++) {
                for (int j = 0; j < sizeJ; j++) {
                    array[i][j] = random.nextInt(99);
                }
            }
            for (int i = 0; i < sizeI; i++) {
                for (int j = 0; j < sizeJ; j++) {
                    System.out.print(" " + array[i][j]);
                }
                System.out.print("\n");
            }
            writer.write(array.toString());

        } catch (Exception ex) {
            System.out.println("Error with file write: " + ex);
        }
        System.out.println("Write to file \"" + path.toAbsolutePath() + "\" done!");
    }
    public static void createOddNumbersFile(){
        //if (n % 2 == 0) n = 0 замена четных
    }


    public static void main(String[] args) {

        createNumbersFile();

        }


}

