public class User {
    private String name;
    private BankAccount[] bankAccountArray = new BankAccount[0];
    private int accountID;

    public User(String name) {
        this.name = name;
    }

    public void addAccountToUser(String bankAccountName, String accountNumber, double valueOfMoney) {

        BankAccount[] newBankAccountArray = new BankAccount[bankAccountArray.length + 1];
        for (int i = 0; i < this.bankAccountArray.length; i++) {
            newBankAccountArray[i] = bankAccountArray[i];
        }

        newBankAccountArray[newBankAccountArray.length - 1] = new BankAccount(bankAccountName, accountNumber, valueOfMoney);
        newBankAccountArray[newBankAccountArray.length - 1].setId(accountID);
        this.bankAccountArray = newBankAccountArray;
        accountID++;
    }


    public void addMoneyToAccount(String bankAccountName, double valueOfMoneyToAdd) {
        int bankAccountIndex = returnBankAccountIndex(bankAccountName);

        bankAccountArray[bankAccountIndex].setMoney(bankAccountArray[bankAccountIndex].getMoney() + valueOfMoneyToAdd);
    }

    public int returnBankAccountIndex(String name) {
        for (int i = 0; i < bankAccountArray.length; i++) {
            if (bankAccountArray[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean checkIfWeHaveEnoughMoney(String bankAccountName, double valueOfMoneyToAdd) {
        int bankAccountIndex = returnBankAccountIndex(bankAccountName);
        return bankAccountArray[bankAccountIndex].getMoney() >= valueOfMoneyToAdd;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name + "\n");
        for (int i = 0; i < bankAccountArray.length; i++) {
            stringBuilder.append(" | " + bankAccountArray[i] + "\n");
        }
        return stringBuilder.toString();
    }

    public String getName() {
        return name;
    }


}
