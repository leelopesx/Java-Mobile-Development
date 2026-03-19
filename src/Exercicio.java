import java.util.Locale;
import java.util.Scanner;
// perguntar parcelas
// varios clientes
// desconto ou acrescimo
// nn aceitar numeros de parcelas n permitidos
// exibir o acrescimo e o valor final
// tudo no slide 03 de java
public class Exercicio {
    public static void main(String[] args) {
        // Locale.setDefault(Locale.US); Utilizando o padrão americano.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem vindo(a) a loja");
        System.out.println("Qual foi o valor total da sua compra (R$)");
        double valor = leitor.nextDouble();
        System.out.println("Qual o número de parcelas desejado?");
        int parcelas = leitor.nextInt();
        // colocar o while antes
        if (parcelas>= 1 && parcelas<=5){
            double valorfinal;

            if (parcelas == 1){
                valorfinal = valor * 0.9;

            }

            else if (parcelas > 1 && parcelas<= 3 ){
                valorfinal = valor;
            }

            else if (parcelas == 4){
                // aumentando 5%
                valorfinal = valor * 1.05;
            }

            else if (parcelas == 5){
                // aumentando 6%
                valorfinal = valor * 1.06;
            }


        }

        else {
            System.out.println("Números de parcelas invalido");
            System.out.println("Reinicie o pagamento");
        }

        // DO WHILE - quando sabemos que o código vai ser executado pelo menos uma vez


        // fazer o exercicio 04 (slide 03)
        // checkpoint próxima aula -- enunciado sacnner print if operador operacional e logico e o while
        // 15min para duvida
        // codigos disponibilizados no teams -- projetos aulas
        // lista de exercicios no teams




    }
}
