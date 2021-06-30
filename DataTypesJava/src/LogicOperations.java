public class LogicOperations {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        //Operadores Asignacion
        System.out.println("A equals B? -> " + (a == b));
        System.out.println("A is different from B? -> " + (a != b));

        //operadores relacionales
        System.out.println("A is greater than B? -> " + (a > b));
        System.out.println("A is less than B? -> " + (a < b));
        System.out.println("A is greater than or equal to B? -> " + (a >= b));
        System.out.println("A is less than or the same to B? -> " + (a <= b));

        if (a == b) {
            System.out.println("A equals B");
        }else if((a != b) && (a < b)){
            System.out.println("A is different from B");
        }else if(a > b){
            System.out.println("A is greater than B");
        }else if(a < b){
            System.out.println("A is less than B");
        }else if(a >= b){
            System.out.println("A is greater than or equal to B");
        }else if(a <= b){
            System.out.println("A is less than or the same to B");
        }
    }
}
