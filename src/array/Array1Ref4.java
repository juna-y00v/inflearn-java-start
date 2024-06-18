package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students = {90,80,70,60,50}; // 라인 나누면 안됨 new int 사용안하면
        
        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생"+(i+1)+"점수는: " + students[i]);
        }
    }
}
