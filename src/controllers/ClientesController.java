package controllers;

import entities.Cliente;
import entities.Dependente;
import enums.Parentesco;
import repositories.ClienteRepository;
import repositories.DependenteRepository;
import services.ClienteService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class ClientesController {

    //Atributos
    private final ClienteRepository clienteRepository = new ClienteRepository();
    private final DependenteRepository dependenteRepository = new DependenteRepository();



    public void cadastrarCliente() {
        try {
            var clienteService = new ClienteService();
            var cliente = new Cliente(); //objeto (instância)


            cliente.setId(UUID.randomUUID()); //Id aleatório
            cliente.setNome("Wagner Mesquita");
            cliente.setEmail("wagnernsct@gmail.com");
            cliente.setTelefone("(21)4002-8922");
            cliente.setDataCadastro(LocalDateTime.now());

            // Chamando função para conferência dos dados inseridos
            clienteService.cadastrarCliente();


            clienteRepository.exportar(cliente); //salvando no arquivo

            for(var i = 1; i <= 3; i++) {

                var dependente = new Dependente();


                dependente.setId(UUID.randomUUID());
                dependente.setNome("Dependente " + i);
                dependente.setParentesco("Filho ");
                dependente.setDataNascimento(LocalDate.now());
                dependente.setCliente(cliente); //associando ao cliente

                // Chamando função para conferência dos dados inseridos
                clienteService.cadastrarDependente();




                dependenteRepository.exportar(dependente); //salvando no arquivc
            }
        }
        catch(Exception e) {
            System.out.println("\nErro: " + e.getMessage());
        }
    }
}
