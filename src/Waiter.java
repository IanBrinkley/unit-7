import java.util.ArrayList;

public class Waiter extends Employee1 implements Comparable{

    private ArrayList<String> orders;
    private ArrayList<Integer> tables;

    public Waiter(double energyRate, double hourlyPay, String hours, int[] tables) {
        super(energyRate, hourlyPay, hours);
        this.tables = new ArrayList<Integer>();
        for (int table : tables) {
            this.tables.add(table);
        }
        this.orders = new ArrayList<String>();
    }

    public Waiter(int[] tables) {
        super(1, 11.25, "9 to 5");
        this.tables = new ArrayList<Integer>();
        for (int table : tables) {
            this.tables.add(table);
        }
        this.orders = new ArrayList<String>();
    }

    public String talk() {
        setEnergyLevel(getEnergyLevel() - getEnergyRate() / 12);
        setMoney(getMoney() + getHourlyPay() / 12);
        orders.add("Meal " + orders.size());
        if (getEnergyLevel() <= 0) {
            return "Sorry, we're really full tonight. Expect a long wait.";
        } else {
            return "It'll be right out.";
        }
    }

    public void depositOrders() {
        orders.clear();
    }

    public ArrayList<String> getOrders() {
        return orders;
    }

    public ArrayList<Integer> getTables() {
        return tables;
    }

    public void addTable(int table) {
        this.tables.add(table);
    }

    public void giveUpTable(int table) {
        this.tables.remove(table);
    }

    public int compareTo(Object other) {
        Waiter otherW = (Waiter) other;
        return (this.tables.size() - otherW.getTables().size());
    }

    public boolean equals(Object other) {
        Waiter otherW = (Waiter) other;
        return this.tables == otherW.getTables();
    }

    public String toString() {
        return "I am a waiter with $" + getMoney() + ", my wage is $" + getHourlyPay() + " per hour. My shift runs from " + getHours() + ". I have " + getEnergyLevel() + " energy left. I am working " + getTables().size() + " tables.";
    }
}
