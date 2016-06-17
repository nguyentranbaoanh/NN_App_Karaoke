package com.nn.nn_app_karaoke.model;

/**
 * Created by NguyenNhan on 06/18/2016.
 */
public class BaiHat {
    private String tenBH;
    private String maBH;
    private String tenCaSi;
    private boolean like;

    public BaiHat() {
    }

    public BaiHat(String tenBH, String maBH, String tenCaSi, boolean like) {
        this.tenBH = tenBH;
        this.maBH = maBH;
        this.tenCaSi = tenCaSi;
        this.like = like;
    }

    public String getTenBH() {
        return tenBH;
    }

    public void setTenBH(String tenBH) {
        this.tenBH = tenBH;
    }

    public String getMaBH() {
        return maBH;
    }

    public void setMaBH(String maBH) {
        this.maBH = maBH;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }
}
