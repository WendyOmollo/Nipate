package com.wendyomollo.nipate;

public class Artist {
    private String user_id;
    private String artist_name;
    private String artist_email;
    private String artist_password;

    public Artist(String user_id, String artist_name, String artist_email, String artist_password) {
        this.user_id = user_id;
        this.artist_name = artist_name;
        this.artist_email = artist_email;
        this.artist_password = artist_password;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getArtist_email() {
        return artist_email;
    }

    public void setArtist_email(String artist_email) {
        this.artist_email = artist_email;
    }

    public String getArtist_password() {
        return artist_password;
    }

    public void setArtist_password(String artist_password) {
        this.artist_password = artist_password;
    }
}
