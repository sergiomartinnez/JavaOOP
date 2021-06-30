public class Functions {
    public static void main(String[] args) {
        double y = 3;
        double quantity;
        String currency;
        //area de un circulo
        //pi * r2

        circleArea(y);
        System.out.println(circleArea(y));

        //area de una esfera
        //4*pi*r2
        sphereArea(y);
        System.out.println(sphereArea(y));

        //volumen de una esfera
        //(4/3) * pi * r3
        sphereVolumen(y);
        System.out.println(sphereVolumen(y));

        System.out.println("Pesos to dolar: " + converToDolar(quantity=1000,currency="COP"));


    }

    /**
     * Descripcion: Function that by specifying the radius of the circle you can get its area
     * @param r circle radius
     * @return circleArea
     * */

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    /**
     * Descripcion: Function that by specifying the radius of the sphere you can get its area
     * @param r circle radius
     * @return sphereArea
     * */

    public static double sphereArea(double r){
        return 4* Math.PI * Math.pow(r,2);

    }

    /**
     * Descripcion: Function that by specifying the radius of the sphere you can get its volume
     * @param r circle radius
     * @return sphereVolumen
     * */

    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripcion: Function that specifying your currency converts an amount of money to dollars
     * @param quantity quantity of money
     * @param currency type of money, just accepted MXN o COP
     * @return quantity returns the quantity into dolars
     * */

    public static double converToDolar(double quantity,String currency){
        //MXN COP
        switch (currency){
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;

        }
        return quantity;
    }
}
