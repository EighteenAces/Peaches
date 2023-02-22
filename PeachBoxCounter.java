import java.util.Scanner;

public class PeachBoxCounter {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.printf("\nEnter the number of peaches picked: ");
        int numberOfPeaches = input.nextInt();
        int i; 

        for(i= 0; i<= numberOfPeaches; i = i + 20){
            System.out.println("shipped" + " " + i + " " + "peaches" + " " + "so far.");
        }
    }
}

