package com.escoladeti.avaliacao.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "imovel")
public class Imovel {

    @Id
    @GeneratedValue(generator = "imovel_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name="imovel_seq",sequenceName="imovel_id_seq", allocationSize=1)
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "datacompra")
    private LocalDate datacompra;

    @Column(name = "endereco")
    private String endereco;

    @OneToMany
    private List<Comodo> comodos;

    public LocalDate getDatacompra() {
        return datacompra;
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void addComodo(Comodo comodo) {
        this.comodos.add(comodo);
    }

    public void removeComodo(Comodo comodo) {
        this.comodos.remove(comodo);
    }
}
