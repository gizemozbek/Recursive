package Recursive;
import java.util.Scanner;//kullanicidan veri almak icin kullanilir
public class TerstenYazma {
    public static String reverse(String text) {
        if (text.isEmpty()){//text bos mu kontrol edilir
            return text;//text bossa geri dondurulur
        }
        //text.charAt(text.length() - 1) text'in son karakterini alir
        //reverse(text.substring(0, text.length() - 1) text'in son karakteri haric kismini alir
        //reverse ile kalan kisim yeniden yollanir ve dondurulen ile birlestirilir
        return text.charAt(text.length() - 1) + reverse(text.substring(0, text.length() - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//kullanicidan veri alinir
        System.out.print("Bir metin giriniz: ");
        String metin = scanner.nextLine();// kullanicinin girdigi veriyi metin degiskenine atar

        //veri tersine cevrilmesi icin reverse fonksiyonuna yollanir
        //ters cevrilen metin, reversedText'e atanir
        String reversedText = reverse(metin);

        System.out.println("Ters çevrilmiş metin: " + reversedText);//ciktiyi yazdirma
        scanner.close();
    } }
