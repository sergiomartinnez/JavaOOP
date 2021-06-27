public class Funciones {
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

        System.out.println("Pesos a dolares: " + converToDolar(quantity=1000,currency="COP"));


    }

    /**
     * Descripcion: Funcion que especificando el radio del circulo puede sacar su area
     * @param r el radio del circulo
     * @return circleArea
     * */

    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    /**
     * Descripcion: Funcion que especificando el radio de la esfera puede sacar su area
     * @param r el radio de la esfera
     * @return sphereArea
     * */

    public static double sphereArea(double r){
        return 4* Math.PI * Math.pow(r,2);

    }

    /**
     * Descripcion: Funcion que especificando el radio de la esfera puede sacar su volumen
     * @param r el radio de la esfera
     * @return sphereVolumen
     * */

    public static double sphereVolumen(double r){
        return (4/3) * Math.PI * Math.pow(r,3);
    }

    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return quantity devuelve la cantidad actualizada en Dolares
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
