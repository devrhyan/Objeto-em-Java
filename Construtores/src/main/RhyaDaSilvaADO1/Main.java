public class Main {
  public static void main(String[] args) {
    
    ProjetoAnimal p1 = new ProjetoAnimal();

    p1.especie = "Rato";
    p1.nome = "Mickey Mouse";
    p1.cor = "Preta";
    p1.comida = "Queijo";
    p1.tamCm = 15;
    p1.correr = 10;

    System.out.println("====== Seu nome é: " + p1.nome + " ======\n");
    
    System.out.println("Sua pelagem tem a cor " + p1.cor.toLowerCase()
 + "\n");
    
    System.out.println("Sua comida preferida é " + p1.comida + "\n");

    p1.comendo();
    
    p1.tamanho(10);
    System.out.println("\nSeu tamanho é de: " + p1.tamCm + " Centímetros\n");

    p1.correndo(5);
    System.out.println("E sua velocidade é de: " + p1.correr + "Km/h \n\n\n");


    p1.especie = "Rato";
    p1.nome = "Jerry";
    p1.cor = "Marrom";
    p1.comida = "Cupcake";
    p1.tamCm = 7.5;
    p1.correr = 5;

    System.out.println("====== Seu nome é: " + p1.nome + " ======\n");

    System.out.println("Sua pelagem tem a cor " + p1.cor.toLowerCase() + "\n");

    System.out.println("Sua comida preferida é " + p1.comida + "\n");

    p1.comendo();

    p1.tamanho(5);
    System.out.println("\nSeu tamanho é de " + p1.tamCm + " Centímetros\n");

    p1.correndo(5);
    System.out.println("E sua velocidade máxima é de " + p1.correr + "Km/h \n\n");
  }

}