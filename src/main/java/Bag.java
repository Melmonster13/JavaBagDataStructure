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

    // Remove one occurrence of item
    public void remove(T item) {
        Integer count = elements.get(item);
        if (count != null) {
            if (count == 1) {
                // Remove item completely if it's last occurrence
                elements.remove(item);
            } else {
                // Decrement count if multiple occurrences exist
                elements.put(item, count - 1);
            }
        }
    }

    // Check if item is in bag
    public boolean contains(T item) {
        return elements.containsKey(item);
    }

    // Get count of item occurrences
    public int count(T item) {
        return elements.getOrDefault(item, 0);
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
