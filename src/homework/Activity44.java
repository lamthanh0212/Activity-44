package homework;

import java.util.Scanner;

public class Activity44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }

        double sum = 0;
        double count = 0;
        for (int i = 0; i < arr.length; i = i + 1) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
                count++;

            }
        }
        double tinhTBC = sum / count;
        System.out.println("Trung binh cong cac so chan la: " + tinhTBC);

        int max = arr[0];
        for (int i = 0; i < n; i = i + 1) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println("So lon nhat la: " + max);

        int min = arr[0];
        for (int i = 0; i < n; i = i + 1) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println("So nho nhat la: " + min);



                }
            }























         



