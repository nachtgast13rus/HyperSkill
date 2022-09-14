package javaCore.collections.myCollections.structure;


public class StructureTest {
    public static void main(String[] args) {
        Structure<Integer> structure = new Structure<>();
        structure.add(10);
        structure.add(15);
        structure.add(19);

        for (Integer integer : structure) {
            System.out.println(integer);
        }

        structure.iterator().forEachRemaining(System.out::println);
        structure.forEach(System.out::println);

    }
}
