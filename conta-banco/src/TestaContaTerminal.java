import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TestaContaTerminal {

    public static void main(String[] args) {

        dadosContas();

    }

    public static void dadosContas(){
        Scanner sc = new Scanner(System.in);
        ContaTerminal contaterminal;
        List<ContaTerminal> listaContas = new ArrayList<ContaTerminal>();
        int opcao = 0;
    
        do {
          System.out.println("## Escolha uma das opções abaixo ##");
          System.out.println("Opção 1 - Cadastrar  contas");
              System.out.println("Opção 2 - Imprime contas criadas");
              System.out.println("Opção 0 - Sair do programa");
              System.out.println("_______________________");
    
              System.out.print("Digite aqui sua opção: ");
              opcao = Integer.parseInt(sc.nextLine());
    
              if(opcao == 1){
          //Cria um novo objeto
                  contaterminal = new ContaTerminal();
    
              System.out.print("Digite o numero da conta: ");
              contaterminal.setConta(Integer.parseInt(sc.nextLine()));
    
              System.out.print("Digite a Agencia: ");
              contaterminal.setAgencia(sc.nextLine());
    
              System.out.print("Digite o nome do Cliente: ");
              contaterminal.setCliente(sc.nextLine());
    
              System.out.print("Digite o saldo: ");
              contaterminal.setSaldo(Double.parseDouble(sc.nextLine()));

              System.out.println("Obrigado por criar uma conta em nosso banco");

              System.out.println("Seu saldo já está disponivel para saque");
    
              System.out.println();
    
          //Guarda o objeto conta em uma lista.
              listaContas.add(contaterminal);
              }else if(opcao == 2){
                if(listaContas.isEmpty()){
                  System.out.println("Não existem contas cadastradas, pressione uma tecla para continuar!");
                  sc.nextLine();
                }else{
                  System.out.println(listaContas.toString());
    
                  System.out.println("Pressione um tecla para continuar.");
                  sc.nextLine();
                }         }
        } while (opcao != 0);
    
        sc.close();
      }
    }


    

