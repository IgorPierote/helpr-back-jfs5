package org.soulcodeacademy.helpr.domain.dto;

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class FuturoClienteDTO {
    @NotNull
    @Size(max = 120, message = "Campo nome obrigatório.")
    private String nome;

    @NotBlank(message = "Digite um telefone válido")
    private String telefone;

    @Email
    @NotBlank(message = "Digite um e-mail válido.")
    private String email;

    @CPF
    @NotBlank(message = "Digite um cpf válido.")
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
