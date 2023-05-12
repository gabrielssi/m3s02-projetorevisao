package br.com.canasvieiras.m3s02projetorevisao.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@Data
@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date criacao = new Date();

    @Column(nullable = false)
    private Date atualizacao = new Date();

    @Column(nullable = false)
    private BigInteger cliente_id;

    @Column(length = 30 ,nullable = false)
    private String tipo;

    @Column(length = 10 ,nullable = false)
    private String cep;

    @Column(length = 255 ,nullable = false)
    private String logradouro;

    @Column(length = 100 ,nullable = false)
    private String bairro;

    private String complemento;

    @Column(length = 6,nullable = false)
    private String numero;

    @Column(length = 50,nullable = false)
    private String cidade;

    @Column(length = 2,nullable = false)
    private String uf;

}
