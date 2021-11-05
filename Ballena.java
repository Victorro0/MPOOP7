public class Ballena extends AnimalAcuatico{
  private int largo;

  public Ballena(){}

  public void PelearConPinocho(){
    System.out.println("Estoy peleando");
  }

  public void setLargo(int largo){
    this.largo = largo;
  }
  public int getLargo(){
    return largo;
  }
}