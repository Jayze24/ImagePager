package com.kkensu.www.library.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by JoHyunChol on 2016-10-15.
 */

public class ImageModel implements Serializable {
    String img_url;

    public String getImgUrl() {
        return img_url;
    }

    public void setImgUrl(String img_url) {
        this.img_url = img_url;
    }
}
