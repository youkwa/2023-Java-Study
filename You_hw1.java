
import java.util.Scanner;

public class You_hw1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("전호번호를 입력하세요.(서울02, 경기031, 인천032, 강원도033) ※-제외");
        String number = scanner.nextLine();
        String nu = number.substring(1,2);
        int ber = Integer.parseInt(nu);
        String m1 = number.substring(0,3);
        int m2 = Integer.parseInt(m1);

        if (ber == 2) {
            System.out.println("서울 입니다.");
        } else if ( m2 == 31 ){
            System.out.println("경기도 입니다.");
        }else if ( m2 == 32 ){
            System.out.println("인천 입니다.");
        }else if ( m2 == 33 ) {
            System.out.println("강원도 입니다.");
        } else {
            System.out.println("전화번호를 제대로 눌러주세요.");
        }
    }
}

