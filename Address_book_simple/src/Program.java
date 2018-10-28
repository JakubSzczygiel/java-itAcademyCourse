public class Program {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        User kasia = new User("female","Kasia", "Szczygiel", 27, "Maslicka",177, 5,54104,"Wroclaw");
        User kuba = new User("male","Kuba", "Szczygiel", 27,"Maslicka",177, 5,54104,"Wroclaw");
        User mateusz = new User("male","Mateusz", "Szczygiel", 30,"Maslicka",177,54104,"Wroclaw");

        addressBook.addUserToArray(kasia);
        addressBook.addUserToArray(kuba);
        addressBook.addUserToArray(mateusz);

        System.out.println(addressBook.toString());

    }
}
