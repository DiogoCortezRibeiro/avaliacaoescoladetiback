package com.escoladeti.avaliacao.service;

import com.escoladeti.avaliacao.repository.ComodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComodoService {

    @Autowired
    private ComodoRepository comodoRepository;
}
