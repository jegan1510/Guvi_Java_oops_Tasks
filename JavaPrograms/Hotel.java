package JavaPrograms;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        float rentPerDay = sc.nextFloat();
        int days = sc.nextInt();

        switch(month) {
            case 4: case 5: case 6:  // April to June
            case 11: case 12:       // November, December
                rentPerDay = rentPerDay + (0.2f * rentPerDay);
                break;
            default:
                // Normal season
                break;
        }

        float total = rentPerDay * days;
        System.out.printf("%.2f\n", total);
    }
}
