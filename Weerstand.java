public class Weerstand {
    private String number;

    public Weerstand(String number) {
        this.number = number;
    }
    
    public String getNumber() {
        return this.number;
    }

    public void get() {
        
    }

    @Override
    public String toString() {
        return "De waarde is: " + "<3, 9, 1> " + "\n" + "De kleuren zijn: " + "<oranje, wit, bruin>";
    }
}
