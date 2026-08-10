class Account {
    String name;
    double balance;

    Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void transfer(Account receiver, double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            receiver.balance = receiver.balance + amount;

            System.out.println("Transfer successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void showBalance() {
        System.out.println(name + " Balance = Rs. " + balance);
    }

    public static void main(String[] args) {
        Account a1 = new Account("Amit", 5000);
        Account a2 = new Account("Rahul", 2000);

        a1.transfer(a2, 1500);

        a1.showBalance();
        a2.showBalance();
    }
}