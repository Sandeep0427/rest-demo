package com.FirstProject.restdemo.model;

public class CloudVendor {
    private String venodrId;
    private String venodrName;
    private String venodrAddress;
    private String venodrPhoneNumber;

    public CloudVendor(){

    }

    public CloudVendor(String venodrId, String venodrName, String venodrAddress, String venodrPhoneNumber){
        this.venodrId = venodrId;
        this.venodrName = venodrName;
        this.venodrAddress = venodrAddress;
        this.venodrPhoneNumber = venodrPhoneNumber;
    }

    public String getVenodrId(){
        return venodrId;
    }

    public void setVenodrId(){
        this.venodrId = venodrId;
    }

    public String getVenodrName(){
        return venodrName;
    }
    public void setVenodrName(){
        this.venodrName = venodrName;
    }

    public String getVenodrAddress(){
        return venodrAddress;
    }

    public void setVenodrAddress(){
        this.venodrAddress = venodrAddress;
    }

    public String getVenodrPhoneNumber(){
        return venodrPhoneNumber;
    }

    public void setVenodrPhoneNumber(){
        this.venodrPhoneNumber = venodrPhoneNumber;
    }
}

