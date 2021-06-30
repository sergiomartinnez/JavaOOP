public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Dark";
        switch (colorModeSelected){
            case "Light":
                System.out.println("Choosed Light Mode");
                break;
            case "Night":
                System.out.println("Choosed Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Choosed Blue dark Mode");
                break;
            case "Dark":
                System.out.println("Choosed Dark Mode");
                break;
            default:
                System.out.println("Choose an option");
        }

    }
}
