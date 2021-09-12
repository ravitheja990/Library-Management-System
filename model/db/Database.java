package LibraryManagementSystem.model.db;

import LibraryManagementSystem.pojo.Book;
import LibraryManagementSystem.pojo.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Database {
    private static Map<String, Book> bookTable;
    private static Map<String, User> userTable;

    public static Map<String, Book> getBookTable() {
        if(Objects.isNull(bookTable)) {
            bookTable = new HashMap<>();
            return bookTable;
        }
        return bookTable;
    }

    public static Map<String, User> getUserTable() {
        if(Objects.isNull(userTable)) {
            userTable = new HashMap<>();
            return userTable;
        }
        return userTable;
    }

    public static int getUserTableSize() {
        if (Objects.isNull(userTable)) {
            return 0;
        }
        return userTable.size();
    }

    public static int getBookTableSize() {
        if (Objects.isNull(bookTable)) {
            return 0;
        }
        return bookTable.size();
    }

    public static void removeIssueeIdFromBookTable(String issueeId) {
        // make issueeId of bookTable record where issueeId is same as given id.
    }
}
