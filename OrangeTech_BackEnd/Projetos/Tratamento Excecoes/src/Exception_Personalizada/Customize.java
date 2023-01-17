package Exception_Personalizada;

import javax.swing.*;
import java.io.*;

public class Customize {
    public static void main(String[] args) {
        String nomeArquivo = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        imprimirArquivoConsole(nomeArquivo);

        System.out.println("\nCom exception ou nao, o programa continua . . . ");
    }

    private static void imprimirArquivoConsole(String nomeArquivo) {
        try {
            BufferedReader br = lerArquivo(nomeArquivo);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }while (line != null);
            bw.flush();
            br.close();
        } catch (ImpossivelAbrirArquivoEX e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
        }catch (IOException ex){
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro nao esperado, por favor, fale com o suporte."+ex.getMessage());
            ex.printStackTrace();
        }
    }

    private static BufferedReader lerArquivo(String nomeArquivo) throws ImpossivelAbrirArquivoEX {
        File file = new File(nomeArquivo);
        try {
            return new BufferedReader(new FileReader(nomeArquivo));
        } catch (FileNotFoundException e) {
            throw new ImpossivelAbrirArquivoEX(file.getName(), file.getPath());
        }
    }
}

class ImpossivelAbrirArquivoEX extends Exception{
    private  String nomeArquivo;
    private  String diretorio;

    public ImpossivelAbrirArquivoEX( String nomeArquivo, String diretorio) {
        super("O Arquivo "+nomeArquivo+" nao foi encontrado no diretorio "+diretorio);
        this.nomeArquivo = nomeArquivo;
        this.diretorio = diretorio;
    }

//    @Override
//    public String toString() {
//        return "ImpossivelAbrirArquivoEX{" +
//                "nomeArquivo='" + nomeArquivo + '\'' +
//                ", diretorio='" + diretorio + '\'' +
//                '}';
//    }

//
//    @Override
//    public synchronized Throwable getCause() {
//        return super.getCause();
//    }
}