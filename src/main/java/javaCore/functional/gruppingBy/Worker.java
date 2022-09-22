package javaCore.functional.gruppingBy;

import java.util.Scanner;

public class Worker {
    Scanner scanner = new Scanner(System.in);
    private String name;
    private int age;
    private int salary;
    private String position;

    public Worker(String name, int age, int salary, String position) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "scanner=" + scanner +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }

    public String getPosition() {
        return position;
    }
}
