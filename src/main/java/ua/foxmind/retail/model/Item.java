package ua.foxmind.retail.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Item {

    @Id
    private ObjectId _id;
    private String description;
    private Long price;

    public Item() {
    }

    public Item(ObjectId _id, String description, Long price) {
        this._id = _id;
        this.description = description;
        this.price = price;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        if (!get_id().equals(item.get_id())) return false;
        if (getDescription() != null ? !getDescription().equals(item.getDescription()) : item.getDescription() != null)
            return false;
        return getPrice().equals(item.getPrice());
    }

    @Override
    public int hashCode() {
        int result = get_id().hashCode();
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + getPrice().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Item{" +
                "_id=" + _id +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
