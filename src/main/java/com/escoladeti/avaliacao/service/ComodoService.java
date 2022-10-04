package com.escoladeti.avaliacao.service;

import com.escoladeti.avaliacao.domain.Comodo;
import com.escoladeti.avaliacao.repository.ComodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComodoService {

    @Autowired
    private ComodoRepository comodoRepository;

    public List<Comodo> buscarTodosComodos() {
        return comodoRepository.findAll();
    }

    public Comodo cadastrar(Comodo comodo) {
        return comodoRepository.save(comodo);
    }
}
