package com.myboringtown.chicagocomedy;

/**
 * Created by sdalton on 10/6/2017.
 */

public class Event {

    private int id;
    private int mve_id;
    private String name;
    private String description;
            //"showsjson":"[]",
            //"categoriesjson":"[{\"category_id\": 1, \"subcategory_id\": 44, \"subcategory_name\": \"Open-Mic Comedy\"}]",
            //"participantsjson":"[{\"name\": \"Brandon Kieffer\", \"start\": \"\", \"page_id\": 17, \"imageurl\": \"https:\/\/myboringtowndata.s3.amazonaws.com\/page\/17\/main\/1505148636466.jpg\"}, {\"name\": \"Noshod Barrow\", \"start\": \"\", \"imageurl\": \"\"}]",
    private int venue_id;
    private String venue_name;
    private String venue_imageurl;
    private String street_address;
    private String lat;
    private String lng;
    private String local_tz;
    private int price;
    private int pricemin;
    private int pricemax;
    private String pricedescription;
    private String pricelink;
    private int ages;
    private String UTC_start;
    private String UTC_end;
    private String local_start;
    private String local_end;
    private String private_info;
    private String imageurl;
    private String backgroundurl;
    private int order;
    private int is_public;
    private int confirmed;
    private String created_at;
    private String updated_at;
    private int created_by;
    private int updated_by;
    private String distance;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
