import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();//....;
        Field f = new Field(size);
        f.init();
        Player p = new Player();//(1)
        Game g = new Game();

        f.printMap();
        while (true) {
            p.think(f);//(1)
            f.printMap();
            if (g.cheakDraft(f)) {
                System.out.println("Игра завершена.Ничья");
                break;
            }
            Bot.bot(f);
            f.printMap();
            if (g.cheakDraft(f)) {
                System.out.println("Игра завершена.Ничья");
                break;
            }
        }

    }
}
