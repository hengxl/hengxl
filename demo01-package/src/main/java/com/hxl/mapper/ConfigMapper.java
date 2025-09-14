package com.hxl.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface ConfigMapper {

    Optional<String> get();
}
