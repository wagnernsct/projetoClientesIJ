package repositories;

import entities.Cliente;

import java.io.PrintWriter;

public class ClienteRepository extends BaseRepository<Cliente> {

    @Override
    public void exportar(Cliente obj) {
        try{

            var pasta = criarPasta(); //criando a pasta na máquina local
            // criando o arquivo
            var printWriter = new PrintWriter(pasta + "\\cliente_" + obj.getId() + ".txt");

            // gravar os dados
            printWriter.write("\n" + obj.getId());
            printWriter.write("\n" + obj.getNome());
            printWriter.write("\n" + obj.getEmail());
            printWriter.write("\n" + obj.getTelefone());
            printWriter.write("\n" + obj.getDataCadastro());

            printWriter.close(); // fechar arquivo

            System.out.println("Dados do cliente salvos com sucesso!");

        }

        catch (Exception e){

            System.out.println("Falha ao salvar o cliente: " + e.getMessage());

        }

    }
}
