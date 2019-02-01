package ua.foxmind.retail.model;
// example model


import org.springframework.data.annotation.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int userId;
    String userName;
    String phoneNum;

    // Вот здесь я конечно не уверен как писать: Каждый клиент может создавать много запросов на разные items
    @ManyToMany(mappedBy = "items")
    private Set<Item> items  = new HashSet<>();

    public Customer() {
    }

    public Customer(String userName, String phoneNum) {
        this.userName = userName;
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return String.format("Task: {user: %s, userName: %s, phoneNum: %s}", userId, userName, phoneNum);
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

}
