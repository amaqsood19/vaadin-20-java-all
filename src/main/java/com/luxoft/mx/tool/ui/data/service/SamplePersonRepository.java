package com.luxoft.mx.tool.ui.data.service;

import com.luxoft.mx.tool.ui.data.entity.SamplePerson;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, Integer> {

}