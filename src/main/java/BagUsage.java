public class BagUsage {
    public static void main(String[] args) {
        // Create two bag instances
        Bag<String> bag1 = new Bag<>();
        Bag<String> bag2 = new Bag<>();

        // Add items to bag1
        bag1.add("kitten");
        bag1.add("snake");
        bag1.add("kitten"); // Duplicate item
        bag1.add("dinosaur");

        // Add items to bag2
        bag2.add("mouse");
        bag2.add("fox");
        bag2.add("kitten");

        // Print bag sizes
        System.out.println("Bag1 size: " + bag1.size());
        System.out.println("Bag2 size: " + bag2.size());

        // Merge bag2 into bag1
        bag1.merge(bag2);
        System.out.println("\nBag1 and Bag2 merged:");
        System.out.println(bag1);

        // Get distinct items
        Bag<String> distinctBag = bag1.distinct();
        System.out.println("\nDistinct items in Bag1:");
        System.out.println(distinctBag);
    }
}
