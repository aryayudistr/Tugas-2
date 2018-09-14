
package hitungfibonacci;
import java.util.Scanner;

public class Tugas02 {
    public static void main(String[] args)
    {
        System.out.println("Arya Yudistira / X RPL 3 / 08");
        
        
        Scanner baca = new Scanner(System.in);
        
        System.out.print("Berat : ");
        
        int n = baca.nextInt();
        double o=0, i=0, j=0, g=0, m=0, total, b=0;
        double[] y = new double[]{4, 5, 2, 7, 3};
        
        while(n >= 7)
        {
            n = n - 7;
            o++;
        }
        System.out.println("Banyak uang 7kg sebanyak : "+ (o*10000));
        
        while(n >= 5)
        {
            n = n - 5;
            j++;
        }
        System.out.println("Banyak uang 5kg sebanyak : "+ (j*5000));
        
        while(n >= 4)
        {
            n = n - 4;
            g++;
        }
        System.out.println("Banyak uang 4kg sebanyak : "+ (g*5000));
        
        while(n >= 3)
        {
            n = n - 3;
            i++;
        }
        System.out.println("Banyak uang 3kg sebanyak : "+ (i*3000));
        
        while(n >= 2)
        {
            n = n - 2;
            m++;
        }
        System.out.println("Banyak uang 2kg sebanyak : "+ (m*2000));
        
        while(n >= 1)
        {
            n = n - 1;
            b++;
        }
        System.out.println("Banyak uang 1kg sebanyak : "+ (b*1000));
        
        total = ((o*10000)+(j*5000)+(g*5000)+(i*3000)+(m*2000)+(b*1000));
        
        System.out.println("Total : "+ total);
        
    }
    
}
