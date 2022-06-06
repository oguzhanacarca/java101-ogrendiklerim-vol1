import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("A sayısını giriniz:");
        a = input.nextInt();
        int kosul1 = (a*4);
        int kosul2 = (kosul1+10);
        int kosul3 = (kosul2/2);
        boolean kosul4 = (kosul3<=50);
        System.out.println(kosul4);
        System.out.print("A sayısı sonucu;");
        System.out.print(kosul3);
                if (kosul3<50) {
                    System.out.println(" sayısı 50'den küçüktür.");
                }
                if (kosul3 > 50) {
            System.out.println(" sayısı 50'den büyüktür.");
        }
    }
}