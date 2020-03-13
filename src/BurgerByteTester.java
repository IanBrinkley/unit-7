public class BurgerByteTester {
    public static void main(String[] args) {
        Manager manager = new Manager("Samantha", 27);
        BurgerByte burgerByte = new BurgerByte("Portland", manager);
        manager.setManagingBranch(burgerByte);
        Cashier cashier = new Cashier("Tommy", 19, burgerByte); // adds once
        FryCook fryCook = new FryCook("Jack", 22, burgerByte);
        System.out.println(burgerByte.getCashiers());
        System.out.println(burgerByte.getFryCooks());
        System.out.println(manager.getCashiers());
    }
}
