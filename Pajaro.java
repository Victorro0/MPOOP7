public class Pajaro extends AnimalAereo{
  private String tipoPico;

  public Pajaro(){}

  public void recolectarRamas(){
    System.out.println("Ando juntando ramas");
  }

  public void setPico(String tipoPico){
    this.tipoPico = tipoPico;
  }
  public String getPico(){
    return tipoPico;
  }
}