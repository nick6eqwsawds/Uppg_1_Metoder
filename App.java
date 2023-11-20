public class App {
    public static void main(String[] args) {
        double summa = omkretsCirkel(9);
        System.out.println("Omkrets är: "+summa);
        
    }
    static double omkretsCirkel(double radie)
    {
        double summa = radie*3.14*2;
        return summa;

    }
    
}
