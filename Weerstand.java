import java.util.Scanner;

public class Weerstand {
    private String number;
    private int[] values = {10, 12, 15, 18, 22, 27, 33, 39, 47, 56, 68, 82};
    private int myNumber = 0;
    

    public Weerstand(String number) {
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    
    public static void askNumber(String input) {
        int count = 0;

        Weerstand w1 = new Weerstand(input);
        System.out.println(w1);

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ')
                count++;
        }

        System.out.println(count);
    }

    // krijgt laatste cijfer van input
    public static char LastChar(String input){
        return input.charAt(input.length() - 1);
    }

    // Krijg input van askNumber() en vergelijk die met de values arraylist voor het
    // dichtbijzijndste nummer
    public void getClosestNumber() {
        int distance = Math.abs(values[0] - myNumber);
        int idx = 0;
        for (int c = 1; c < values.length; c++) {
            int cdistance = Math.abs(values[c] - myNumber);
            if (cdistance < distance) {
                idx = c;
                distance = cdistance;
            }
        }
        int theNumber = values[idx];
    }

    @Override
    public String toString() {
        return "De waarde is: " + "<3, 9, 1> " + "\n" + "De kleuren zijn: " + "<oranje, wit, bruin>";
    }
}
