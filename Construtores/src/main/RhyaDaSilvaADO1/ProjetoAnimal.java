public class ProjetoAnimal{

  // ATRIBUTOS
  String especie;
  String nome;
  String cor;
  double tamCm;
  String comida;
  int correr;

  // METODOS
  void tamanho(double comprimento){
    tamCm+=comprimento;
    }

  void correndo(int velocidade){
    correr+=velocidade;
  }

  void predileta(String preferida){
    comida = preferida;
  }
  
  void comendo(){
    System.out.println("Comendo...");
  }

}