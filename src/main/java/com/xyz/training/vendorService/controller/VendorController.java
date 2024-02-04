package com.xyz.training.vendorService.controller;

import com.xyz.training.vendorService.model.Vendor;
import com.xyz.training.vendorService.service.VendorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vendorservice")
@RequiredArgsConstructor
@Slf4j
@RefreshScope
public class VendorController {

    @Value("${vendor.config.name}")
    private String name;

    @Value("$vendor.type}")
    private String vendorType;


    private final VendorService vendorService;

    @GetMapping
    public List<Vendor>  getVendorList() {
       log.info("Vendor name {}", name);
        return vendorService.getVendors();
    }

    @GetMapping(value="/list")
    public List<Vendor>  getVendorById() {
        return vendorService.getVendors();
    }

    @PostMapping
    public ResponseEntity<String> createVendor(@RequestBody Vendor vendor) {
        vendorService.createVendor(vendor);
        return ResponseEntity.ok("Vendor created");
    }

    //PutMapping

    //patch mapping

    //delete mapping

}
