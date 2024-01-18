public class Game {
    public boolean cheakDraft(Field fieldForCheck){        //Проверка ничьи
        for (int i = 0; i < fieldForCheck.getSize(); i++) {
            for (int j = 0; j < fieldForCheck.getSize(); j++) {
                if (fieldForCheck.map[i][j] == Field.EMPTY_FIELD){
                    return false;
                }

            }

        }
        return true;
    }
}
