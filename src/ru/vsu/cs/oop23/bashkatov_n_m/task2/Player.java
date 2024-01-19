package ru.vsu.cs.oop23.bashkatov_n_m.task2;

import java.util.Scanner;

public class Player implements PlayerLogic {
    static Scanner scanner;

    @Override
    public Point think(PlayerField field){
        int x,y;
        do {
            System.out.println("Ход игрока: ");
            scanner = new Scanner(System.in);
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }while(!field.isCellEmpty(x, y));
        //field.map[x][y] = Field.X_FIELD;
        return new Point(x, y);
    }
}