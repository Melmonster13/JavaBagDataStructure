import java.util.HashMap;
import java.util.Map;

public class Bag<T> {
    // Store elements and their counts in a HashMap
    private final Map<T, Integer> elements;

    // Initialize empty bag
    public Bag() {
        elements = new HashMap<>();
    }

    // Add an item and increment count
    public void add(T item) {
        elements.put(item, elements.getOrDefault(item, 0) + 1);
    }

    // Return total number of elements in bag including duplicates
    public int size() {
        int totalSize = 0;
        for (int count : elements.values()) {
            totalSize += count;
        }
        return totalSize;
    }

    // Merge another bag into current bag
    public void merge(Bag<T> otherBag) {
        for (Map.Entry<T, Integer> entry : otherBag.elements.entrySet()) {
            elements.put(entry.getKey(), elements.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }
    }

    // Return new bag only containing distinct elements
    public Bag<T> distinct() {
        Bag<T> distinctBag = new Bag<>();
        for (T item : elements.keySet()) {
            distinctBag.add(item);
        }
        return distinctBag;
    }

    // Format the bag contents as string with counts
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Bag contents: ");
        for (Map.Entry<T, Integer> entry : elements.entrySet()) {
            sb.append(entry.getKey())
                    .append(": ")
                    .append("(")
                    .append(entry.getValue())
                    .append(")");
        }
        return sb.toString();
    }
}
