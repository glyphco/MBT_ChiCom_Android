package com.myboringtown.chicagocomedy;


import android.net.ParseException;
import android.text.TextUtils;
import android.text.format.DateFormat;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by janisharali on 24/08/16.
 */
public class InfiniteFeedInfo {


    //"id":178,"mve_id":null,"name":"The Riff Open Mic","description":null,
    // "showsjson":"[]",
    // "categoriesjson":"[]",
    // "participantsjson":"[]",
    // "venue_id":78,
    // "venue_name":"Diversey River Bowl",
    // "venue_imageurl":"https:\/\/myboringtowndata.s3.amazonaws.com\/venue\/78\/main\/1506969600209.jpg",
    // "street_address":"2211 W Diversey Pkwy","city":"Chicago","state":"IL","postalcode":"60647",
    // "lat":"41.93163490",
    // "lng":"-87.68343600",
    // "local_tz":"CST6CDT",
    // "price":0,
    // "pricemin":null,
    // "pricemax":null,
    // "pricedescription":null,
    // "pricelink":null,
    // "ages":0,
    // "UTC_start":"2017-10-10 00:00:00",
    // "UTC_end":null,
    // "local_start":"2017-10-09 19:00:00",
    // "local_end":null,
    // "private_info":null,
    // "imageurl":null,
    // "backgroundurl":null,
    // "order":0,
    // "public":1,
    // "confirmed":1,
    // "created_at":"2017-10-09 22:49:03",
    // "updated_at":"2017-10-09 22:49:03",
    // "created_by":2,
    // "updated_by":2,
    // "distance":16728.148375145676},

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("venue_name")
    @Expose
    private String venue_name;

    @SerializedName("imageurl")
    @Expose
    private String imageurl;

    @SerializedName("imageSm")
    @Expose
    private String imageSm;

    @SerializedName("imageIcon")
    @Expose
    private String imageIcon;

    @SerializedName("localstarttime")
    @Expose
    private String localstarttime;

    @SerializedName("localstartdate")
    @Expose
    private String localstartdate;

    public String getId() {return id;}

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getVenueName() {return venue_name;}

    public void setVenueName(String venue_name) {
        this.venue_name = venue_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageurl;
    }

    public void setImageUrl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getImageSm() {
        return imageSm;
    }

    public void setImageSm(String imageSm) {
        this.imageSm = imageSm;
    }

    public String getLocalStartTime() {
        return localstarttime;
    }

    public void setLocalStartTime(String localstarttime) {
       this.localstarttime = localstarttime;
    }

    public String getLocalStartDate() {
        return localstartdate;
    }

    public void setLocalStartDate(String localstartdate) {
        this.localstartdate = localstartdate;
    }

    //    @SerializedName("title")
//    @Expose
//    private String title;
//
//    @SerializedName("image_url")
//    @Expose
//    private String imageUrl;
//
//    @SerializedName("caption")
//    @Expose
//    private String caption;
//
//    @SerializedName("time")
//    @Expose
//    private String time;

//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getImageUrl() {
//        return imageUrl;
//    }
//
//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }
//
//    public String getCaption() {
//        return caption;
//    }
//
//    public void setCaption(String caption) {
//        this.caption = caption;
//    }
//
//    public String getTime() {
//        return time;
//    }
//
//    public void setTime(String time) {
//        this.time = time;
//    }
}
