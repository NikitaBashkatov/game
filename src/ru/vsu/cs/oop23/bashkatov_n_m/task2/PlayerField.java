package ru.vsu.cs.oop23.bashkatov_n_m.task2;

public class PlayerField {
    private Field f;
    private int player;

    public PlayerField(Field f, int player) {
        this.f = f;
        this.player = player;
    }

    public boolean isCellEmpty(int x, int y){     //пуста ячейка или не пуста
        if (f.get(x,y) == 0){
            return true;
        }
        return false;
    }

    public boolean isMine(int x, int y){
        if (f.get(x, y) == player){
            return true;
        }
        return false;
    }

    public boolean isOpponent(int x,int y){
        if (!isCellEmpty(x,y) && !isMine(x,y)){
            return true;
        }
        return false;
    }

    public int getSize(){
        return f.getSize();
    }



}
