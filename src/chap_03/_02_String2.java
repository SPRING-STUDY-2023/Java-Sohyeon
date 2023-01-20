package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String str = "I like Java and Spring and Spring Boot.";

        // 문자열 변환
        System.out.println(str.replace(" and", ","));
        System.out.println(str.substring(7)); // index 7부터 마지막까지
        System.out.println(str.substring(str.indexOf("Java"))); // 포함한 위치 값부터 마지막까지 잘라내기
        System.out.println(str.substring(str.indexOf("Java"), str.indexOf(".")));

        // 공백 제거
        str = "    I like Java        ";
        System.out.println(str);
        System.out.println(str.trim()); // 앞뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Spring";
        System.out.println(s1 + s2);
        System.out.println(s1 + ", " + s2);
        System.out.println(s1.concat(", ").concat(s2));
    }
}
