package LibraryManagementSystem.pojo;

public class User {
    private String userName;
    private String userId;
    private int userBookIssueCapacity;
    private String userType;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getUserBookIssueCapacity() {
        return userBookIssueCapacity;
    }

    public void setUserBookIssueCapacity(int userBookIssueCapacity) {
        this.userBookIssueCapacity = userBookIssueCapacity;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userId='" + userId + '\'' +
                ", userBookIssueCapacity=" + userBookIssueCapacity +
                ", userType='" + userType + '\'' +
                '}';
    }
}
