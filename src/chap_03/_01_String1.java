package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String str = "I like Java and Spring";
        System.out.println(str);

        // 문자열의 길이
        System.out.println(str.length());

        // 대소문자 변환
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // 포함 관계
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.indexOf("C#"));  // 포함되지 않으면 -1
        System.out.println(str.lastIndexOf("Java")); // 마지막에서 일치하는 정보 인덱스
        System.out.println(str.startsWith("I like")); // 해당 문자열로 시작하면 true 아니면 false
        System.out.println(str.endsWith("Spring")); // 해당 문자열로 끝나면 true 아니면 false
    }
}
