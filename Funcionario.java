import java.util.Scanner;

public class Funcionario{
    String nome, cpf, genero, endereco, dt_Admissao, telefone;
    int  funcao;
    Funcionario(){
        Scanner teclado = new Scanner (System.in);
        Scanner teclado2 = new Scanner (System.in);

        System.out.println("\nDigite os dados do funcionário:");
        System.out.println("Nome:");
        nome = teclado2.nextLine();
        System.out.println("CPF:");
        cpf = teclado2.nextLine();
        System.out.println("Telefone:");
        telefone = teclado2.nextLine();
        System.out.println("Gênero:");
        genero = teclado2.nextLine();
        System.out.println("Função na empresa:");
        System.out.println("1-vendedor ou 2-outra função");
        funcao = teclado.nextInt();
        System.out.println("Endereço:");
        endereco = teclado2.nextLine();
        System.out.println("Data de admissão:");
        dt_Admissao = teclado2.nextLine();

    }
}