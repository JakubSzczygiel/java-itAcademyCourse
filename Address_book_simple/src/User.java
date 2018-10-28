public class User {
    private String name;
    private String surname;
    private int age;
    private String gender;
    Address address;


    public User(String gender, String name, String surname, int age, String street, int homeNumber, int flatNumber, int postCode, String city) {
        address=new Address(street, homeNumber, flatNumber, postCode, city);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender=gender;
    }

    public User(String gender, String name, String surname, int age, String street, int homeNumber, int postCode, String city) {
        this(gender,name,surname,age,street,homeNumber,0,postCode,city);
    }

    public String toString() {
        return (gender + " | " + name + " | " + surname + " | " + age + " | " + address);
    }
}

