/* Fibonacci Serisi Nedir ?
  Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir.
  Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar,
  yani bir sayı kendisinden önceki sayıya bölündüğünde
  altın orana gittikçe yaklaşan bir dizi elde edilir.
  Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam,
  bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır.
  Fibonacci dizisinin ilk on sayısı şu şekildedir:
  9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34 */
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