package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        // int to float, double
        int score = 93;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);

        // float, double to int
        float f = 93.3f;
        double d = 98.8;
        System.out.println((int) f);
        System.out.println((int) d);

        // 정수 + 실수
        score = 93 + (int) 98.8;
        System.out.println(score);

        d = (double) 93 + 98.8;
        System.out.println(d);

        // 변수에 형 변환된 데이터 집어넣기
        double convertedScoreDouble = score;
        System.out.println(convertedScoreDouble);
        // int -> long -> float -> double (자동 형 변환)

        int convertedScoreInt = (int) d;
        System.out.println(convertedScoreInt);
        // double -> float -> long -> int (수동 형 변환)

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        // 문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d2 = Double.parseDouble("98.8");
        System.out.println(d2);

        int errror = Integer.parseInt("자바");
        System.out.println(errror);
    }
}
