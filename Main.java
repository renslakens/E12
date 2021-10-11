import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        //Mogelijke waarden zijn: 10, 12, 15, 18, 22, 27, 33, 39, 47, 56, 68 en 82, eventueel vermenigvuldigd met machten van 10 (tot 10M)
        //Kleuren aan getallen toewijzen, ook met de mulitplier
        //Programma moet van eind naar voren lezen voor meer accurate uitkomst
        Scanner scan = new Scanner(System.in);

        // Lees hoeveel karakters er in de input zitten en print dat uit
        System.out.println("Give a number: ");
       // String input = scan.nextLine();
        //System.out.println(Weerstand.LastChar(input));
        int myNumber = scan.nextInt();
        //System.out.println(Weerstand.getClosestNumber(myNumber));
        //String test = String.valueOf(myNumber);
        // System.out.println("last char:");
        String input = String.valueOf(myNumber);
        //System.out.println(Weerstand.LastChar(input));
        //System.out.println("length");
        //System.out.println(Weerstand.getFirstRing(Weerstand.getClosestNumber(myNumber)));
        //Weerstand.getFirstRing(Weerstand.getClosestNumber(myNumber));
        //Weerstand.getSecondRing(Weerstand.getClosestNumber(myNumber));
        //Weerstand.getThirdRing(Weerstand.askNumber(input));
        //System.out.println(Weerstand.getSecondRing(Weerstand.getClosestNumber(myNumber)));
        //System.out.println(Weerstand.getThirdRing(Weerstand.askNumber(input)));
        System.out.println(Weerstand.getFirstRing(Weerstand.getClosestNumber(myNumber)) + " " + Weerstand.getSecondRing(Weerstand.getClosestNumber(myNumber)) + " " + Weerstand.getThirdRing(Weerstand.askNumber(input)));
    }
}