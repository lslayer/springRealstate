package ua.foxmind.retail.model;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;


public class ItemPrices {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int ItemPricesId;
    String dateFrom;
    String dateTo;

    //  Как я должен обозначать отношения к item?  Как к объекту или как в базах:  item.itemId ?
    @OneToMany
    Item item;


    // Ниже автогенерация.

    public ItemPrices() {
    }

    public ItemPrices(String dateFrom, String dateTo, Item item) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.item = item;
    }

    public int getItemPricesId() {
        return ItemPricesId;
    }

    public void setItemPricesId(int itemPricesId) {
        ItemPricesId = itemPricesId;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
