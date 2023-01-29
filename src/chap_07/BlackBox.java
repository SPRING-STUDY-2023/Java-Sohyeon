package chap_07;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;
    static boolean canAutoReport = false; // 자동 신고 기능

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        } else if (type == 2) { // 이벤트 영상
            return 1;
        }

        return 10;
    }

    void record(boolean showDataTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");

        if (showDataTime) {
            System.out.println("영상의 날짜 정보가 표시됩니다.");
        }

        if (showSpeed) {
            System.out.println("영상의 속도 정보가 표시됩니다.");
        }

        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터로 연결합니다.");
    }
}
