public class AddressBook {
    private User[] userArray = new User[0];

  /*  public void printUsers() {
        for (int i = 0; i < userArray.length; i++) {
            System.out.println(userArray[i]);
        }
        System.out.print("\n");
    }*/

    public void addUserToArray(User user) {
        User[] newUserArray = new User[this.userArray.length + 1];
        for (int i = 0; i < this.userArray.length; i++) {
            newUserArray[i] = userArray[i];
        }
        newUserArray[newUserArray.length - 1] = user;
        this.userArray = newUserArray;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < userArray.length; i++) {
            stringBuilder.append(userArray[i] + "\n");
        }
        stringBuilder.append("\n");

        return stringBuilder.toString();
    }
}
