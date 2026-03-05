package repositories;

import java.io.File;

public abstract class BaseRepository<T> {

    /*
     * Método concreto - Criar a pasta onde os arquivos serão gravados
     * */

    protected String criarPasta() {

        // Endereço da pasta:
        var pasta = "c:\\aula_java";

        // Biblioteca para criação de pastas ou arquivos
        var file = new File(pasta);

        // Verificar se a pasta não existe
        if (!file.exists()) {

            file.mkdir(); // criar a pasta
            System.out.println("Pasta criada com sucesso!");

        } else {
            System.out.println("Pasta já existente!");
        }

        return pasta;

    }


    /*
     * Método abstrato - É um método que não possui corpo
     * apenas assinatura e quem herdar esta classe abstrata
     * deverá implemntar esse método
     *
     * */
    public abstract void exportar(T obj);
}
