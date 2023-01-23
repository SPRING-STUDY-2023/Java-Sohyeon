package chap_04;

public class _10_Break {
    public static void main(String[] args) {

        // 치킨 집에서 매일 20마리만 판매 (1인 1 구매)
        // 손님이 50명 대기

        System.out.println("=== FOR ===");
        int MAX = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 치킨 나왔습니다.");
            if (i == MAX) {
                System.out.println("금일 재료가 소진 되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("=== WHILE ===");
        int index = 1;
        while (index <= 50) {
            System.out.println(index + "번 손님, 치킨 나왔습니다.");
            if (index == MAX) {
                System.out.println("금일 재료가 소진 되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");


    }
}
