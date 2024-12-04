package Recursive;
import java.util.Scanner; //scanner sinifini tanimlamak icin kullanilir

public class Toplama {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);//kullanicidan veri almak icin scanner nesnesi kullaniyoruz
        System.out.print("Sayi giriniz:");//veri aliyoruz
        int sayi1= scanner.nextInt(); //kullanicidan alinan deger nextInt() metodu ile sayi1 degiskenine atanir
        int sonuc=toplam(sayi1);//toplam(sayi1) degerine sonuc atanir
        System.out.println("Sayilarin toplami= " + sonuc); //sonucu ekrana yazdiriyoruz
        scanner.close();//veri girilmesini kapatiyoruz ki gereksiz bellek tuketilmesin ya da sistem hatasi almayalim
    }

    public static int toplam(int sayi2) {
        //toplam fonksiyonu sayi2 degerine kadar olan sayilarin toplamini hesaplamak icin kullanilir
        //base case
        if (sayi2==1) { //sayi2 1'e esitse 1 dondurur
            return 1; //cunku 1'e kadar olan sayilarin toplami 1'dir.
        }
        return sayi2 + toplam(sayi2-1); //degilse sayi2 degerini 1 azaltir ve toplam fonksiyonu cagirilir
        //bu sayi2 degeri 1'e esit olana kadar devam eder
        //sayi2 + (sayi2 - 1) yapilarak toplam alinir her seferinde bu yapilarak toplam bulunur
    }
}
