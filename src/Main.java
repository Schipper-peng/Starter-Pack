//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Player one = new Player(25, "Oleg" );
            Player two = new Player(17, "Slava" );
        System.out.println(one.play());
        System.out.println(two.play());
    }
    public static class Player {
        int age;
        String name;

        public Player(int age, String name) {
            this.age = age;
            this.name = name;
        }
        public int play() {
            int total;
            total = age + age;
            return total;
        }
    }
}