package com.xyz.training.vendorService.service;


import com.xyz.training.vendorService.model.Vendor;
import com.xyz.training.vendorService.repository.VendorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VendorServiceImpl implements VendorService {


    private final VendorRepository vendorRepository;

    @Override
    @Cacheable(value="vendors")
    public List<Vendor> getVendors() {
        return vendorRepository.findAll();
    }

    @Override
    public void createVendor(Vendor vendor) {
        vendorRepository.save(vendor);
    }

}
