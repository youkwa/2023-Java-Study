
import java.util.Scanner;

public class Kim_hw1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("생일을 입력하세요 →1월 23일 : 0123 입력");

        String birthday = scanner.nextLine();
        String mon = birthday.substring(0, 2);
        int month = Integer.parseInt(mon);


        if (month == 01 || month == 02 || month == 12) {
            System.out.println("겨울에 태어났군요 ~");
        } else if (month == 03 || month == 04 || month == 05) {
            System.out.println("봄에 태어났군요 ~");
        } else if (month == 06 || month == 07 || month == 8 ) {
            System.out.println("여름에 태어났군요 ! ~");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("가을에 태어났군요 ! ~");
        } else {
            System.out.println("생일을 제대로 입력하셨나요 ?? ");
        }
    }

}
