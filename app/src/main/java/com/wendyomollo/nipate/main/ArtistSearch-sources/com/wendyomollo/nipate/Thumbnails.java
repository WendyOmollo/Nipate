
package com.wendyomollo.nipate;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thumbnails {

    @SerializedName("default")
    @Expose
    private com.wendyomollo.nipate.Default _default;
    @SerializedName("medium")
    @Expose
    private com.wendyomollo.nipate.Medium medium;
    @SerializedName("high")
    @Expose
    private com.wendyomollo.nipate.High high;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Thumbnails() {
    }

    /**
     * 
     * @param _default
     * @param high
     * @param medium
     */
    public Thumbnails(com.wendyomollo.nipate.Default _default, com.wendyomollo.nipate.Medium medium, com.wendyomollo.nipate.High high) {
        super();
        this._default = _default;
        this.medium = medium;
        this.high = high;
    }

    public com.wendyomollo.nipate.Default getDefault() {
        return _default;
    }

    public void setDefault(com.wendyomollo.nipate.Default _default) {
        this._default = _default;
    }

    public com.wendyomollo.nipate.Medium getMedium() {
        return medium;
    }

    public void setMedium(com.wendyomollo.nipate.Medium medium) {
        this.medium = medium;
    }

    public com.wendyomollo.nipate.High getHigh() {
        return high;
    }

    public void setHigh(com.wendyomollo.nipate.High high) {
        this.high = high;
    }

}
