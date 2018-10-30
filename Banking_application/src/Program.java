public class Program {

    static User bank = new User("Bank PKO");


    public static void main(String[] args) {
        bank.addAccountToUser("PKO", "111111111111111111111", 0.0d);


        User kuba = new User("Kuba");
        kuba.addAccountToUser("Mbank", "222222222222222222222222", 1000.0d);
        kuba.addAccountToUser("Multibank", "333333333333333333333333", 150.0d);
        User mateusz = new User("Mateusz");
        mateusz.addAccountToUser("BZ WBK", "444444444444444444444444", 0.0d);
        mateusz.addAccountToUser("Santander", "555555555555555555555555", 0.0d);

        kuba.addMoneyToAccount("Mbank", 101d);
        transferMoney(kuba, "Multibank", mateusz, "BZ WBK", 149.5d);

        System.out.println(kuba);
        System.out.println(mateusz);
        System.out.println(bank);

    }

    public static void transferMoney(User fromUser, String fromUserBankAccountName, User toUser, String toUserBankAccountName, double valueOfMoney) {
        System.out.println( fromUser.getName() + " want to transfer " + valueOfMoney + "zl to " + toUser.getName());
        if (valueOfMoney > 100 && fromUser.checkIfWeHaveEnoughMoney(fromUserBankAccountName, valueOfMoney + valueOfMoney * 0.005d)) {
            bank.addMoneyToAccount("PKO", valueOfMoney * 0.005d);
            fromUser.addMoneyToAccount(fromUserBankAccountName, -(valueOfMoney+valueOfMoney*0.005d));
            toUser.addMoneyToAccount(toUserBankAccountName, valueOfMoney);
        } else if (valueOfMoney <= 100 && fromUser.checkIfWeHaveEnoughMoney(fromUserBankAccountName, valueOfMoney)) {
            fromUser.addMoneyToAccount(fromUserBankAccountName, -valueOfMoney);
            toUser.addMoneyToAccount(toUserBankAccountName, valueOfMoney);
        } else {
            System.out.println("Sorry. " + fromUser.getName() + " can't send money. There is not enough money on account.");
        }

    }
}
