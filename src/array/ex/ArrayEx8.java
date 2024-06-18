package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생수를 입력하세요:");
        int studentNum = sc.nextInt();
        int[][] score = new int[studentNum][3];

        String[] subject = new String[]{"국어", "영어", "수학"};

        for (int row = 0; row < score.length; row++) {
            System.out.println((row + 1) + "번 학생의 성적을 입력하세요:");
            for (int column = 0; column < score[row].length; column++) {
                System.out.print(subject[column] + " 점수:");
                score[row][column] = sc.nextInt();
            }
        }

        for (int row = 0; row < score.length; row++) {
            int total = 0;
            for (int column = 0; column < score[row].length; column++) {
                total += score[row][column];
            }
            double average = (double) total / 3;
            System.out.println((row + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }


    }
}
