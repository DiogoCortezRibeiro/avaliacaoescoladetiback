package com.escoladeti.avaliacao.controllers;

import com.escoladeti.avaliacao.domain.Comodo;
import com.escoladeti.avaliacao.domain.Imovel;
import com.escoladeti.avaliacao.service.ComodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comodo")
public class ComodoController {

    @Autowired
    private ComodoService comodoService;

    @GetMapping
    public List<Comodo> buscarTodos() {
        return comodoService.buscarTodosComodos();
    }

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody Comodo comodo) {
        Comodo comodoSalvo = comodoService.cadastrar(comodo);
        if(comodoSalvo != null) {
            return new ResponseEntity(comodoSalvo, HttpStatus.CREATED);
        }

        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PutMapping("/{id}")
    public ResponseEntity atualizar(@RequestBody Comodo comodo, @PathVariable("id") Long id) {
        if(comodoService.atualizar(comodo) != null) {
            return new ResponseEntity(comodo, HttpStatus.OK);
        }

        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") Long id) {
        comodoService.deletarPorId(id);
    }
}
