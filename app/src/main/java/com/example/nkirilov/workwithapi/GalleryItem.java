package com.example.nkirilov.workwithapi;

/**
 * Created by n.kirilov on 18.05.2016.
 */
public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUrl;


    public String getmCaption() {
        return mCaption;
    }

    public void setmCaption(String mCaption) {
        this.mCaption = mCaption;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmUrl() {
        return mUrl;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    @Override
    public String toString() {
        return "GalleryItem{" +
                "mCaption='" + mCaption + '\'' +
                '}';
    }
}
