public class Employee1 extends Person implements Comparable{

    private double hourlyPay;
    private String hours;

    public Employee1(double energyRate, double hourlyPay, String hours) {
        super(energyRate);
        this.hourlyPay = hourlyPay;
        this.hours = hours;
    }

    public String talk() {
        setEnergyLevel(getEnergyLevel() - getEnergyRate() / 12);
        setMoney(getMoney() + hourlyPay / 12);
        if (getEnergyLevel() <= 0) {
            return "I need to take a break.";
        } else {
            return "Can I help you find something?";
        }
    }

    public void takeBreak(int minutes) {
        setEnergyLevel(getEnergyLevel() + getEnergyRate() * minutes / 60.0);
    }

    public double getHourlyPay() { return hourlyPay; }
    public String getHours() { return hours; }

    public void setHourlyPay(double hourlyPay) { this.hourlyPay = hourlyPay; }
    public void setHours(String hours) { this.hours = hours; }

    public int compareTo(Object other) {
        return (int) (this.hourlyPay - ((Employee1) other).getHourlyPay());
    }

    public boolean equals(Object other) {
        Employee1 otherE = (Employee1) other;
        return (this.getHours().equals(otherE.getHours()) && this.getHourlyPay() == otherE.getHourlyPay() && this.getEnergyLevel() == otherE.getEnergyLevel());
    }

    public String toString() {
        return "I am an employee with $" + getMoney() + ", my wage is $" + getHourlyPay() + " per hour. My shift runs from " + getHours() + ". I have " + getEnergyLevel() + " energy left.";
    }

    public static void main(String[] args) {
        Employee1 e1 = new Employee1(1, 19, "5 to 11");
        System.out.println(e1);
        e1.talk();
        System.out.println(e1);
    }
}
