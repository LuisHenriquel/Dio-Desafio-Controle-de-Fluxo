import java.util.Scanner;

class Desafio{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int parametroUm = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite o segundo parametro");
        int parametroDois = scan.nextInt();
        scan.nextLine();
        try {

            contar(parametroUm, parametroDois);
        } catch (NumberFormatException exception) {
            System.out.println("O parametro um tem que ser maior que o parametro dois");
        }


    }

    static void contar(int parametroum, int parametrodois)throws NumberFormatException {

        if (parametroum < parametrodois){
            throw new NumberFormatException();
            }
            else{
            int contagem = parametroum - parametrodois;
            for(int x=1;x <= contagem; ++x){
                System.out.println("Imprimindo o numero " + x);
            }
        }


    }



}