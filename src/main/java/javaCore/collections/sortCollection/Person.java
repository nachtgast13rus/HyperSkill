package javaCore.collections.sortCollection;

public class Person implements Comparable<Person> {
    private int id;
    private String firstName;
    private String lastName;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
//        if (id == o.id) {
//            return 0;
//        } else if (id > o.id) {
//            return 1;
//        } else {
//            return 0;
//        }

//        return id - o.id;
        return Integer.compare(id, o.id);
    }
}
