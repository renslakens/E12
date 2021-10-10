import java.util.Scanner;

public class Weerstand {
    private String number;
    private static int[] values = {10, 12, 15, 18, 22, 27, 33, 39, 47, 56, 68, 82};
    private int myNumber = 0;
    

    public Weerstand(String number) {
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    
    public static int askNumber(String input) {
        int count = 0;
        // berekent lengte?
        Weerstand w1 = new Weerstand(input);
        System.out.println(w1);

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ')
                count++;
        }

        return count;
    }

    // krijgt laatste cijfer van input
    public static char LastChar(String input){
        return input.charAt(input.length() - askNumber(input) + 1);
    }

    // Krijg input van askNumber() en vergelijk die met de values arraylist voor het
    // dichtbijzijndste nummer
    public static int getClosestNumber(int myNumber) {
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
        return theNumber;
    }

    public static String getFirstRing(int getClosestNumber){
        String firstColor = null;
        String ring = String.valueOf(getClosestNumber);
        char plaat = ring.charAt(ring.length() - 2);
        int plaats = Character.getNumericValue(plaat);
        if (plaats == 0){
            firstColor = "zwart";
        }
        else if (plaats == 1){
            firstColor = "bruin";
        }
        else if (plaats == 2){
            firstColor = "rood";
        }
        else if (plaats == 3){
            firstColor = "oranje";
        }  
        else if (plaats == 4){
            firstColor = "geel";
        }
        else if (plaats == 5){
            firstColor = "groen";
        }
        else if (plaats == 6){
            firstColor = "blauw";
        }
        else if (plaats == 7){
            firstColor = "violet";
        }  
        else if (plaats == 8){
            firstColor = "grijs";
        }    
        else if (plaats == 9){
            firstColor = "wit";
        }      
        return firstColor;
    }

    public static String getSecondRing(int getClosestNumber){
        String secondColor = null;
        String ring = String.valueOf(getClosestNumber);
        char plaat = ring.charAt(ring.length() - 1);
        int plaats = Character.getNumericValue(plaat);
        if (plaats == 0){
            secondColor = "zwart";
        }
        else if (plaats == 1){
            secondColor = "bruin";
        }
        else if (plaats == 2){
            secondColor = "rood";
        }
        else if (plaats == 3){
            secondColor = "oranje";
        }  
        else if (plaats == 4){
            secondColor = "geel";
        }
        else if (plaats == 5){
            secondColor = "groen";
        }
        else if (plaats == 6){
            secondColor = "blauw";
        }
        else if (plaats == 7){
            secondColor = "violet";
        }  
        else if (plaats == 8){
            secondColor = "grijs";
        }    
        else if (plaats == 9){
            secondColor = "wit";
        }      
        return secondColor;
    }

    public static String getThirdRing(int count){
        String thirdColor = null;
        if (count == 2){
            thirdColor = "zwart";
        }
        if (count == 3){
            thirdColor = "bruin";
        }
        if (count == 4){
            thirdColor = "rood";
        }
        if (count == 5){
            thirdColor = "oranje";
        }
        if (count == 6){
            thirdColor = "geel";
        }
        if (count == 7){
            thirdColor = "groen";
        }
        if (count == 8){
            thirdColor = "blauw";
        }
        if (count == 9){
            thirdColor = "violet";
        }
        return thirdColor;
    }
    

    @Override
    public String toString() {
        return "De kleuren zijn: " + Weerstand.getFirstRing(Weerstand.getClosestNumber(myNumber)) + Weerstand.getSecondRing(Weerstand.getClosestNumber(myNumber)) + Weerstand.getThirdRing(Weerstand.getClosestNumber(myNumber));
    }
}
