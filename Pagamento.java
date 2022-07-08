import java.util.Scanner;

public class Pagamento {
    double vendas, conta;
    int horaExtra;

    Pagamento(){
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o valor das vendas desse mês: ");
        vendas = teclado.nextDouble();
    }
    
    void salario(){
        Scanner teclado = new Scanner (System.in);
        if(funcao==1){
            if(vendas<=2000){
                System.out.println("Seu salário esse mês será de R$ 1.212");
            }
            if(vendas>2000 && vendas<=5000){
                conta = 1212+(vendas*(2/100));
                System.out.println("Seu salário esse mês será de R$ "+conta);
            }
            if(vendas>5000){
                conta = 1212+(vendas*(3/100));
                System.out.println("Seu salário esse mês será de R$ "+conta);
            }
        }
        if (funcao==2){
            System.out.println("Digite as horas extras trabalhadas esse mês: ");
            horaExtra = teclado.nextInt();
            conta = 1212+(50*horaExtra);
            System.out.println("Seu salário esse mês será de R$ "+conta);
        }else{
            System.out.println("Digite as horas extras trabalhadas esse mês: ");
            horaExtra = teclado.nextInt();
            conta = 1212+(50*horaExtra)+500;
            System.out.println("Seu salário esse mês será de R$ "+conta);
        }
    }
}