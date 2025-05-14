package com.mycompany.liboon;

public class Liboon {

    public static void main(String[] args) {
        int[][] multTable = new int [11] [11];

        for (int x = 1; x < 11; x++) { 
            for (int y = 0; y < 11; y++){
                multTable[y][x] = y * x;
            }
           }
        
        for (int y = 1; y < 11; y++){
            for (int x = 1; x < 11; x++){
                System.out.printf("%4d", multTable[y][x]);
            }
            System.out.println();
        }
        }
    }
