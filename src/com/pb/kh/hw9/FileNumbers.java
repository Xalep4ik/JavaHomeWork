package com.pb.kh.hw9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {



    public static void createNumbersFile(){

        Random random = new Random();

        Path path = Paths.get("file\\numbers.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {

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
                    writer.write(String.valueOf(array[i][j])+" ");
                }
                writer.newLine();

                System.out.print("\n");
            }
        } catch (Exception ex) {
            System.out.println("Не вышло записать файл :" + ex);
        }
        System.out.println("Файл создан!");
    }

    public static void createOddNumbersFile(){

        File fileIn = new File("file\\numbers.txt");

        if (fileIn.exists()){
            try {
                Scanner scan  = new Scanner(fileIn);
                Writer writer = new FileWriter("file\\odd-numbers.txt");
                while (scan.hasNextInt()){

                    Integer integer = scan.nextInt();
                    if ( integer % 2 == 0) {
                        writer.write("0");
                    }
                    else {
                        writer.write(integer.toString());
                    }
                    if (scan.hasNextInt()){
                        writer.write(" ");
                    }
                }
                writer.close();
                scan.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Файл успешно перезаписан !");
        }
    }


    public static void main(String[] args) {

        createNumbersFile();

        createOddNumbersFile();

        }


}

