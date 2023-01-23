package chap_04;

public class _06_While {
    public static void main(String[] args) {

        int distance = 25;  // 전체 거리
        int move = 0;       // 현재 이동 거리
        while (move < distance) {
            System.out.println("발차기를 계속 합니다. 현재 이동 거리: " + move);
            move += 3;
        }
        System.out.println("도착하였습니다.");

        // 무한 루프
//        while (move < distance) {
//            System.out.println("발차기 계속");
//        }
    }
}
