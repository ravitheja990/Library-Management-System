package LibraryManagementSystem.model.dao;

import LibraryManagementSystem.model.db.Database;
import LibraryManagementSystem.pojo.Book;

public class BookDao {
    public void addBook(Book book) {
        Database.getBookTable().put(book.getBookId(), book);
    }
    public Book getBook(String bookId) {
        return Database.getBookTable().get(bookId);
    }
    public void removeBook(String bookId) {
        Database.getBookTable().remove(bookId);
    }
    public void removeUserFromBookTable(String userId) {
        Database.removeIssueeIdFromBookTable(userId);
    }

}
