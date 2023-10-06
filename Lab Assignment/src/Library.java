public class Library {
    private LibraryItem[] collection;
    private LibraryItem[] borrowedItems;
    private int collectionSize;
    private int borrowedItemsSize;

    public Library(int maxSize) {
        collection = new LibraryItem[maxSize];
        borrowedItems = new LibraryItem[maxSize];
        collectionSize = 0;
        borrowedItemsSize = 0;
    }

    public void addItem(LibraryItem item) {
        if (collectionSize < collection.length) {
            collection[collectionSize++] = item;
            System.out.println("Added item: " + item.getTitle());
        } else {
            System.out.println("Collection is full. Cannot add more items.");
        }
    }

    public void borrowItem(LibraryItem item) {
        int index = findItemIndex(collection, item, collectionSize);
        if (index != -1) {
            for (int i = index; i < collectionSize - 1; i++) {
                collection[i] = collection[i + 1];
            }
            collectionSize--;
            borrowedItems[borrowedItemsSize++] = item;
            System.out.println("Borrowed item: " + item.getTitle());
        } else {
            System.out.println("Not Found in the Collection!!");
        }
    }

    public void returnItem(LibraryItem item) {
        int index = findItemIndex(borrowedItems, item, borrowedItemsSize);
        if (index != -1) {
            for (int i = index; i < borrowedItemsSize - 1; i++) {
                borrowedItems[i] = borrowedItems[i + 1];
            }
            borrowedItemsSize--;
            collection[collectionSize++] = item;
            System.out.println("Returned item: " + item.getTitle());
        } else {
            System.out.println("Not Found in Borrowed Items!!");
        }
    }

    public void displayAvailableItems() {
        System.out.println("Available Items:");
        for (int i = 0; i < collectionSize; i++) {
            System.out.println(collection[i].getTitle());
        }
    }

    public void displayBorrowedItems() {
        System.out.println("Borrowed Items:");
        for (int i = 0; i < borrowedItemsSize; i++) {
            System.out.println(borrowedItems[i].getTitle());
        }
    }

    private int findItemIndex(LibraryItem[] items, LibraryItem item, int size) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }
}
