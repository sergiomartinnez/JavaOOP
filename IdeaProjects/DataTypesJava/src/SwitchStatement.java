public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Dark";
        switch (colorModeSelected){
            case "Light":
                System.out.println("Seleccionaste Light Mode");
                break;
            case "Night":
                System.out.println("Seleccionaste Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Seleccionaste Blue dark Mode");
                break;
            case "Dark":
                System.out.println("Seleccionaste Dark Mode");
                break;
            default:
                System.out.println("Selecciona una opcion");
        }

    }
}
