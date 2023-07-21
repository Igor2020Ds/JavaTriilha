package Aula22;


/* Eu, como administrador do sistema, gostaria de permitir que os 
 * própros usuários cadastrassem o nome de usuário (login) no sistema
 * para agilizar o processo de migração do sistema antigo para o novo.
 * 
 * O usuário não pode deixar o login vazio ou criar usuário com login "admin"
 * ou administradir.
 * Se o valor de entrada for válido, o sistema deverá exibir uma mensagem <NOME DO 
 * USUÁRIO> cadastrado com sucesso, senão o sistema deverá mostrar o erro
 * "Usuário inválido"
 */
import java.util.Scanner;
public class CadastroSistema {

    
    public static void main(String [] args){

        Scanner scanner= new Scanner(System.in);
        // sempre que iniciar inserção pelo import Scann montar esse comando
        
        String login;
        System.out.println("Informe o usuário");
        login= scanner.nextLine();

    if (login.isEmpty() || login.equalsIgnoreCase ("administrador") || login.equalsIgnoreCase("admin")){
     // ||  condicional ou
     // .isEmpty verifica se a entrada é vazia
     // .equals verifica se é igual ao outro ignorando se é CAPS ou não a != A
     // .equalsIgnoreCase verifica se um valor é igual ao outro e converte tudo para mesma estrutura
     // A== a ( se o usuário digitar Admin, será considerado admin)
     // .equalsIgnoreCase verifica e converte tudo para mínus
        System.out.println("Usuário inválido");

    }

    else {
        System.out.println("Usuário cadastrado com sucesso");
    }

       scanner.close();

       // fechamento do scann
    }
    
}
