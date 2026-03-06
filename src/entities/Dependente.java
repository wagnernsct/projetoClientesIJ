package entities;

import enums.Parentesco;

import java.time.LocalDate;

public class Dependente extends Pessoa{

    private LocalDate dataNascimento;
    private String parentesco;
    private Cliente cliente;
    private Parentesco parentes;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getParentesco() {
        return parentesco;
    }

    public Parentesco getParentes() {
        return parentes;
    }

    public void setParentes(Parentesco parentes) {
        this.parentes = parentes;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
