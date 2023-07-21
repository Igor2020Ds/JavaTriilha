package Aula18;

import java.util.Scanner;

import javax.swing.InputMap;
import javax.xml.namespace.QName;

/*  Eu como usuário gostaria de ter o nome e a idade de
participantes de um torneio de natação e que o sistema imprimisse 
da seguinte forma:

Menor que 10 anos: <Nome> participará da categoria Infantil
Entre 11 e 15 anos: <Nome> participará da categoria Juvenil
Entre 16  e 19 anos: <Nome> participará da categoria Pré- adulto
Acima de 20 anos <Nome> participará da categoria Adulto
Para que eu possa rapidamente classificar todos os participantes

*/
public class TorneioDeNatacao {

    public static void main(String [] args){
        String classificacao;

Scanner dadoInseridos= new Scanner(System.in);
    
        System.out.println("Iforme o nome");
        String nome= dadoInseridos.nextLine();
       
       System.out.println("Informe a idade");
       int idade= dadoInseridos.nextInt();
       dadoInseridos.nextLine();
            
        if(idade <=10){
        classificacao = ("Infatil");
        }

        else if(idade >= 11 && idade <=15){
        classificacao = ("Juvenil");  
        }

        else if(idade >=16 && idade <=19){
            classificacao = ("Pré-adulto");
        }

        else{
            classificacao=("Adulto");
        }
        dadoInseridos.close();

        System.out.println(nome+" está classificado como : "+classificacao);
    }
    
}
