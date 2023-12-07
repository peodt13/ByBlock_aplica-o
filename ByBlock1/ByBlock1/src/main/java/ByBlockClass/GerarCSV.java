package ByBlockClass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerarCSV {

    public void escrita(ArrayList<String> dados, String pathDir, String nameFile) {
        FileWriter escritor = null;
        //referencia do diretório
        File diretorio = new File(pathDir);
        //verifica se diretório(pasta) existe
        if (!diretorio.exists()) {
            //cria diretório(pasta)
            diretorio.mkdir();
        }
        //referencia do caminho do arquivo completo
        File Arquivo = new File(diretorio, nameFile);

        //verificação se arquivo existe
        if (Arquivo.exists()) {
            try {
                //cria escrevendo na ultima linha - true(append)
                escritor = new FileWriter(Arquivo, true);
            } catch (IOException e) {
                e.printStackTrace(); //mostra o caminho que deu erro	
            }
        } else {
            try {
//caso não exista, escreve na primeira linha, por isso sem o parametro append
                escritor = new FileWriter(Arquivo);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*Buffer - memória temporária de escrita para garantir que não vai perder a informação - salva tudo (em lote)*/
        BufferedWriter saida = new BufferedWriter(escritor);
        try {
            //para varrer todo o ArrayList
            for (int i = 0; i < dados.size(); i++) {
                //escreve dado 
                saida.write(dados.get(i));
                //pula linha		   
                saida.write(System.getProperty("line.separator"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Fecha o buffer e salva o arquivo;
        try {
            //descarrega tudo que juntou no buffer e joga no arquivos criado
            saida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<String> leitura(String path) {
//recebe o diretório como parâmetro, já com o arquivo
        ArrayList<String> dadosLeitura = new ArrayList<String>();
//cria array list para guardar todas as linhas
        File Arquivo = new File(path);
//objeto para localização do arquivo
        FileReader leitor = null;
        try {
            leitor = new FileReader(Arquivo);
//FlieReader tem que apontar para o caminho do arquivo, no caso, o file
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader saida = new BufferedReader(leitor);
        try {
            while (saida.ready()) { //enquanto tiver valor (not EOF)
                dadosLeitura.add(saida.readLine());
            }
            JOptionPane.showMessageDialog(null, dadosLeitura);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Fecha o buffer e salva o arquivo;
        try {
            saida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dadosLeitura;
    }

    public void remove(String pathDir, String nameFile, String DataRemove) {
        int control = 0;
        ArrayList<String> lista = new ArrayList<String>();
        lista = new GerarCSV().leitura(pathDir + nameFile);
//usa o próprio método leitura que retorna a arraylist
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(DataRemove)) {/*como a lista é um ArrayLlist, já 							tem o get como método verifica se a informação 								get é igual ao dado a ser removido	*/
                lista.remove(i);//remove a linha da Array
                control = 1;//flag
            }
        }
        if (control == 0) {
            System.out.println("dado não encontrado");
        }
        //deleta arquivo
        File file = new File(pathDir, nameFile);
        file.delete();
//esceve novo
        new GerarCSV().escrita(lista, pathDir, nameFile);
//escrita é o método de escrita (tem o buffer nele)		
    }

    public void deletaArquivo(String path) {
        File Arquivo = new File(path);
        Arquivo.delete();
    }

}
