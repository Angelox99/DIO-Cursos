package Relacoes.Up_DownCast;

public class Aplicacao {
    public static void main(String[] args) {
        //Objeto
        Funcionario funcionario = new Funcionario();

        //UpCast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //DownCast
//      Tipos de erro:
//      Gerente gerente_ = new Funcionario();
//      Vendedor vendedor_ = (Vendedor) new Funcionario();


    }
}
