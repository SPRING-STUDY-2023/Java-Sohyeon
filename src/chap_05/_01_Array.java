package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 선언
        // String[] coffees = new String[4];    // 선언 방법1
        // String coffees[] = new String[4];    // 선언 방법2
//        coffees[0] = "아메리카노";
//        coffees[1] = "라떼";
//        coffees[2] = "카푸치노";
//        coffees[3] = "모카";

        // String[] coffees = new String[] { "아메리카노", "라떼", "카푸치노", "모카" }; // 선언 방법3

        String[] coffees = { "아메리카노", "라떼", "카푸치노", "모카" }; // 선언 방법4

        System.out.println(coffees[0] + "하나 주세요.");
        System.out.println(coffees[1] + "하나 주세요.");
        System.out.println(coffees[2] + "하나 주세요.");
        System.out.println(coffees[3] + "하나 주세요.");


    }
}
