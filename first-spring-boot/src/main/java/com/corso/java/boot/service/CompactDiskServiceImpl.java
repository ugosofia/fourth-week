package com.corso.java.boot.service;

import com.corso.java.boot.domain.CompactDisk;
import com.corso.java.boot.repository.CompactDiskRepository;
import com.corso.java.boot.service.api.CompactDiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompactDiskServiceImpl implements CompactDiskService {

    @Autowired
    CompactDiskRepository compactDiskRepository;

    @Override
    public List<CompactDisk> findAll() {
        return compactDiskRepository.findAll();
    }

    public CompactDisk create(CompactDisk compactdisk) {
        return compactDiskRepository.save(compactdisk);
    }

  /**  @Override
    public CompactDisk findById(CompactDisk compactDisk, String id) {
        List<CompactDisk> compactDisk1 = compactDiskRepository.findById(id);
        return compactDisk1;
    }*/


}
