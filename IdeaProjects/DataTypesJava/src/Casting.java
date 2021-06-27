public class Casting {
    public static void main(String[] args) {

        //1 año ubico 30 perros
        //cuantos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //estimacion
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //exactitud
        int a = 30;
        int b = 12;
        System.out.println((double)a/b);

        double c= (double) a/b;
        System.out.println(c);

        //no necesita casting porque si cabe
        char n = '1';
        int n1 = n;
        System.out.println(n1);
        //necesita casting porque no cabe
        short nS = (short) n;
        System.out.println(nS);
    }
}
