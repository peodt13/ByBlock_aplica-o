
package ByBlockClass;

import java.io.*; //Importa todas as bibliotecas do java.io
import java.util.ArrayList;

public class LeitorCSV_USER {

    public boolean abreCSV(String path, String login, String senha) {
        boolean z = false;
        //Recebe o diretório como parâmetro, ja com o arquivo
        File Arquivo = new File(path);
        ArrayList<String> dadosLeitura = new ArrayList<String>();
        //Cria um ArrayList para guardar as linhas do arquivo    
        FileReader leitor = null;

        String line = "";

        try {
            leitor = new FileReader(Arquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader saida = new BufferedReader(leitor);
        int i = 0;
        try {
            while ((line = saida.readLine()) != null) {

                dadosLeitura.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int linecount = 0;
        for (String value : dadosLeitura) {
            //Percorrer as linhas do Array
            String[] linevalue = value.split(",");
            for (int j = 0; j < linevalue.length; j++) {
                //Percorre o vetor de String
                //System.out.println(linevalue[j]);
                //Mostra os valores
            }

            if (linevalue[0].equals(login) && linevalue[1].equals(senha)) {
                z = true;
                break;
            } else {
                z = false;
            }
            //System.out.println(linevalue[0]); 
            //System.out.println(linevalue[1]); 
            //Mostra todos os logins e senhas
            linecount++;
        }
        return z;
    }

}