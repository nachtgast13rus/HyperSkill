package javaCore.collections.threeMap;

public class Person {
    private int id;
    private String lastName;
    private int salary;

    public Person(int id, String lastName, int salary) {
        this.id = id;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
