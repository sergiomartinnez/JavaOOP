public class Family {
    public static void main(String[] args) {
        String me = "Sergio";
        String mom = "Adriana";
        String dad = "Sergio";
        String sister = "Dayana";

        int ageMe = 22;
        int ageMom = 45;
        int ageDad = 50;
        int ageSister = 28;

        System.out.println("Present you my family " + me + " i have: " + ageMe);
        System.out.println("my mom " + mom + " and has: " + ageMom);
        System.out.println("my dad " + dad + " and has: " + ageDad);
        System.out.println("my sister " + sister + " and has: " + ageSister);


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
