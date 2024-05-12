import java.util.Scanner;

public class latihan_5 {
    public static void main(String[] args) {
        // Variabel y1 dan y2
        int y1 = 6;
        int y2 = 2;

        // Perhitungan X1 dan X2
        double X1 = (y1 + y2) * (y1 + y2);
        double X2 = (y1 % 4) * y2;

        // Print hasil evaluasi
        System.out.println("Evaluasi ke 1 = " + Boolean.toString(X1 >= X2));
        System.out.println("Evaluasi ke 2 = " + Boolean.toString(X2 >= X1));
        System.out.println("Evaluasi ke 3 = " + Boolean.toString(X1 % 4 == ++X2 % 5));
    }
}
