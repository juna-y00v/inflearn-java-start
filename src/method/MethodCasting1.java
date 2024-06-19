package method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5;
        //printNumber(number);  //double int에 대입하므로 컴파일 오류
        printNumber((int) number); //명시적 형변환을 사용해 가능하게 만든다.
    }


    public static void printNumber(int n) {
        System.out.println("숫자:" + n);
    }
}
