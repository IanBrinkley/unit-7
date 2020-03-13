public class InheritanceTest {
    public static void main(String[] args) {
        Person person = new Person(1);
        Employee1 employee = new Employee1(0.9, 13, "5 to 12");
        Waiter waiter = new Waiter(0.8, 21, "9 to 5", new int[]{1, 2, 3, 4, 5, 6});

        Person employee2 = new Employee1(1, 15, "4 to 8");

        System.out.println(waiter.getTables());
        System.out.println(waiter);
        waiter.talk();
        waiter.giveUpTable(2);
        waiter.takeBreak(6);
        waiter.sleep();
        System.out.println(waiter);

        System.out.println();

        System.out.println(employee.talk());
        employee.setEnergyLevel(0);
        System.out.println(employee.talk());
        employee.gainMoney(5);
        System.out.println(employee);

        System.out.println();

        System.out.println(person.getEnergyRate());
        System.out.println(person);

        System.out.println();

        System.out.println(employee2.talk());
    }
}
