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

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @ManyToOne(optional=false)
    @JoinColumn(name = "id", insertable=false, updatable=false)
    public Imovel imovel;
}
