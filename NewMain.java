import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan angka (1-1000) : ");
        int n = in.nextInt();
        Deklarasi angka = new Deklarasi();
        System.out.println(angka.Deklarasi(n));
        System.out.println("Masukkan angka terbilang (dg spasi dibelakang) : ");
        in.nextLine();
        String bilang = in.nextLine();
        System.out.println(angka.Deklarasi(bilang));
    }
    
}
