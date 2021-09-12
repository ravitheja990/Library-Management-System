package LibraryManagementSystem.services;

import LibraryManagementSystem.model.dao.BookDao;
import LibraryManagementSystem.model.dao.UserDao;
import LibraryManagementSystem.pojo.Book;
import LibraryManagementSystem.pojo.User;

import java.util.Date;

public class LibraryManagementServiceTest {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        BookDao bookDao = new BookDao();
        LibraryManagementService libraryManagementService = new LibraryManagementService(userDao, bookDao);
        User user = new User();
        user.setUserId("A");
        user.setUserName("Ravi");
        user.setUserType("ISSUEE");
        user.setUserBookIssueCapacity(4);
        User user2 = new User();
        user2.setUserId("B");
        user2.setUserName("Mohan");
        user2.setUserType("ISSUER");
        user2.setUserBookIssueCapacity(5);
        Book book = new Book();
        book.setBookId("1");
        book.setBookName("DS");

        libraryManagementService.addUser(user);
        libraryManagementService.addUser(user2);
        libraryManagementService.addBook(book);

        System.out.println(libraryManagementService.getUser("A").toString());
        System.out.println(libraryManagementService.getUser("B").toString());
        System.out.println(libraryManagementService.getBook("1").toString());

        book.setIssuedOn(new Date());
        book.setReturnDueDate(new Date());
        book.setIssueeId("A");
        book.setIssuerId("B");
        libraryManagementService.addBook(book);
        System.out.println(libraryManagementService.getBook("1").toString());

    }
}
