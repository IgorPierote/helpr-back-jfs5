package org.soulcodeacademy.helpr.domain.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class FuturoCandidatoDTO {
    @NotBlank(message = "Campo Nome Completo é obrigatório.")
    private String nomeCompleto;

    @NotNull(message = "Favor digitar um e-mail válido.")
    private String email;

    @NotNull(message = "Campo Descrição das Habilidades é obrigatório.")
    private String descHabilidades;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescHabilidades() {
        return descHabilidades;
    }

    public void setDescHabilidades(String descHabilidades) {
        this.descHabilidades = descHabilidades;
    }
}
