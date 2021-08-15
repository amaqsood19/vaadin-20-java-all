package com.luxoft.mx.tool.ui.data.service;

import com.luxoft.mx.tool.ui.data.entity.SampleAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vaadin.artur.helpers.CrudService;

@Service
public class SampleAddressService extends CrudService<SampleAddress, Integer> {

    private SampleAddressRepository repository;

    public SampleAddressService(@Autowired SampleAddressRepository repository) {
        this.repository = repository;
    }

    @Override
    protected SampleAddressRepository getRepository() {
        return repository;
    }

}
