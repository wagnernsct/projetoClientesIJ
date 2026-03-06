package services;

import entities.Dependente;
import enums.Parentesco;

public class ClienteService {

    // Método para fazer a captura e cadastro do Cliente informado pelo usuário

    public void cadastrarCliente(){
        var dependente = new Dependente();
        var parent = Parentesco.findByDescricao(dependente.getParentesco());
        parent.getDependentes();


        if (Parentesco.isNotUnknow(parent)){
            System.out.println("Parentesco é correto: " + dependente.getParentesco() );

        }

    }
}
