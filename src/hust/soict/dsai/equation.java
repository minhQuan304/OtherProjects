package hust.soict.dsai;
import java.util.Scanner;

public class equation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Giải phương trình bậc nhất với một biến ===");
        System.out.print("Nhập a (hệ số): ");
        double a = scanner.nextDouble();
        
        if (a == 0) {
            System.out.println("Phương trình không hợp lệ vì a không thể bằng 0.");
        } else {
            System.out.print("Nhập b (hằng số): ");
            double b = scanner.nextDouble();
            double x = -b / a;
            System.out.println("Giải của phương trình " + a + "x + " + b + " = 0 là: x = " + x);
        }
        
        System.out.println("\n=== Giải hệ phương trình bậc nhất với hai biến ===");
        System.out.print("Nhập a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Nhập a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Nhập b1: ");
        double b1 = scanner.nextDouble();
        
        System.out.print("Nhập a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Nhập a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Nhập b2: ");
        double b2 = scanner.nextDouble();
        
        double determinant = a11 * a22 - a12 * a21;

        if (determinant == 0) {
            if (a11 * b2 == a21 * b1 && a12 * b2 == a22 * b1) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            } else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        } else {

            double x1 = (b1 * a22 - a12 * b2) / determinant;
            double x2 = (a11 * b2 - b1 * a21) / determinant;
            System.out.println("Giải của hệ phương trình là: x1 = " + x1 + ", x2 = " + x2);
        }
        
        scanner.close();
    }
}
