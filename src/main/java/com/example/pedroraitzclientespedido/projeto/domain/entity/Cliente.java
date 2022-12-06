package com.example.pedroraitzclientespedido.projeto.domain.entity;


import jakarta.persistence.*;

@Entity
@Table( name = "cliente" )
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "primeiro_nome", length = 100)
    private String primeiroNome;

    @Column(name = "ultimo_nome", length = 100)
    private String ultimoNome;

    @Column(name = "cpf", length = 11)
    private String cpf;


    public Cliente() {
    }


    public Cliente(Integer id, String primeiroNome, String ultimoNome) {
        this.id = id;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getCpf() {
        return cpf;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", primeiro_nome='" + primeiroNome + '\'' +
                ", ultimo_nome='" + ultimoNome + '\'' +
                '}';
    }

}
