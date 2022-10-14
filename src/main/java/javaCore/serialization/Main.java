package javaCore.serialization;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("src", "Main", "java", "javaCore", "serialization", "object1.out");
//        extracted(path);
//        readObject(path);
        Person oleg = new Person("Oleg", 25);
        Person petr = new Person("Petr", 25);
        List<Person> workers = new ArrayList<>();
        workers.add(oleg);
        workers.add(petr);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            objectOutputStream.writeObject(workers);
        }
        workers.clear();
        System.out.println(workers);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            workers = (List<Person>) objectInputStream.readObject();
        }
        System.out.println(workers);



    }

    private static void extracted(Path path) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            Person oleg = new Person("Oleg", 40);
            objectOutputStream.writeObject(oleg);
        }
    }

    private static void readObject(Path path) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Object o = objectInputStream.readObject();
            System.out.println(o);

        }
    }


}
