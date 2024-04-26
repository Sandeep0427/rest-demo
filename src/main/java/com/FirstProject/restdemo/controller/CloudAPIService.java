package com.FirstProject.restdemo.controller;

import com.FirstProject.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {

    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        //this will retrun what ever we type in the real in create api
        return cloudVendor;
//        We coomented this because now we are creating the create api which will give us the details
//        what ever we typed in real timereturn new CloudVendor("c1", "Vendor 1",
//                "address 1", "XXX-XXX-XXXX");

    }
    @PostMapping

    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor created successfully";
    }
    @PutMapping

    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor updated successfully";
    }
    @DeleteMapping("{vendorId}")

    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor = null;
        return "Cloud venndor deleted successfully";
    }


}
