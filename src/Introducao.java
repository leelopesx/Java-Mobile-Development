import java.util.Scanner;

public class Introducao {
    public static void main(String[] args) {
        // Print em Java
        System.out.println("Olá mundo!");

        // Variáveis  do tipo real (Consegue armazenar números maiores do que o float)
        double x,y,z,w;

        // Variável do tipo inteiro
        int m, n=1;
        x = 3.2;
        y = x*2;
        z = (x+y)/2;
        w = x+y /2;
        m = n/2;
        // Em operações de números inteiros, o resultado será um número inteiro.

        System.out.println("x = " + x + "  y = " + y);
        System.out.println("m = " + m);

        // Exercício 01
        double preco, desconto10;
        preco = 23.5;
        desconto10 = preco*0.9;
        System.out.println("O valor com 10% de desconto será  " + desconto10);

        // Utilizando apenas duas casas decimais
        System.out.printf("%s%.2f\n", "O valor com 10% de desconto será  " , desconto10);

        // Classe Scanner - ler uma informação inserida pelo o usuário (leitura de dados) (famoso input)
        Scanner le = new Scanner(System.in); // System.in - ler dados digitados pelo usuário
        int qtd;
        double valor;

        // Ler as variáveis de acordo com o seu tipo
        System.out.print("Informe a quantidade:" );
        qtd = le.nextInt(); // Ler o valor como um número inteiro
        System.out.print("Informe o valor:" );
        valor = le.nextDouble();

        double media = valor/qtd;
        System.out.println("Média do preço de cada produto: " + media);

        // Exercicio 02
        double F, C;
        System.out.print("Informe a temperatura em Farenheit:" );
        F = le.nextDouble();
        C = 5/9.0 * (F-32);
        System.out.printf("%s%.2f\n" , "A temperatura convertida para graus Celcius é de: " , C , "C");


        // Condicional
        int n1, n2;
        System.out.print("N1 = ");
        n1 = le.nextInt();
        System.out.print("N2 = ");
        n2 = le.nextInt();

        if (n1 == n2){
            System.out.print("Números iguais");
        } else if (n1 > n2) {
            System.out.print("N1 é maior que N2");
        } else {
            System.out.print("N2 é maior que N1");
        }

        le.close(); // Finalização do Scanner (para desocupar na memória)

        // Exercicio 03 (condicional)
    }
}
