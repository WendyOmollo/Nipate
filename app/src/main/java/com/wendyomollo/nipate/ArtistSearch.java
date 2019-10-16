
package com.wendyomollo.nipate.main;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.wendyomollo.nipate.main.Video;

public class ArtistSearch {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("etag")
    @Expose
    private String etag;
    @SerializedName("videos")
    @Expose
    private List<Video> videos = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ArtistSearch() {
    }

    /**
     * 
     * @param etag
     * @param videos
     * @param kind
     */
    public ArtistSearch(String kind, String etag, List<Video> videos) {
        super();
        this.kind = kind;
        this.etag = etag;
        this.videos = videos;
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

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

}
