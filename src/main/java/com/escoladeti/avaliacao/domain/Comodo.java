package com.escoladeti.avaliacao.domain;

import javax.persistence.*;

@Entity
@Table(name = "comodo")
public class Comodo {

    @Id
    @GeneratedValue(generator = "comodo_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="comodo_seq",sequenceName="comodo_id_seq", allocationSize=1)
    private Long id;

    private String nome;

    private Long imovel_id;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Long getImovel_id() {
        return imovel_id;
    }
}
