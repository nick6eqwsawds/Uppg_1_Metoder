import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner tangentbord = new Scanner(System.in);
        double summa = omkretsCirkel(9);
        System.out.println("Omkrets är: "+summa);
        

        ritaLinje(1);
        ritaRektangel(0,0);
        }
        
    
    static double omkretsCirkel(double radie)
    {
        double summa = radie*3.14*2;
        return summa;

    }
    static void ritaLinje(int längd)
    {
        Scanner tangentbord = new Scanner(System.in);
        int varv = 0;
        System.out.println("Hur många gånger?");
        längd = tangentbord.nextInt();
        while(längd>varv)
        {
            varv++;
            System.out.print("-");
                
        }
    }
    static void ritaRektangel(int höjd,int bredd)
    {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("hur bredd?");
        bredd = tangentbord.nextInt();
        System.out.println("Hur hög?");
        höjd = tangentbord.nextInt();
        for (int i = 0; i<höjd; i++)
        {
            System.out.println("");

            for (int j = 0; j<bredd; j++)
            {
                System.out.print("*");
            }
    }


    }
}
