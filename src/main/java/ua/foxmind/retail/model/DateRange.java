package ua.foxmind.retail.model;

import java.time.LocalDateTime;


//It's not an document; we don't need to store this data separately from order;
public class DateRange {

    private LocalDateTime begins;
    private LocalDateTime ends;



    ///*******/// Boilerplate
    @Override
    public String toString() {
        return "DateRange{" +
                "begins=" + begins +
                ", ends=" + ends +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DateRange)) return false;

        DateRange dateRange = (DateRange) o;

        if (getBegins() != null ? !getBegins().equals(dateRange.getBegins()) : dateRange.getBegins() != null)
            return false;
        return getEnds() != null ? getEnds().equals(dateRange.getEnds()) : dateRange.getEnds() == null;
    }

    @Override
    public int hashCode() {
        int result = getBegins() != null ? getBegins().hashCode() : 0;
        result = 31 * result + (getEnds() != null ? getEnds().hashCode() : 0);
        return result;
    }

    public LocalDateTime getBegins() {

        return begins;
    }

    public void setBegins(LocalDateTime begins) {
        this.begins = begins;
    }

    public LocalDateTime getEnds() {
        return ends;
    }

    public void setEnds(LocalDateTime ends) {
        this.ends = ends;
    }

    public DateRange(LocalDateTime begins, LocalDateTime ends) {

        this.begins = begins;
        this.ends = ends;
    }
}
