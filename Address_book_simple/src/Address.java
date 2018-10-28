public class Address {
    private String city;
    private String street;
    private int homeNumber;
    private int flatNumber;
    private int postCode;

    public Address(String street, int homeNumber, int flatNumber, int postCode, String city){
        this.street=street;
        this.homeNumber=homeNumber;
        this.flatNumber=flatNumber;
        this.postCode=postCode;
        this.city=city;
    }

    public String toString() {
        String address;
        address=(flatNumber>0)?(street + " | " + homeNumber + "/" + flatNumber + " | " + postCode/1000 +"-"+postCode%1000 + " | " + city):(street + " | " + homeNumber + " | " + postCode/1000 +"-"+postCode%1000 + " | " + city);
        return address;
    }
}


