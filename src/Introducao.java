public class Introducao {
    public static void main(String[] args) {
        // Print em Java
        System.out.println("Olá mundo!");

        // Variáveis  do tipo real
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

    }
}
