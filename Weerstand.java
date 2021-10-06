import java.util.Scanner;

public class Weerstand {
    private String number;
    int[] values = new int[12];values[0]=10;values[1]=12;values[2]=15;values[3]=18;values[4]=22;values[5]=27;values[6]=33;values[7]=39;values[8]=47;values[9]=56;values[10]=68;values[11]=82;

    public Weerstand(String number) {
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    public void askNumber() {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        
        //Lees hoeveel karakters er in de input zitten en print dat uit
        System.out.println("Give a number: ");
        String input = scan.nextLine();

        Weerstand w1 = new Weerstand(input);
        System.out.println(w1);

        for(int i = 0; i < input.length(); i++) {    
            if(input.charAt(i) != ' ')    
                count++;    
        }
        
        System.out.println(count);
    }

    //Krijg input van askNumber() en vergelijk die met de values arraylist voor het dichtbijzijndste nummer
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
