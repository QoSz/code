import java.util.HashSet;

class HashSets_ {
    public static void main(String[] args) {
        HashSet<String> animal = new HashSet<>();
        animal.add("Dog");
        animal.add("Cat");
        animal.add("Zebra");
        animal.add("Lion");
        animal.add("Lion"); // Duplicate values are ignored as a set can only contain unique values.

        System.out.printf("%s\n", animal);
        animal.remove("Zebra");
        System.out.printf("%s\n", animal); // Removed zebra from the list.
        System.out.printf("%d\n", animal.size()); // Printing the size of the hash set
        System.out.println(animal.contains("Giraffe")); // Checks weather the hash set contains a certain animal.
        animal.clear(); // Clears everything from the hash set.
        System.out.println(animal);

        System.out.println("");
        System.out.println("Working with integers.");
        System.out.println("");

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(999);
        numbers.add(7);
        numbers.add(10);
        numbers.add(45);

        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());

    }
}