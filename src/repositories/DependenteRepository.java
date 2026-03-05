package repositories;

import entities.Dependente;

import java.io.PrintWriter;

public class DependenteRepository extends BaseRepository<Dependente>{

    @Override
    public void exportar(Dependente obj) {

        try{

        var pasta = criarPasta(); //criando a pasta na máquina local
        // criando o arquivo
        var printWriter = new PrintWriter(pasta + "\\dependente_" + obj.getId() + ".txt");

        // gravar os dados
        printWriter.write("\n" + obj.getId());
        printWriter.write("\n" + obj.getNome());
        printWriter.write("\n" + obj.getDataNascimento());
        printWriter.write("\n" + obj.getParentesco());
        printWriter.write("\nCLIENTE: ");
        printWriter.write("\n" + obj.getCliente().getNome());



        printWriter.close(); // fechar arquivo

        System.out.println("Dados dos dependentes salvos com sucesso!");

    }

        catch (Exception e){

        System.out.println("Falha ao salvar o dependente: " + e.getMessage());

    }

}




}
