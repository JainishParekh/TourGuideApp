package com.example.tourguideapp;

public class List {
    private String name , address;
    private int imgId = -1;

    public List(String name ,  String address , int imgId){
        this.name = name;
        this.address = address;
        this.imgId = imgId;
    }

    /**
     * Getter for name of item
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for address of place
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Getter for image id of the resources
     * @return imgId
     */
    public int getImgId() {
        return imgId;
    }

    /**
     * Checks if there is an image or not
     * @return true/false
     */
    public boolean hasImage(){
        return imgId != -1;
    }

}
