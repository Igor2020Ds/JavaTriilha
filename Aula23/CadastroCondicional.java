package Aula23;

/*Como secretário de alistamento militar, eu gostaria qie meu sistema
 * aceitasseps seguintes parâmetros para que eu possa agilizar o processo 
 * de cadastramento:
 * 
 * Sexo, sendo válido apenas M ou F e idade;
 * Se o sexo for Masculino e a idade for maior ou igual a 18, o sistema
 * deve imprimir, alistamento obrigatório;
 * Se o sexo for masculino e a idade for menor que 18 o sistema deve imprimir
 * alistamento não permitido
 * Se o sexo for feminino e a idade for maior ou igual a 18, o sistema deve perguntar se
 * a pessoa deseja se alistar - caso sim, imprimir insira seu nome e seu sexo e depois traga 
 * "Alistado com sucesso"~
 * Se o sexo for Feminino e a idade for menor que 18, o sistem adeve imprimir: Alistamento ão permitido; 
 */


 import java.util.Scanner;
public class CadastroCondicional{

    public static void main( String [] args){

        

        Scanner cadastroAlistamento= new Scanner (System.in);

        String sexo;
        System.out.println("Informe seu sexo M ou F");
        sexo = cadastroAlistamento.nextLine();

        int idade;
        System.out.println("Informe sua idade em números");
        idade= cadastroAlistamento.nextInt();

        if( sexo== "M" || sexo=="F" ){
           
            if(sexo== "M"){
                if (idade>= 18){
                    System.out.println("Cadastro realizado");
               
                    }
                     else{
                    System.out.println("Cadastro não realizado");
                }
            else if(sexo=="F"){
                
            }
            }
            
        }




        



    }
}
