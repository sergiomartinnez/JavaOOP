import org.w3c.dom.ls.LSOutput;

public class Enums {

    public enum Day {
        MONDAY("Lunes"),
        TUESDAY("Jueves"),
        FRIDAY("Viernes"),
        SATURDAY("Sábado"),
        SUNDAY("Domingo");


        private final String spanish;
        private Day(String s) {

            spanish = s;

        }

        private String getSpanish() {

            return spanish;
        }

        public static void main(String[] args) {
            System.out.println(Day.MONDAY);
            System.out.println(Day.MONDAY.getSpanish());
            
            }
        }
        


    }

