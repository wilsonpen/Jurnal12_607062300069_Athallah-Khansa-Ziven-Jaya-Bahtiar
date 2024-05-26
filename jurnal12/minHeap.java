import java.util.PriorityQueue;


class MinHeap {
    private PriorityQueue<ListPriority> heap;

    public MinHeap() {
        heap = new PriorityQueue<>();
    }

    public void add(ListPriority lp) {
        heap.add(lp);
    }

    public ListPriority remove() {
        return heap.poll();
    }

    public int size() {
        return heap.size();
    }

    public ListPriority peek() {
        return heap.peek();
    }
}

class ListPriority implements Comparable<ListPriority> {
    private int priority;
    private String description;

    /**
     * Constructs a work order with a given priority and description.
     *
     * @param aPriority    the priority of this work order
     * @param aDescription the description of this work order
     */
    public ListPriority(int aPriority, String aDescription) {
        priority = aPriority;
        description = aDescription;
    }

    public String toString() {
        return "Task terdekat yang harus diselesaikan: " + description;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public int compareTo(ListPriority other) {
        return Integer.compare(this.priority, other.priority);
    }
}