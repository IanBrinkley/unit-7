public abstract class Employee {

    public static final double BASE_WAGE = 10.0;

    private String name;
    private int age;
    private double hoursWorked;
    private boolean atWork;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        hoursWorked = 0;
        atWork = false;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isAtWork() { return atWork; }
    public double getHoursWorked() { return hoursWorked; }

    public void logHoursWorked(double hours) { hoursWorked += hours; }

    public abstract void startWork(double hours);
    public abstract void leaveWork();
    public abstract double computeWage();
}
