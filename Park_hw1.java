
import java.util.Scanner;

public class Park_hw1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ran = (int)(Math.random()*10) + 1;
        int chance = 5;
        for(int i=1; i<=chance; i++) {
            System.out.print("1~10 사이의 숫자를 입력하세요.: ");

            String input = scanner.nextLine();
            int num = Integer.parseInt(input);

            if (ran == num) {
                System.out.println("정답입니다.");
                break;
            } else if (ran > num) {
                System.out.println("up");
            } else if (ran < num) {
                System.out.println("down");
            } else {
                System.out.println("틀렸습니다.");
            }
        }
    }
}

