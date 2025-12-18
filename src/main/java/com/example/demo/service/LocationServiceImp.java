package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LocationEntity;
import com.example.demo.repository.LocationRepository;
@Service
public class LocationServiceImp implements LocationService {
    @Autowired
    LocationRepository Locationrepo;
    @Override
    public LocationEntity createlocation(LocationEntity le)
    {
        return Locationrepo.save(le);
    }
    public List<LocationEntity>getalllocation()
    {
        return Locationrepo.findAll();
    }  
}
