public class Perro extends AnimalTerrestre{
  private String colorCollar;

  public Perro(){}

  public void hacerTrucos(){
    System.out.println("Me estoy haciendo el muertito");
  }

  public void setCollar(String colorCollar ){
    this.colorCollar = colorCollar;
  }
  public String getCollar(){
    return colorCollar;
  }
}