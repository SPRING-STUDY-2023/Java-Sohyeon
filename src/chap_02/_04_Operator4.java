package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean cake = false;
        boolean coffee = true;
        boolean water = true;

        System.out.println(cake || coffee || water); // or
        System.out.println(cake && coffee && water); // and

        System.out.println((5 > 3) && (3 > 1));
        System.out.println((5 > 3) || (3 < 1));

        System.out.println((1 < 3) && (3 < 5));
//        System.out.println(1 < 3 < 5); // 불가능

        // 논리 부정 연산자
        System.out.println(!true);
        System.out.println(!false);
    }
}
