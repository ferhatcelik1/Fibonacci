/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number, first = 0, second = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Eleman Sayısını Giriniz: ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++) {

            System.out.print(first + ", ");

            int total = first + second;

            first = second;
            second = total;

        }
    }
}
