import java.util.Scanner;

public class Palindromic {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Lütfen bir kelime yazın : ");
        String kelime = str.nextLine();
        String yeni = "";
        for (int a = kelime.length()-1;a>=0;a--){
            yeni=yeni.concat(String.valueOf((kelime.charAt(a))));
        }
        if (yeni.equalsIgnoreCase(kelime)){
            System.out.println("Yazdığınız kelime palindromiktir.");
        } else {
            System.out.println("Yazdığınız kelime palindromik değildir.");
        }
    }
}
