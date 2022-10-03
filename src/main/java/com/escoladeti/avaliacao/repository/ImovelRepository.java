package com.escoladeti.avaliacao.repository;

import com.escoladeti.avaliacao.domain.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {
}
