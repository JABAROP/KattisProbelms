
import java.util.Scanner;

public class GCVWR {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int G = sc.nextInt();
        int vehicleWeight = sc.nextInt(), items = sc.nextInt(), sum = 0;
        for (int i = 0; i < items; i++) {
            int itemWeight = sc.nextInt();
            sum = sum + itemWeight;

        }
        double maxTrailer = ((G - vehicleWeight) * .9f);
        int trailerMax = (int) maxTrailer;
        int trailer = trailerMax - sum;
        System.out.println(trailer);
    }
}
