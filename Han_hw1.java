public class Han_hw1 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int sum = 0;
        for (int i =0; i<3; i++) {
            sum += arr[i];
        }

        System.out.println("총합: " + sum);
        double avg = (double) sum / 3;
        System.out.println("평균: " + avg);
    }
}

