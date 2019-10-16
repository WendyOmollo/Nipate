
package com.wendyomollo.nipate.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Status {

    @SerializedName("uploadStatus")
    @Expose
    private String uploadStatus;
    @SerializedName("privacyStatus")
    @Expose
    private String privacyStatus;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Status() {
    }

    /**
     * 
     * @param privacyStatus
     * @param uploadStatus
     */
    public Status(String uploadStatus, String privacyStatus) {
        super();
        this.uploadStatus = uploadStatus;
        this.privacyStatus = privacyStatus;
    }

    public String getUploadStatus() {
        return uploadStatus;
    }

    public void setUploadStatus(String uploadStatus) {
        this.uploadStatus = uploadStatus;
    }

    public String getPrivacyStatus() {
        return privacyStatus;
    }

    public void setPrivacyStatus(String privacyStatus) {
        this.privacyStatus = privacyStatus;
    }

}
