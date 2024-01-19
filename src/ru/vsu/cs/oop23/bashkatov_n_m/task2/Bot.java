package ru.vsu.cs.oop23.bashkatov_n_m.task2;

public class Bot implements PlayerLogic {
    @Override
    public Point think(PlayerField field) {
        int x, y;
        System.out.println("Ход компьютера: ");
        do {
            x = (int) (Math.random() * field.getSize());
            y = (int) (Math.random() * field.getSize());
        } while (!field.isCellEmpty(x, y));
        //field.map[y][x] = Field.O_FIELD;

        return new Point(x, y);
    }
}