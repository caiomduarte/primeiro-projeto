/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiro.projeto;

import java.util.Scanner;



/**
 *
 * @author sn1093554
 */
public class PrimeiroProjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
           // 1 Passo - Declarar as Variaveis
            double p1, p2, p3, p4, media;
            String nome;
            
            Scanner sc = new Scanner(System.in);
            
            // 2 Passo - Entrada de dados
            System.out.println("Querido usuario, entre com seu nome: ");
            nome = sc.nextLine();
            
            System.out.println("Entre com a primeira nota: ");
            p1 = sc.nextDouble();
            
            System.out.println("Entre com a segunda nota:");
            p2 = sc.nextDouble();
            
            System.out.println("Entre com a terceira nota:");
            p3 = sc.nextDouble();
            
            System.out.println("Entre com a quarta nota: ");
            p4 = sc.nextDouble();          
            
            // 3 Passo - Processamento
            media = (p1 + p2 + p3 + p4) /4;
         
           // 4 Passo - Saida     
          System.out.println("Resultado Final");
          System.out.println("=================================");
          
          System.out.println("Aluno: " + nome);
          System.out.println("Media final: " + media);
         
    }
    
}
