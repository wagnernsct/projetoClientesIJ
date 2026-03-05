package main;

import controllers.ClientesController;
import repositories.ClienteRepository;

public class Main {

    // Método para executar o projeto
    public static void main(String[] args) {

        // Criando um objeto da classe de controle
        var clienteController = new ClientesController();

        // Executar o cadastro do cliente
        clienteController.cadastrarCliente();


    }

}
