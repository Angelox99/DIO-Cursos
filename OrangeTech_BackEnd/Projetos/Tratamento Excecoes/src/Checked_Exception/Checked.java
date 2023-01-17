package Checked_Exception;

import javax.swing.*;
import java.io.*;

public class Checked {
    public static void main(String[] args) {
        String nomeArquivo = "Anotacao.txt";

        try {
            imprimirArquivoConsole(nomeArquivo);
        }catch (FileNotFoundException e){//Aviso de erro especifico de arquivo nao encontrado por nome
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                                        "Revise o nome do arquivo = "+e.getCause());

        }catch (IOException e) {//Aviso de erro geral, para o dev depurar melhor
            JOptionPane.showMessageDialog(null,
                                        "Erro inesperado! "+e.getCause());

        }finally {//opcional
            System.out.println("Chegou no Finally");
        }

        System.out.println("Apesar da exception ou nao, o programa continua. . .");
    }

    private static void imprimirArquivoConsole(String nomeArquivo) throws IOException {
        File file = new File(nomeArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while (line != null);
        bw.flush();
        br.close();
    }
}
