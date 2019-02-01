package ua.foxmind.retail.model;

import org.springframework.data.annotation.Id;
import javax.persistence.*;


public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int itmeId;
    String description;

    public Item() {
    }

    public Item(String description) {
        this.description = description;
    }

    public int getItmeId() {
        return itmeId;
    }

    public void setItmeId(int itmeId) {
        this.itmeId = itmeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("Item: {itmeId: %s, description: %s}", itmeId, description);
    }

}
