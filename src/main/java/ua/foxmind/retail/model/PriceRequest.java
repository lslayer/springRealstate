package ua.foxmind.retail.model;

import org.springframework.data.annotation.Id;

import javax.persistence.*;


public class PriceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int priceRequestId;
    String requestText;
    // Наверное для requestDate нужно иметь какой-то тип типа Даты.
    String requestDate;

    //  Как я должен обозначать отношения к item?  Как к объекту или как в базах:  item.itemId ?
    @OneToMany
    Item item;

    public PriceRequest() {
    }

    public PriceRequest(String requestText, String requestDate, Item item) {
        this.requestText = requestText;
        this.requestDate = requestDate;
        this.item = item;
    }

    public int getPriceRequestId() {
        return priceRequestId;
    }

    public void setPriceRequestId(int priceRequestId) {
        this.priceRequestId = priceRequestId;
    }

    public String getRequestText() {
        return requestText;
    }

    public void setRequestText(String requestText) {
        this.requestText = requestText;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
