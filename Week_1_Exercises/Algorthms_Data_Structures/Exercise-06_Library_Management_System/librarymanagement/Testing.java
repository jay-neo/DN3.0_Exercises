package librarymanagement;

class Testing {
    public static void main(String[] args) {
        Library library = new Library(10);

        Book book1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("B002", "To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("B003", "1984", "George Orwell");

        // Add Books
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display All Books
        System.out.println("All Books:");
        library.displayBooks();

        // Linear Search
        System.out.println("\nLinear Search for '1984':");
        Book foundBookLinear = library.linearSearchByTitle("1984");
        if (foundBookLinear != null) {
            System.out.println(foundBookLinear);
        } else {
            System.out.println("Book not found.");
        }

        // Binary Search
        System.out.println("\nBinary Search for 'To Kill a Mockingbird':");
        Book foundBookBinary = library.binarySearchByTitle("To Kill a Mockingbird");
        if (foundBookBinary != null) {
            System.out.println(foundBookBinary);
        } else {
            System.out.println("Book not found.");
        }
    }
}
