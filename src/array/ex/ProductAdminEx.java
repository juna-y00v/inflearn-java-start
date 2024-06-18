package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        int input;

        while (true) {
            System.out.println("1.상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            input = sc.nextInt();
            sc.nextLine();
            if (input == 1) {
                if (productCount == maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다. 다른 메뉴를 이용해주세요");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요:");
                productNames[productCount] = sc.nextLine();

                System.out.print("상품 가격을 입력하세요:");
                productPrices[productCount] = sc.nextInt();

                productCount++;
            } else if (input == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다. 다른 메뉴를 이용해주세요");
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");

                }
            } else if (input == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 선택 입니다. 다시 해주세요");
            }


        }


    }
}
