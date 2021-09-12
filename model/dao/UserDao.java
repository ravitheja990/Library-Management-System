package LibraryManagementSystem.model.dao;

import LibraryManagementSystem.model.db.Database;
import LibraryManagementSystem.pojo.User;

public class UserDao {
    public void addUser(User user) {
        Database.getUserTable().put(user.getUserId(), user);
    }
    public User getUser(String userId) {
        return Database.getUserTable().get(userId);
    }
    public void removeUser(String userId) {
        Database.getUserTable().remove(userId);
        new BookDao().removeUserFromBookTable(userId);
    }
}
