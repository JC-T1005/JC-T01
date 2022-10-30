package demo1;
//1到100之间的数,逢7就过
public class SevenGuo {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}