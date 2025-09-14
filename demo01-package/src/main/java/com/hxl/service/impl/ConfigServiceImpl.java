package com.hxl.service.impl;

import com.hxl.mapper.ConfigMapper;
import com.hxl.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigServiceImpl implements ConfigService {

    @Autowired
    private ConfigMapper configMapper;

    @Override
    public String get() {
        return configMapper.get()
                .orElseGet(() -> "默认");
    }
}
