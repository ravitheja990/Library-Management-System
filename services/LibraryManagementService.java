package LibraryManagementSystem.services;

import LibraryManagementSystem.model.dao.BookDao;
import LibraryManagementSystem.model.dao.UserDao;
import LibraryManagementSystem.pojo.Book;
import LibraryManagementSystem.pojo.User;

public class LibraryManagementService {
    private UserDao userDao;
    private BookDao bookDao;

    public LibraryManagementService(UserDao userDao, BookDao bookDao) {
        this.userDao = userDao;
        this.bookDao = bookDao;
    }

    public void addUser(User user) {
        this.userDao.addUser(user);
    }
    public void addBook(Book book) {
        this.bookDao.addBook(book);
    }
    public boolean userExists(String userId) {
        return this.userDao.getUser(userId) != null;
    }
    public User getUser(String userId) {
        if(userExists(userId)) {
            return this.userDao.getUser(userId);
        }
        return null;
    }
    public boolean bookExists(String bookId) {
        return this.bookDao.getBook(bookId) != null;
    }
    public Book getBook(String bookId) {
        if(bookExists(bookId)) {
            return this.bookDao.getBook(bookId);
        }
        return null;
    }
    public void removeUser(User user) {
        this.userDao.removeUser(user.getUserId());
    }
    public void removeBook(Book book) {
        this.bookDao.removeBook(book.getBookId());
    }

}
