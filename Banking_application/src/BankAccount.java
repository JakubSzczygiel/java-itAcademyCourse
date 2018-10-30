public class BankAccount {
    private String name;
    private int id;
    private String accountNumber;
    private double money;

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public BankAccount(String bankAccountName, String accountNumber, double valueOfMoney) {
        this.name = bankAccountName;
        this.accountNumber = accountNumber;
        this.money = valueOfMoney;
    }


    public String toString() {
        return id + " " + name + " " + accountNumber + " " + (Math.round(money * 100d)) / 100d + "zl";

    }

}
