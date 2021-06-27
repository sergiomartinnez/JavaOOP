public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int filesended = 3;

        if (isBluetoothEnabled){
            //send file
            filesended++;
            System.out.println("archivo enviado");
        }else {
            filesended--;
            System.out.println("Por favor enciende el bluetooth para iniciar la transferencia");

        }

        System.out.println(isBluetoothEnabled);
        System.out.println(filesended);
    }
}
