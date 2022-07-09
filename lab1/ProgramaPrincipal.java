/*
 * Ténicas de Construção de Programas - Lab1
 * Matheus Almeida Silva - 316326
 */
package lab1;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        // Declara e Instancia o objeto im1
        Imovel im1;
        im1 = new Imovel();
        im1.nQuartos = 2;
        im1.nBanheiros = 1;
        im1.temGaragem = false;
        im1.Endereco = "Rua dos fulanos, n.0";
        im1.aluguel = true;
        im1.valorVenda = 142000;

        //Chamada dos métodos da classe Imovel
        im1.ImprimeDados();
        System.out.printf("%2f\n", im1.calculaImposto());
        im1.valoriza(2.5);
        im1.ImprimeDados();

        /*
         * Parte 5
         * Ao declararmos e instanciarmos um segundo objeto e compará-lo a um primeiro, ainda que os atributos sejam os mesmos e pertençam
         * a mesma classe,os objetos serão distintos.
        */
        Imovel im2;
        im2 = new Imovel();
        im2.nQuartos = 2;
        im2.nBanheiros = 1;
        im2.temGaragem = false;
        im2.Endereco = "Rua dos fulanos, n.0";
        im2.aluguel = true;
        im2.valorVenda = 142000;

        if (im1 == im2){
            System.out.println("Mesmo imoveis!");
        } else {
            System.out.println("Imoveis distintos!");
        }

        /*
         * Parte 6
         * Na questão 6 fazemos a declaração de um terceiro objeto im3 Imovel que ao invés de instanciar, recebe o objeto im1.
         * Ocorre que quando definimos o valorVenda em 0, tanto o im3 quanto o im1 são zerados, tendo em vista que ambos intanciam
         * o mesmo objeto.
        */
        Imovel im3 = im1;
        im3.valorVenda = 0;
        im3.ImprimeDados();
        im1.ImprimeDados();
    }
}
