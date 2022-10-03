package com.escoladeti.avaliacao.service;

import com.escoladeti.avaliacao.domain.Imovel;
import com.escoladeti.avaliacao.repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImovelService {

    @Autowired
    private ImovelRepository imovelRepository;

    public List<Imovel> buscarTodosImovel() {
        return imovelRepository.findAll();
    }

    public Imovel cadastrar(Imovel imovel) {
        return imovelRepository.save(imovel);
    }

    public Imovel atualizar(Imovel imovel) {
        return imovelRepository.save(imovel);
    }

    public void deletarPorId(Long id) {
        imovelRepository.deleteById(id);
    }
}
