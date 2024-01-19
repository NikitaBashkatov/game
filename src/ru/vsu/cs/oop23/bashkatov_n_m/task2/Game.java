package ru.vsu.cs.oop23.bashkatov_n_m.task2;

public class Game {
    public boolean cheakDraft(Field fieldForCheck){        //Проверка ничьи
        for (int i = 0; i < fieldForCheck.getSize(); i++) {
            for (int j = 0; j < fieldForCheck.getSize(); j++) {
                if (fieldForCheck.map[i][j] == fieldForCheck.EMPTY_FIELD){
                    return false;
                }
            }
        }
        return true;
    }


                                        //проверка победы
    //boolean checkWin(ru.vsu.cs.oop23.bashkatov_n_m.task2.Field fieldForWin) {

    //}


    public static boolean checkWin(PlayerField pf) {
        int diag1, diag2, hor, ver;
        for (int i = 0; i < pf.getSize(); i++) {
            hor = 0; ver = 0;
            for (int j = 0; j < pf.getSize(); j++) {
                if (pf.isMine(i,j)) {
                    hor++;
                }
                if (pf.isMine(j, i)) {
                    ver++;
                }
            }
            if (hor == pf.getSize()|| ver == pf.getSize()) {
                return true; //проверка по горизонтали и вертикали
            }
        }
        diag1 = 0; diag2 = 0;
        for (int i = 0; i < pf.getSize(); i++) {
            if (pf.isMine(i, i)) {
                diag1++;
            }
            if (pf.isMine(pf.getSize() - i - 1, i)) {
                diag2++;
            }
        }
        if (diag1 == pf.getSize() || diag2 == pf.getSize()) {
            return true; //проверка по диагоналям
        }
        return false;
    }
}
