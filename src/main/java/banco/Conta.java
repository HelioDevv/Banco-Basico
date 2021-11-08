package banco;
public class Conta {
    double salario;
    int numero;
    Cliente titular = new Cliente();
    double saldo;
    
//-------------------------------------------------    
    
    void pegar(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this .saldo = novoSaldo;
    }
    
    void deposito (double quantidade){
        this.saldo += quantidade;
    }
    
    boolean saca(double valor){
        if(this.saldo < valor){
            return false;
        }else{
            this.saldo = this.saldo - valor;
                return true;
        }
    }
    
    void transfere(Conta destino, double valor){
        this.saldo = this.saldo - valor;
            destino.saldo = destino.saldo + valor;
        
    }
    
    boolean transf(Conta destino, double valor){
        boolean retirou = this.saca(valor);
            if(retirou == false){
                return false;
            }else{
                destino.deposito(valor);
                    return true;
            }
            
    }
    
    void status(){
        System.out.println("###");
        System.out.println("");
        System.out.println("Titular da conta: " + this.titular.nome +" "+ this.titular.sobrenome + ";");
        System.out.println("");
        System.out.println("CPF do Titular: " + this.titular.cpf + ";");
        System.out.println("");
        System.out.println("Saldo : " + this.saldo + "R$;");
        
        
        
    }
    
    

}
