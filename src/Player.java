import java.util.Scanner;

public class Player {
    static Scanner scanner;
    public void think(Field field){
        int x,y;
        do {
            System.out.println("Ход игрока: ");
            scanner = new Scanner(System.in);
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        }while(!field.isCellValid(x, y));
        field.map[x][y] = Field.X_FIELD;
    }
}