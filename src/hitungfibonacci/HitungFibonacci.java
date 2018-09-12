package hitungfibonacci;
import java.util.Scanner;
import java.math.BigInteger;
public class HitungFibonacci {
    public static void main(String[] args)
    {
        String identitas = "Arya Yudistira / X RPl 3 / 08";
        tampilJudul(identitas);
        
        int n = tampilInput();
    }
    
    private static void tampilJudul(String identitas)
    {
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    
    private static int tampilInput()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bilangan ke - ");
        int n = scanner.nextInt();
        
        return n;
    }
    
}