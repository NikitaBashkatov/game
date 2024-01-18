public class Bot {
    public static void bot(Field field) {
        int x, y;
        System.out.println("Ход компьютера: ");
        do {
            x = (int) (Math.random() * field.getSize());
            y = (int) (Math.random() * field.getSize());
        } while (!field.isCellValid(x, y));
        field.map[y][x] = Field.O_FIELD;
    }
}