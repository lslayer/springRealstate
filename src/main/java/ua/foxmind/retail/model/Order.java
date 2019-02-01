package ua.foxmind.retail.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Order {

    @Id
    private ObjectId _id;
    private Customer customer;
    private Item item; //can ve extended to list of items, but for the first iteration we will use one item per one order
    private Long totalPrice;
    private DateRange dates;

    ///***********/// Boilerplate

    public Order() {
    }

    public Order(ObjectId _id, Customer customer, Item item, Long totalPrice, DateRange dates) {

        this._id = _id;
        this.customer = customer;
        this.item = item;
        this.totalPrice = totalPrice;
        this.dates = dates;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public DateRange getDates() {
        return dates;
    }

    public void setDates(DateRange dates) {
        this.dates = dates;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (_id != null ? !_id.equals(order._id) : order._id != null) return false;
        if (customer != null ? !customer.equals(order.customer) : order.customer != null) return false;
        if (item != null ? !item.equals(order.item) : order.item != null) return false;
        if (totalPrice != null ? !totalPrice.equals(order.totalPrice) : order.totalPrice != null) return false;
        return dates != null ? dates.equals(order.dates) : order.dates == null;
    }

    @Override
    public int hashCode() {
        int result = _id != null ? _id.hashCode() : 0;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (totalPrice != null ? totalPrice.hashCode() : 0);
        result = 31 * result + (dates != null ? dates.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "_id=" + _id +
                ", customer=" + customer +
                ", item=" + item +
                ", totalPrice=" + totalPrice +
                ", dates=" + dates +
                '}';
    }
}
