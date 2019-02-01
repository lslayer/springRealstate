package ua.foxmind.retail.model;
// example model


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {

    @Id
    private ObjectId _id;
    private String userName;
    private String phoneNum;

    public Customer() {
    }

    public Customer(ObjectId _id, String userName, String phoneNum) {

        this._id = _id;
        this.userName = userName;
        this.phoneNum = phoneNum;
    }

    public String get_id() {

        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
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

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (_id != null ? !_id.equals(customer._id) : customer._id != null) return false;
        if (userName != null ? !userName.equals(customer.userName) : customer.userName != null) return false;
        return phoneNum != null ? phoneNum.equals(customer.phoneNum) : customer.phoneNum == null;
    }

    @Override
    public int hashCode() {
        int result = _id != null ? _id.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (phoneNum != null ? phoneNum.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "_id=" + _id +
                ", userName='" + userName + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
