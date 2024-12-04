package Recursive;
import java.util.Scanner;

public class Fibonacci {
    public static long fib(int n) {
        //base case
        if ((n == 0) || (n == 1)) {
            return n;
            //rec case
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.print("Bir sayi giriniz: ");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();

        long startTime = System.currentTimeMillis();
        long sonuc = fib(sayi);
        long endTime = System.currentTimeMillis();
        //1 saniye = 1000 milisaniye
        double totalTime = (endTime - startTime)/1000.0;

        System.out.println("Toplam Sure: " +totalTime);
        System.out.println(sayi + ". Fibonacci Sayisi: " +sonuc);
        input.close();
    }
}
