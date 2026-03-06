package services;

import entities.Dependente;
import enums.Parentesco;

public class ClienteService {

    // Método para fazer a captura e cadastro do Cliente informado pelo usuário



    public void cadastrarDependente(){
        var dependente = new Dependente();


        try{

            if (dependente.getParentesco() == "Filho"){
                System.out.println("é isso!");
            }

            else
                System.out.println("Parentesco informado não é 'Filho'");


        }

        catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    public void cadastrarCliente(){
        var dependente = new Dependente();


        if (dependente.getParentesco() == Parentesco){
            System.out.println("Parentesco é mãe");

        }

    }

}
