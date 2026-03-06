package entities;

import enums.Parentesco;

import java.time.LocalDateTime;
import java.util.List;

public class Cliente extends Pessoa {

    private Parentesco parentes;
    private String cpf;
    private String email;
    private String telefone;
    private LocalDateTime dataCadastro;
    private List<Dependente> dependentes;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public Parentesco getParentes() {
        return parentes;
    }

    public void setParentes(Parentesco parentes) {
        this.parentes = parentes;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }
}
