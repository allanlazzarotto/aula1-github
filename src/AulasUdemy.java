import java.util.Locale;
import java.util.Scanner;

public class AulasUdemy {
public static void main(String[] args) {
Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);



System.out.println("Bem vindo. Vamos criar uma conta."); 
System.out.println("Digite um número para o codigo da conta e pressione enter.");
System.out.println("Em seguida, digite seu nome completo:");
int cont= sc.nextInt();
String nom= sc.next();
double val=0;
char o;

do{
System.out.println("Deseja fazer um deposito ao se cadastrar? s/n");
o =sc.next().charAt(0);
} while(o!='s'&& o!='n');

switch(o){
case 's':
    System.out.println("OK.Digite o valor do deposito:");
    val= sc.nextDouble();
    break;
case 'n':
     break;
}     


ContaBancaria conta= new ContaBancaria(cont,nom,val);
System.out.println("Conta criada com sucesso");
System.out.println(conta.toString());
System.out.println("");


int p;
do{
    System.out.println("Deseja fazer uma operação?");
System.out.println("1.Saque;");
System.out.println("2.Deposito;");
System.out.println("3.Saldo;");
System.out.println("0.Sair;");
System.out.println("");
p= sc.nextInt();
switch(p){
    case 1:
        System.out.println("Digite o valor que deseja sacar:");
        conta.saque(sc.nextDouble());
        System.out.println("Saque efetuado com sucesso. Valor taxa do saque: R$5,00.");
        System.out.println("");
        break;
    case 2:   
        System.out.println("Digite o valor que deseja depositar:");
        conta.deposito(sc.nextDouble());
        System.out.println("Deposito efetuado com sucesso.");
        System.out.println("");
        break;
    case 3: 
        System.out.println("");
        System.out.println("Seu saldo é: "+conta.getSaldo());
         System.out.println("");
        break;
        
    case 0: 
         System.out.println("");
         System.out.println("Saindo do sistema.");
         System.out.println("");
        break;
        
    default:
        System.out.println("Opção inválida.");
        System.out.println("");
        break;    
}
}while(p!=0);




 sc.close();       
}
}   