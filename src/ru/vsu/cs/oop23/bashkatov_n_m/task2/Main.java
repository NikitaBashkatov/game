package ru.vsu.cs.oop23.bashkatov_n_m.task2;

import java.util.Scanner;

public class Main {
    private static final char[] playersSymbols = new char[] {'X', 'O'};
    private static final char emptySymbol = '.';


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        Field f = new Field(size);
        Player p = new Player();//(1)
        Game g = new Game();
        Bot b = new Bot();
        f.init();

        PlayerLogic first = p;     //полиморфизм
        PlayerLogic second = b;

        f.printMap(emptySymbol, playersSymbols);
        while (true) {
            Point m = first.think(new PlayerField(f, 1));//(1)
            f.set(m.getX(), m.getY(), 1);
            f.printMap(emptySymbol, playersSymbols);
            if (g.cheakDraft(f)) {
                System.out.println("Игра завершена.Ничья");
                break;
            }
            if (g.cheakDraft(f)) {
                System.out.println("Игра завершена.Ничья");
                break;
            }
            Point k = second.think(new PlayerField(f, 2));
            f.set(k.getX(), k.getY(),2);
            f.printMap(emptySymbol, playersSymbols);

            if (Game.checkWin(new PlayerField(f, 1))) {
                System.out.println("Победил первый");
                break;
            } else if (Game.checkWin(new PlayerField(f, 2))) {
                System.out.println("Победил второй");
                break;
            }
        }
    }
}


