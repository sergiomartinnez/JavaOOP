public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = false;
        int filesended = 3;

        if (isBluetoothEnabled){
            //send file
            filesended++;
            System.out.println("file sended");
        }else {
            filesended--;
            System.out.println("Please turn on the bluetooth to start the transfer");

        }

        System.out.println(isBluetoothEnabled);
        System.out.println(filesended);
    }
}
