public class AnimalTerrestre extends Animal{
  private int patas;

  public void correr(){
    System.out.println("Estoy corriendo");
  }

  public void setPatas(int patas){
    this.patas = patas;
  }
  public int getPatas(){
    return patas;
  }

  @Override
  public void comer(){
    System.out.println("Estoy comiendo croquetas");
  }
}