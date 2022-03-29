package com.company.HomeWorkApp4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE = 5;
    private static final char DOT_X = 'X';
    private static final char DOT_0 = '0';
    private static final char DOT_EMPTY = '*';
    private static final int WIN = 4;
    private static final char [][] MAP = new char[SIZE][SIZE];

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (isWin(DOT_X)) {
                System.out.println("Человек победил");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            computerTurn();
            printMap();
            if (isWin(DOT_0)){
                System.out.println("Компьютер победил");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья");
                break;
            }
        }
    }
    private static void humanTurn(){
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

            if(x < 0 || x >= SIZE || y < 0 || y >= SIZE){
                System.out.println("Данные введенны некорретно");
            } else if (MAP[x][y] != DOT_EMPTY) {
                System.out.println("Клетка уже занята");
            } else {
                break;
            }
        } while (true);

        MAP[x][y] = DOT_X;
    }

    private static boolean isWin(char symb){
        if (findRowsAndColumns(symb)) {
            return true;
        } else {
            return findDiagonals(symb);
        }
    }

    private static boolean findDiagonals( char symb){
        int diagonalCounter1 = 0;
        int diagonalCounter2 = 0;
        for (int i = 0; i < SIZE; i++) {
            if(MAP[i][i] == symb){
                diagonalCounter1 = diagonalCounter1 + 1;
            }
            if (MAP[i][MAP.length - 1 - i] == symb){
                diagonalCounter2 = diagonalCounter2 + 1;
            }
            if (diagonalCounter1 == WIN || diagonalCounter2 == WIN){
                return true;
            }
        }
        return false;
    }

    private static boolean findRowsAndColumns(char symb){
        for (int i = 0; i < SIZE; i++) {
            int rowCounter = 0;
            int colCounter = 0;
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == symb){
                    rowCounter = rowCounter + 1;
                } else {
                    rowCounter = 0;
                }
                if(MAP[j][i] == symb) {
                    colCounter = colCounter + 1;
                } else {
                    colCounter = 0;
                }
                if(rowCounter == WIN || colCounter == WIN){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean isMapFull(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }


    private static void computerTurn(){
        int x;
        int y;
        Random random = new Random();

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while(MAP[x][y] != DOT_EMPTY);
        MAP[x][y] = DOT_0;
    }


    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(MAP[i], DOT_EMPTY);
        }
    }

    private static void printMap(){
        printHeader();
        printBody();
    }
    private static void printHeader(){
        for (int i = 0; i <= SIZE; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else{
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }
    private static void printBody(){
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
