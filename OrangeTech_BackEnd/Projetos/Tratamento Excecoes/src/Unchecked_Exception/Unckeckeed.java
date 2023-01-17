package Unchecked_Exception;

import javax.swing.*;

public class Unckeckeed {
    public static void main(String[] args) {
        boolean continueLooping = true;
        do {

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try {
                int resultado = dividir(Integer.parseInt(a),Integer.parseInt(b));
                System.out.println("Resultado: "+resultado);
                continueLooping = false;
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Entrada Invalida, Digite um numero Int! ");
                e.printStackTrace();

            }catch (ArithmeticException e){
                JOptionPane.showMessageDialog(null,"Impossivel dividir por 0 !");
                e.printStackTrace();
            }
            finally {
                System.out.println("Chegou no Finally!");
            }

        }while (continueLooping);

        System.out.println("O codigo continua...");
    }

    private static int dividir(int a, int b) {return a/b;}

}
