import java.util.Scanner;

public class latihan_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("P1 = ");
        double phi = scanner.nextDouble();

        System.out.print("r = ");
        double r = scanner.nextDouble();

        double luas = phi * r * r;
        System.out.printf("Luas lingkaran yaitu %,.3f\n", luas);
    }
}
