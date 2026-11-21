public class Transaction {

    // 1. От клиента клиенту
    public void clientToClient(Client from, Client to, double amount) {
        if (from.balance >= amount) {
            from.balance = from.balance - amount;
            to.balance = to.balance + amount;
            System.out.println(from.name + " отправил " + amount + " клиенту " + to.name);
        } else {
            System.out.println("У " + from.name + " не хватает денег");
        }
    }

    // 2. От организации клиенту
    public void organizationToClient(Organization from, Client to, double amount) {
        if (from.balance >= amount) {
            from.balance = from.balance - amount;
            to.balance = to.balance + amount;
            System.out.println(from.name + " отправила " + amount + " клиенту " + to.name);
        } else {
            System.out.println("У " + from.name + " не хватает денег");
        }
    }

    // 3. От клиента организации
    public void clientToOrganization(Client from, Organization to, double amount) {
        if (from.balance >= amount) {
            from.balance = from.balance - amount;
            to.balance = to.balance + amount;
            System.out.println(from.name + " отправил " + amount + " организации " + to.name);
        } else {
            System.out.println("У " + from.name + " не хватает денег");
        }
    }
}