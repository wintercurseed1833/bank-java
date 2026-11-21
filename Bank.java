public class Bank {
    public static void main(String[] args) {
        Client ivan = new Client("Иван", 1000);
        Client anna = new Client("Анна", 500);
        Organization shop = new Organization("Магазин", 10000);

        Transaction t = new Transaction();

        t.clientToClient(ivan, anna, 300);
        t.organizationToClient(shop, ivan, 2000);
        t.clientToOrganization(anna, shop, 200);

        System.out.println("Иван: " + ivan.balance);
        System.out.println("Анна: " + anna.balance);
        System.out.println("Магазин: " + shop.balance);
    }
}