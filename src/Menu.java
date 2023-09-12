

public class Menu {
    public static void show() {
        System.out.println("请选择章节（1~4）：");
        while (true) {
            int c = InputErrorCheck.inputIntegerErrorCheck();
            if (c == 1) {

                break;
            } else if (c == 2) {

                break;
            } else if (c == 3) {

                break;
            } else if (c == 4) {

                break;
            } else {
                System.out.println("无此章节，请重新选择");
            }
        }
    }
}
