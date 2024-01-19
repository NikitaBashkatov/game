package ru.vsu.cs.oop23.bashkatov_n_m.task2;

import java.util.Scanner;

public class Field {

       int[][] map;
       int g = X_FIELD & O_FIELD;
     int getSize() {
        return size;
    }
    final int size;
    static final int EMPTY_FIELD = 0;
    static final int X_FIELD = 1;
    static final int O_FIELD = 2;
    //static final char dot = O_FIELD & X_FIELD;
    public Field(int s) {
        this.size = s;
    }

        public void init () {
            map = new int[getSize()][getSize()];
            for (int i = 0; i < getSize(); i++) {
                for (int j = 0; j < getSize(); j++) {
                    map[i][j] = EMPTY_FIELD;
                }
            }
        }
        public boolean isCellValid(int x, int y){    //проверяет можно ли ходить в клетку
            if (x < 0 || y < 0 || x >= getSize() || y >= getSize()){
                return false;
            }
            if (map[y][x] != EMPTY_FIELD){
                return false;
            }
            return true;
        }

    public int get(int x,int y) {
        return map[y][x];
    }
    public void set(int x,int y,int v) {
        map[y][x] = v;
    }


    public void printMap(char empty, char[] players){
            for (int i = 0; i <= getSize(); i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < getSize(); i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < getSize(); j++){
                    //players[0]
                    if (map[i][j] == 0){
                        System.out.print(empty);
                    } else {
                        int n = map[i][j];
                        System.out.print(players[n-1]);
                    }
                    System.out.print( " ");
                }
                System.out.println();
            }
            System.out.println();
        }

}