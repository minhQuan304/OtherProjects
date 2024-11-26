package hust.soict.dsai;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập kích thước của mảng: ");
        int n = scanner.nextInt();
        
        double[] array = new double[n];
        
        System.out.println("Nhập " + n + " phần tử:");
        
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }
        
        Arrays.sort(array);
        
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        double average = sum / n;
        
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));
        System.out.println("Tổng của các phần tử là: " + sum);
        System.out.println("Giá trị trung bình là: " + average);
        
        scanner.close();
    }
}
