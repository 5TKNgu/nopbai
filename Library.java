package az;
public class Library {
    book[] books;

    public void setBooks(book[] books) {
        this.books = books;
    }
    public void Quantity(int books){

    }
    public book[] getBooks() {
        return books;
    }

    public book getBookByName(String name) {
        for (book book : books) {
            if (book.getName().equals(name)) {
                return book;
            }
        }
        return null;
    }

    public book[] getBookByAuthor(String author) {
        book[] result = new book[books.length];
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().equals(author)) {
                result[i] = books[i];
            }
        }
        return result;
    }
}
