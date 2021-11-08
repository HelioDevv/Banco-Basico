package banco;
public class Banco {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        
        c1.titular.nome = "Victor";
        c1.titular.sobrenome = "Marinho";
        c1.titular.cpf = "999.999.888-50";
        c1.saldo = 500;   
        c1.deposito(300);
        c1.saca(100);
        c1.status();
        
        Conta c2 = new Conta();
        
        c2.titular.nome = "Gabriela";
        c2.titular.sobrenome = "Louvina";
        c2.titular.cpf = "222.333.444-90";
        c2.saldo = 1200;
        c2.saca(200);
        c2.transfere(c1, 500);
        c2.status();
    }
}
