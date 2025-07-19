import java.util.Scanner;
public class Quiz{
     public static Scanner tec= new Scanner(System.in);
    public static void main(String [] args){
       
        System.out.print("=== Quiz de perguntas Cristãs === \n");
        Boolean fl=true;

        while(fl){
            System.out.println("Queres jogar? Sim/Não");
            String respota=tec.nextLine();
            
            if (respota.equalsIgnoreCase("Sim")) {
                limpar();
                System.out.println("__________________________________________________");
                System.out.println("Quem conduziu Jesus para o deserto? ");
                resposta1();
                pausar();
                limpar();

                pergunta2();
                tec.nextLine();
                limpar();

                pergunta3();
                pausar();
                limpar();
                System.out.println("Jogo terminado, Obrigada por jogar");
                fl=false;
            }
            else{
                System.out.println("Tudo bem. Até lá");
                fl=false;
            }
        }
    }
  
    public static void resposta1(){
        System.out.println("[1]- Espirito Santo");   
        System.out.println("[2]- João Baptista"); 
        System.out.println("[3]- Deus"); 
        int opcao=tec.nextInt();
        tec.nextLine();
        if (opcao==1) {
         System.out.println("Resposta correta. ");   
        }
        else{
        System.out.println("Errado a resposta correta Espirito Santo.");
        }    
    }

    public static void pergunta2() {
        System.out.println("Qual discípulo andou sobre as águas?");
        System.out.println("[1] João");
        System.out.println("[2] Pedro");
        System.out.println("[3] Tomé");

        int opcao = tec.nextInt();
        tec.nextLine();

        if (opcao == 2) {
            System.out.println("Resposta correta!");
        } else {
            System.out.println("Errado. A resposta certa é: Pedro.");
            
        }
    }

    public static void pergunta3() {
        System.out.println("Quem foi o discipulo que traiu Jesus?");
        System.out.println("[1] João");
        System.out.println("[2] Marcos");
        System.out.println("[3] Judas");

        int opcao = tec.nextInt();
        tec.nextLine();

        if (opcao == 3) {
            System.out.println("Resposta correta!");
        } else {
            System.out.println("Errado. A resposta certa é: Pedro.");
            
        }
    }

      //Metodos para limpar e pausar e limpar o programa.

    public static void limpar(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
}
    public static void pausar(){
        System.out.println(" Precione a tecla enter para continuar... ");
        tec.nextLine();
    }

    }
