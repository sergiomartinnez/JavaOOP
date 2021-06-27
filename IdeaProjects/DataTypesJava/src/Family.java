public class Family {
    public static void main(String[] args) {
        String yo = "Sergio";
        String mama = "Adriana";
        String papa = "Sergio";
        String hermana = "Dayana";

        int edadYo = 22;
        int edadMama = 45;
        int edadPapa = 50;
        int edadHermana = 28;

        System.out.println("les presento a mi familia " + yo + " y tengo: " + edadYo);
        System.out.println("mi mama " + mama + " y tiene: " + edadMama);
        System.out.println("mi papa " + papa + " y tiene: " + edadPapa);
        System.out.println("mi hermana " + hermana + " y tiene: " + edadHermana);


        char c = 'z';
        int I = c;
        System.out.println(c);

        int e = 250;
        long ce = e;
        short cce = (short) ce;
        System.out.println(cce);

        double d = 301.087;
        long cd = (long) d;
        System.out.println(cd);

        int l = 100;
        var lp = l + 5000.66;
        float lpp = (float) lp;
        System.out.println(lpp);

        int i = 737;
        i *= 100;
        byte iii = (byte) i;
        System.out.println(iii);

        double dd = 298.638;
        dd /= 25;
        long ddd = (long) dd;
        System.out.println(ddd);

    }
}
