package com.luxoft.mx.tool.ui.data.service;

import com.luxoft.mx.tool.ui.data.entity.SampleAddress;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleAddressRepository extends JpaRepository<SampleAddress, Integer> {

}