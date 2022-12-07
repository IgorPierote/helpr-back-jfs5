package org.soulcodeacademy.helpr.domain;


import javax.persistence.*;

@Entity
public class FuturoCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFuturoCliente;

    @Column(nullable = false)
    private String nomeCompleto;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String cpf;

    public FuturoCliente() {}

    public FuturoCliente(Integer idFuturoCliente, String nomeCompleto, String telefone, String email, String cpf) {
        this.idFuturoCliente = idFuturoCliente;
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
    }

    public Integer getIdFuturoCliente() {
        return idFuturoCliente;
    }

    public void setIdFuturoCliente(Integer idFuturoCliente) {
        this.idFuturoCliente = idFuturoCliente;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}


