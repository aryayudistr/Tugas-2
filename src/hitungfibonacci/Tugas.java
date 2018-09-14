
package hitungfibonacci;
import java.util.Scanner;
public class Tugas {
    public static void main(String[] args)
    {
        System.out.println("Arya Yudistira / X RPL 3 / 08");
        
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Uang : ");
        
        int n = baca.nextInt();
        int o = 0, i = 0, j = 0, g = 0, m = 0;
        int[] y = new int[] {100, 500, 1000, 5000,};
        
        while(n >= 5000)
        {
            n = n - 5000;
            o++;
        }
        System.out.println("Banyak uang 5000 sebanyak : "+ o);
        
        while(n >= 2000)
        {
            n = n - 2000;
            j++;
        }
        System.out.println("Banyak uang 2000 sebanyak : "+ j);
        
        while(n >= 1000)
        {
            n = n - 1000;
            g++;
        }
        System.out.println("Banyak uang 1000 sebanyak : "+ g);
        
        while(n >= 500)
        {
            n = n - 500;
            i++;
        }
        System.out.println("Banyak uang 500 sebanyak : "+ i);
        
        while(n >= 100)
        {
            n = n - 100;
            m++;
        }
        System.out.println("Banyak uang 100 sebanyak : "+ m);
        
}
}
