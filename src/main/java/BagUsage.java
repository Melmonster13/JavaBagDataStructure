public class BagUsage {
    public static void main(String[] args) {
        // Create a new bag instance
        Bag<String> bag = new Bag<>();

        // Add items to include duplicates
        bag.add("kitten");
        bag.add("snake");
        bag.add("kitten"); // Duplicate item
        bag.add("dinosaur");

        // Display initial bag state
        System.out.println(bag);

        // Test contains() method
        System.out.println("Contains snake? " + bag.contains("snake"));
        System.out.println("Contains dog? " + bag.contains("dog"));

        // Test count() method with different items
        System.out.println("Number of kittens: " + bag.count("kitten"));
        System.out.println("Number of dinosaurs: " + bag.count("dinosaur"));

        // Test remove() method
        bag.remove("kitten");
        System.out.println("\nAfter removing one kitten:");
        System.out.println(bag);

        // Verify state after removal of item
        System.out.println("Contains kitten? " + bag.contains("kitten"));
        System.out.println("Count of kittens: " + bag.count("kitten"));
    }
}
