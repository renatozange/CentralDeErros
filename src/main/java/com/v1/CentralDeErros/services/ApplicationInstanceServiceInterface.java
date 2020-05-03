package com.v1.CentralDeErros.services;

import com.v1.CentralDeErros.models.ApplicationInstance;
import com.v1.CentralDeErros.models.DTOs.ApplicationInstanceDTO;

import java.util.List;

public interface ApplicationInstanceServiceInterface {

    public void addNew(ApplicationInstanceDTO applicationInstanceDTO);

    public List<ApplicationInstance> findAll(Integer size);
}