package chap_04;

public class _11_Continue {
    public static void main(String[] args) {

        // 치킨 주문 손님 중 노쇼 손님이 있다고 가정
        int MAX = 20;
        int sold = 0;
        int NO_SHOW = 17;

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 치킨 나왔습니다.");

            if (i == NO_SHOW) {
                System.out.println(i + "번 손님, 없으시면 다음 주문으로 넘기겠습니다.");
                continue;
            }

            sold++;

            if (sold == MAX) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("판매가 종료되었습니다.");
    }
}
