package Inheritence;

public class Person {
    int PersonId;
    String PersonName;
    int PersonAge;
    long PersonMobile;

    public Person() {
    }

    public Person(int PersonId, String PersonName, int PersonAge, long PersonMobile) {
        this.PersonId = PersonId;
        this.PersonName = PersonName;
        this.PersonAge = PersonAge;
        this.PersonMobile = PersonMobile;
    }

    // display the information of the person

    public void display() {
        System.out.println("======Person info======");
        System.out.println("ID: " + PersonId);
        System.out.println("Name: " + PersonName);
        System.out.println("Age: " + PersonAge);
        System.out.println("Mobile: " + PersonMobile);

    }
}
