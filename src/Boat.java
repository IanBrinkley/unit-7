public class Boat {

    private boolean hasMotor;
    private int topSpeed;
    private int length;

    public Boat () {
        this.hasMotor = false;
        this.topSpeed = 0;
        this.length = 0;
    }

    public Boat (boolean hasMotor, int topSpeed, int length) {
        this.hasMotor = hasMotor;
        this.topSpeed = topSpeed;
        this.length = length;
    }

    public String move (int nauticalMiles) {
        return "The boat " + (hasMotor
                        ? "moved " + nauticalMiles + " nautical miles quickly."
                        : "took forever to move " + nauticalMiles + ".");
    }

    public String sink () {
        return length > 10
                ? "Boat sank in " + (length * 2 + 9) / 1.4 + " minutes."
                : "Boat sank instantly.";
    }

    public String toString () {
        return "Boat - \n\t Motor: " + hasMotor
                + "\n\t Top Speed: " + topSpeed + " knots"
                + "\n\t Length: " + length + " ft";
    }

    public static void main(String[] args) {
        Boat b = new Boat();
        Boat myBoat = new Boat(true, 23, 44);

        System.out.println("Default boat: \n" + b);
        System.out.println("My boat: \n" + myBoat);

        System.out.println(myBoat.move(45));
        System.out.println(myBoat.sink());
        System.out.println(b.sink());
    }
}