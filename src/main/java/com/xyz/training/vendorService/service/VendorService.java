package com.xyz.training.vendorService.service;

import com.xyz.training.vendorService.model.Vendor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface VendorService {

    List<Vendor> getVendors();

    void createVendor(Vendor vendor);
}
