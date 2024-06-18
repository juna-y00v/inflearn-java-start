package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");

        while (true) {
            int num = sc.nextInt();

            if (num == -1) {
                break;
            }
            sum += num;
            count++;
        }
        System.out.println("입력한 숫자들의 합계: " + sum);
        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}

//반복문 예제 2 이렇게 축약 가능
/*
 while ((input = scanner.nextInt()) != -1) {
 sum += input;
 count++;
 }
*/
