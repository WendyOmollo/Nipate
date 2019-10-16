
package com.wendyomollo.nipate.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContentDetails {

    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("aspectRatio")
    @Expose
    private String aspectRatio;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContentDetails() {
    }

    /**
     * 
     * @param duration
     * @param aspectRatio
     */
    public ContentDetails(String duration, String aspectRatio) {
        super();
        this.duration = duration;
        this.aspectRatio = aspectRatio;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

}
