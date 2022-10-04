package com.escoladeti.avaliacao.controllers;

import com.escoladeti.avaliacao.domain.Imovel;
import com.escoladeti.avaliacao.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imovel")
public class ImovelController {

    @Autowired
    private ImovelService imovelService;

    @GetMapping
    public List<Imovel> buscarTodos() {
        return imovelService.buscarTodosImovel();
    }

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody Imovel imovel) {
        Imovel imovelSalvo = imovelService.cadastrar(imovel);
        if(imovelSalvo != null) {
            return new ResponseEntity(imovelSalvo, HttpStatus.CREATED);
        }

        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping("/{id}")
    public ResponseEntity atualizar(@RequestBody Imovel imovel, @PathVariable("id") Long id) {
        if(imovelService.atualizar(imovel) != null) {
            return new ResponseEntity(imovel, HttpStatus.OK);
        }

        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Long id) {
        imovelService.deletarPorId(id);
    }
}
