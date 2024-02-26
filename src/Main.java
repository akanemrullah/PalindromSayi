import java.util.Scanner;

public class Main {

    // Palindrom sayi icin boolean tipinde olusturdugumuz metot.
    static boolean isPalindrom(int number) {

        // Gerekli degiskenler tanimlandi.
        int tempNumber, reverseNumber = 0, lastNumber;

        // Karsilastirma yapabilmek adina kullanicidan gelen degeri saklamamiz gerekiyor. Bu sebeple ek bir degisken tanimladik.
        tempNumber = number;

        // While dongusu icersinde kullanicinin girdigi sayiyi tersine cevirip reverseNumber adli degiskene atadik.
        while (tempNumber != 0) {

            lastNumber = tempNumber % 10;

            reverseNumber = (reverseNumber * 10) + lastNumber;

            tempNumber /= 10;

        }

        // Kullanicinin girdigi deger ile tersini karsilastirip geriye dondurduk.
        return (reverseNumber == number);
    }


    public static void main(String[] args) {

        // Main blogumuz icin Scanner sinifina ait degisken tanimlayip projeye dahil ettik.
        Scanner input = new Scanner(System.in);

        // Kullanicidan gelen degeri tutmak icin degisken tanimladik.
        int number;

        // Kullanicidan degeri alip ilgili degiskene atadik.
        System.out.print("Palindrom olup olmadigini merak ettigin sayiyi gir: ");
        number = input.nextInt();

        // Metot yardimiyla kullanicinin girdigi degerin palindrom sayi olup olmadigini test ettik. Test ardindan true veya false bir deger aldik.
        // True ise sayinin palindrom, degil ise tersi bir bilgi verecegiz.
        if (isPalindrom(number)) {
            System.out.print(number + " Sayisi bir palindrom sayidir.");
        } else {
            System.out.print(number + " Sayisi bir palindrom sayi degildir.");
        }
    }
}