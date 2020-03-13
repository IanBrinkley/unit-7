public class Person {

    private double money;
    private double energyLevel;
    private double energyRate; // energy lost per hour?

    public Person(double energyRate) {
        this.energyLevel = 10;
        this.energyRate = energyRate;
        this.money = 0;
    }

    public String talk() {
        energyLevel -= energyRate / 12;
        if (energyLevel <= 0) {
            return "I'm too tired for this.";
        } else {
            return "Hello, I'm a person.";
        }
    }

    public void sleep() {
        energyLevel = 10;
    }

    public void gainMoney(double amt) {
        money += amt;
    }

    public void spendMoney(double amt) {
        money -= amt;
    }

    public double getEnergyLevel() { return energyLevel; }
    public double getEnergyRate() { return energyRate; }
    public double getMoney() { return money; }

    public void setEnergyLevel(double energyLevel) { this.energyLevel = energyLevel; }
    public void setEnergyRate(double energyRate) { this.energyRate = energyRate; }
    public void setMoney(double money) { this.money = money; }

    public String toString() {
        return "I am a person with " + getEnergyLevel() + " energy left. I have $" + getMoney() +".";
    }
}
