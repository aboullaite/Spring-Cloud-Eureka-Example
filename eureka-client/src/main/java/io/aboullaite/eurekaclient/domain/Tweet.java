package io.aboullaite.eurekaclient.domain;

public class Tweet {
    String text;
    String username;
    String fullname;
    String image;
    int favoriteCount;
    int retweetteCount;

    public Tweet(String text, String fullname, String username, String image, int favoriteCount, int retweetteCount) {
        this.text = text;
        this.fullname = fullname;
        this.username = username;
        this.image = image;
        this.favoriteCount = favoriteCount;
        this.retweetteCount = retweetteCount;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(int favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public int getRetweetteCount() {
        return retweetteCount;
    }

    public void setRetweetteCount(int retweetteCount) {
        this.retweetteCount = retweetteCount;
    }
}
