package loop.ex;

public class WhileEx2 {

    public static void main(String[] args) {
        int num = 2;
        int count = 1;

        while (count <= 10) {
            System.out.println(num);
            num = num + 2;
            count++;
        }

    }
}





/*public static void main(String[] args) {
        int num = 0;
        int i = 0;
        while (i <= 10) {
            if(num % 2 == 0) {
                System.out.println(num);
                num++;
                i++;
                continue;
            }
            num++;

        }
    }*/

