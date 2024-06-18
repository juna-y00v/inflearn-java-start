package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("정수를 입력하세요 (0을 입력하면 종료):");
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }
            sum = sum + num;

        }
        System.out.println("총 합은 :" + sum);
    }
}
