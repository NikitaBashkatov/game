import java.util.Scanner;

public class Field {
    static Scanner scanner;
     char [][] map;
     int getSize() {
        return size;
    }
    final int size;
    static final char EMPTY_FIELD = '*';
    static final char X_FIELD = 'X';
    static final char O_FIELD = 'O';
    public Field(int s) {
        this.size = s;
    }

        public void init () {
            map = new char [getSize()] [getSize()];
            for (int i = 0; i < getSize(); i++) {
                for (int j = 0; j < getSize(); j++) {
                    map[i][j] = EMPTY_FIELD;
                }
            }
            scanner = new Scanner(System.in);
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

        public void printMap(){
            for (int i = 0; i <= getSize(); i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < getSize(); i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < getSize(); j++){
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

}