package stopWatch;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("press 1 to start end 2 to stop watch");
        Scanner input = new Scanner(System.in);
        StopWatch watch = new StopWatch();
        int keyStart = input.nextInt();
        if (keyStart == 1) {
            System.out.println(watch.start());
        }
        System.out.println("press 2 to stop watch");
        int keyStop = input.nextInt();
        if (keyStop == 2) {
            System.out.println(watch.stop());
        }
        System.out.println("thoi gian troi qua: " + watch.getElapsedTime());
    }
}
