/*
 * Ténicas de Construção de Programas - Lab1
 * Matheus Almeida Silva - 316326
 */
package lab1;

public class Imovel {
    int nQuartos;
    int nBanheiros;
    boolean temGaragem;
    String Endereco;
    boolean aluguel;
    double valorVenda;

void ImprimeDados(){
    System.out.printf("Quartos:%d\nBanheiros:%d\n",this.nQuartos, this.nQuartos);
    if (temGaragem){
        System.out.println("Garagem:sim");
    } else {
        System.out.println("Garagem:não");
    }
    System.out.printf("%s\n", this.Endereco);
    if (aluguel){
        System.out.println("Aluguel:sim");
    } else {
        System.out.println("Aluguel:não");
    }
    System.out.printf("%2f\n\n", this.valorVenda);
}

double calculaImposto(){
    if (aluguel){
        return (0.12*0.05*this.valorVenda);
    }
    else {
        return (0.18*this.valorVenda);
    }
}

void valoriza(double perc){
    this.valorVenda = this.valorVenda + (perc/100)*this.valorVenda;
}

}