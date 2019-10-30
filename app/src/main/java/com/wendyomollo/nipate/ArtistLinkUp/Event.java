
package com.wendyomollo.nipate.ArtistLinkUp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("name")
    @Expose
    private Name name;
    @SerializedName("description")
    @Expose
    private Description description;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("start")
    @Expose
    private Start start;
    @SerializedName("end")
    @Expose
    private End end;
    @SerializedName("organization_id")
    @Expose
    private String organizationId;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("changed")
    @Expose
    private String changed;
    @SerializedName("capacity")
    @Expose
    private Integer capacity;
    @SerializedName("capacity_is_custom")
    @Expose
    private Boolean capacityIsCustom;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("listed")
    @Expose
    private Boolean listed;
    @SerializedName("shareable")
    @Expose
    private Boolean shareable;
    @SerializedName("invite_only")
    @Expose
    private Boolean inviteOnly;
    @SerializedName("online_event")
    @Expose
    private Boolean onlineEvent;
    @SerializedName("show_remaining")
    @Expose
    private Boolean showRemaining;
    @SerializedName("tx_time_limit")
    @Expose
    private Integer txTimeLimit;
    @SerializedName("hide_start_date")
    @Expose
    private Boolean hideStartDate;
    @SerializedName("hide_end_date")
    @Expose
    private Boolean hideEndDate;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("is_locked")
    @Expose
    private Boolean isLocked;
    @SerializedName("privacy_setting")
    @Expose
    private String privacySetting;
    @SerializedName("is_series")
    @Expose
    private Boolean isSeries;
    @SerializedName("is_series_parent")
    @Expose
    private Boolean isSeriesParent;
    @SerializedName("inventory_type")
    @Expose
    private String inventoryType;
    @SerializedName("is_reserved_seating")
    @Expose
    private Boolean isReservedSeating;
    @SerializedName("show_pick_a_seat")
    @Expose
    private Boolean showPickASeat;
    @SerializedName("show_seatmap_thumbnail")
    @Expose
    private Boolean showSeatmapThumbnail;
    @SerializedName("show_colors_in_seatmap_thumbnail")
    @Expose
    private Boolean showColorsInSeatmapThumbnail;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("is_free")
    @Expose
    private Boolean isFree;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("logo_id")
    @Expose
    private String logoId;
    @SerializedName("organizer_id")
    @Expose
    private String organizerId;
    @SerializedName("venue_id")
    @Expose
    private Object venueId;
    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("subcategory_id")
    @Expose
    private Object subcategoryId;
    @SerializedName("format_id")
    @Expose
    private Object formatId;
    @SerializedName("resource_uri")
    @Expose
    private String resourceUri;
    @SerializedName("is_externally_ticketed")
    @Expose
    private Boolean isExternallyTicketed;
    @SerializedName("logo")
    @Expose
    private Logo logo;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Event() {
    }

    /**
     * 
     * @param shareable
     * @param showSeatmapThumbnail
     * @param showPickASeat
     * @param description
     * @param isReservedSeating
     * @param source
     * @param locale
     * @param capacity
     * @param organizationId
     * @param privacySetting
     * @param organizerId
     * @param txTimeLimit
     * @param isFree
     * @param isLocked
     * @param venueId
     * @param subcategoryId
     * @param logo
     * @param end
     * @param currency
     * @param id
     * @param summary
     * @param capacityIsCustom
     * @param inventoryType
     * @param created
     * @param showRemaining
     * @param isExternallyTicketed
     * @param start
     * @param hideStartDate
     * @param showColorsInSeatmapThumbnail
     * @param resourceUri
     * @param version
     * @param url
     * @param isSeries
     * @param inviteOnly
     * @param formatId
     * @param listed
     * @param isSeriesParent
     * @param name
     * @param hideEndDate
     * @param onlineEvent
     * @param logoId
     * @param categoryId
     * @param changed
     * @param status
     */
    public Event(Name name, Description description, String id, String url, Start start, End end, String organizationId, String created, String changed, Integer capacity, Boolean capacityIsCustom, String status, String currency, Boolean listed, Boolean shareable, Boolean inviteOnly, Boolean onlineEvent, Boolean showRemaining, Integer txTimeLimit, Boolean hideStartDate, Boolean hideEndDate, String locale, Boolean isLocked, String privacySetting, Boolean isSeries, Boolean isSeriesParent, String inventoryType, Boolean isReservedSeating, Boolean showPickASeat, Boolean showSeatmapThumbnail, Boolean showColorsInSeatmapThumbnail, String source, Boolean isFree, String version, String summary, String logoId, String organizerId, Object venueId, String categoryId, Object subcategoryId, Object formatId, String resourceUri, Boolean isExternallyTicketed, Logo logo) {
        super();
        this.name = name;
        this.description = description;
        this.id = id;
        this.url = url;
        this.start = start;
        this.end = end;
        this.organizationId = organizationId;
        this.created = created;
        this.changed = changed;
        this.capacity = capacity;
        this.capacityIsCustom = capacityIsCustom;
        this.status = status;
        this.currency = currency;
        this.listed = listed;
        this.shareable = shareable;
        this.inviteOnly = inviteOnly;
        this.onlineEvent = onlineEvent;
        this.showRemaining = showRemaining;
        this.txTimeLimit = txTimeLimit;
        this.hideStartDate = hideStartDate;
        this.hideEndDate = hideEndDate;
        this.locale = locale;
        this.isLocked = isLocked;
        this.privacySetting = privacySetting;
        this.isSeries = isSeries;
        this.isSeriesParent = isSeriesParent;
        this.inventoryType = inventoryType;
        this.isReservedSeating = isReservedSeating;
        this.showPickASeat = showPickASeat;
        this.showSeatmapThumbnail = showSeatmapThumbnail;
        this.showColorsInSeatmapThumbnail = showColorsInSeatmapThumbnail;
        this.source = source;
        this.isFree = isFree;
        this.version = version;
        this.summary = summary;
        this.logoId = logoId;
        this.organizerId = organizerId;
        this.venueId = venueId;
        this.categoryId = categoryId;
        this.subcategoryId = subcategoryId;
        this.formatId = formatId;
        this.resourceUri = resourceUri;
        this.isExternallyTicketed = isExternallyTicketed;
        this.logo = logo;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Start getStart() {
        return start;
    }

    public void setStart(Start start) {
        this.start = start;
    }

    public End getEnd() {
        return end;
    }

    public void setEnd(End end) {
        this.end = end;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getChanged() {
        return changed;
    }

    public void setChanged(String changed) {
        this.changed = changed;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Boolean getCapacityIsCustom() {
        return capacityIsCustom;
    }

    public void setCapacityIsCustom(Boolean capacityIsCustom) {
        this.capacityIsCustom = capacityIsCustom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getListed() {
        return listed;
    }

    public void setListed(Boolean listed) {
        this.listed = listed;
    }

    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }

    public Boolean getInviteOnly() {
        return inviteOnly;
    }

    public void setInviteOnly(Boolean inviteOnly) {
        this.inviteOnly = inviteOnly;
    }

    public Boolean getOnlineEvent() {
        return onlineEvent;
    }

    public void setOnlineEvent(Boolean onlineEvent) {
        this.onlineEvent = onlineEvent;
    }

    public Boolean getShowRemaining() {
        return showRemaining;
    }

    public void setShowRemaining(Boolean showRemaining) {
        this.showRemaining = showRemaining;
    }

    public Integer getTxTimeLimit() {
        return txTimeLimit;
    }

    public void setTxTimeLimit(Integer txTimeLimit) {
        this.txTimeLimit = txTimeLimit;
    }

    public Boolean getHideStartDate() {
        return hideStartDate;
    }

    public void setHideStartDate(Boolean hideStartDate) {
        this.hideStartDate = hideStartDate;
    }

    public Boolean getHideEndDate() {
        return hideEndDate;
    }

    public void setHideEndDate(Boolean hideEndDate) {
        this.hideEndDate = hideEndDate;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public String getPrivacySetting() {
        return privacySetting;
    }

    public void setPrivacySetting(String privacySetting) {
        this.privacySetting = privacySetting;
    }

    public Boolean getIsSeries() {
        return isSeries;
    }

    public void setIsSeries(Boolean isSeries) {
        this.isSeries = isSeries;
    }

    public Boolean getIsSeriesParent() {
        return isSeriesParent;
    }

    public void setIsSeriesParent(Boolean isSeriesParent) {
        this.isSeriesParent = isSeriesParent;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public Boolean getIsReservedSeating() {
        return isReservedSeating;
    }

    public void setIsReservedSeating(Boolean isReservedSeating) {
        this.isReservedSeating = isReservedSeating;
    }

    public Boolean getShowPickASeat() {
        return showPickASeat;
    }

    public void setShowPickASeat(Boolean showPickASeat) {
        this.showPickASeat = showPickASeat;
    }

    public Boolean getShowSeatmapThumbnail() {
        return showSeatmapThumbnail;
    }

    public void setShowSeatmapThumbnail(Boolean showSeatmapThumbnail) {
        this.showSeatmapThumbnail = showSeatmapThumbnail;
    }

    public Boolean getShowColorsInSeatmapThumbnail() {
        return showColorsInSeatmapThumbnail;
    }

    public void setShowColorsInSeatmapThumbnail(Boolean showColorsInSeatmapThumbnail) {
        this.showColorsInSeatmapThumbnail = showColorsInSeatmapThumbnail;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLogoId() {
        return logoId;
    }

    public void setLogoId(String logoId) {
        this.logoId = logoId;
    }

    public String getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(String organizerId) {
        this.organizerId = organizerId;
    }

    public Object getVenueId() {
        return venueId;
    }

    public void setVenueId(Object venueId) {
        this.venueId = venueId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Object getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(Object subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public Object getFormatId() {
        return formatId;
    }

    public void setFormatId(Object formatId) {
        this.formatId = formatId;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    public Boolean getIsExternallyTicketed() {
        return isExternallyTicketed;
    }

    public void setIsExternallyTicketed(Boolean isExternallyTicketed) {
        this.isExternallyTicketed = isExternallyTicketed;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

}