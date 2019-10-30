
package com.wendyomollo.nipate.ArtistLinkUp;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ArtistLinkUp {

    @SerializedName("pagination")
    @Expose
    private Pagination pagination;
    @SerializedName("events")
    @Expose
    private List<Event> events = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ArtistLinkUp() {
    }

    /**
     * 
     * @param pagination
     * @param events
     */
    public ArtistLinkUp(Pagination pagination, List<Event> events) {
        super();
        this.pagination = pagination;
        this.events = events;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

}
