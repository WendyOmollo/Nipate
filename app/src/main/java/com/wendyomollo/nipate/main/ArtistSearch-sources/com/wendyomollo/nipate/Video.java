
package com.wendyomollo.nipate;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Video {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("etag")
    @Expose
    private String etag;
    @SerializedName("snippet")
    @Expose
    private com.wendyomollo.nipate.Snippet snippet;
    @SerializedName("contentDetails")
    @Expose
    private com.wendyomollo.nipate.ContentDetails contentDetails;
    @SerializedName("statistics")
    @Expose
    private com.wendyomollo.nipate.Statistics statistics;
    @SerializedName("status")
    @Expose
    private com.wendyomollo.nipate.Status status;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Video() {
    }

    /**
     * 
     * @param id
     * @param etag
     * @param status
     * @param snippet
     * @param contentDetails
     * @param kind
     * @param statistics
     */
    public Video(String id, String kind, String etag, com.wendyomollo.nipate.Snippet snippet, com.wendyomollo.nipate.ContentDetails contentDetails, com.wendyomollo.nipate.Statistics statistics, com.wendyomollo.nipate.Status status) {
        super();
        this.id = id;
        this.kind = kind;
        this.etag = etag;
        this.snippet = snippet;
        this.contentDetails = contentDetails;
        this.statistics = statistics;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public com.wendyomollo.nipate.Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(com.wendyomollo.nipate.Snippet snippet) {
        this.snippet = snippet;
    }

    public com.wendyomollo.nipate.ContentDetails getContentDetails() {
        return contentDetails;
    }

    public void setContentDetails(com.wendyomollo.nipate.ContentDetails contentDetails) {
        this.contentDetails = contentDetails;
    }

    public com.wendyomollo.nipate.Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(com.wendyomollo.nipate.Statistics statistics) {
        this.statistics = statistics;
    }

    public com.wendyomollo.nipate.Status getStatus() {
        return status;
    }

    public void setStatus(com.wendyomollo.nipate.Status status) {
        this.status = status;
    }

}
