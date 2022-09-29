package Exception;

public class Taschenrechneralternative {

    public Taschenrechneralternative() {
    }

    public static void plus(int userZahl1, int userZahl2){
        System.out.println("Die Summe beträgt: " + (userZahl1 + userZahl2));


    }
    public static void dividieren(int userZahl1, int userZahl2) throws Exception {
        if (userZahl1 == 0) {
            throw new NichtDurchNullTeilenException("Hey nicht durch 0 teilen");
        } else{
            System.out.println("Die Summe beträgt: " + (userZahl1 / userZahl2));
        }
        }

        public static void minus ( int userZahl1, int userZahl2){
            System.out.println("Die Summe beträgt: " + (userZahl1-userZahl2));
        }

            public static void multiplizieren ( int userZahl1, int userZahl2){
                System.out.println("Die Summe beträgt: " + (userZahl1 * userZahl2));

            }

    }