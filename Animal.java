public class Animal{
  private String nombre;
  private String lugarOrigen;
  private String color;

  public Animal(){}

  public void hacerSonido(String sonido){
    System.out.println("Sonido"+sonido);
  }
  public void comer(){
    System.out.println("Estoy comiendo");
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getNombre(){
    return nombre;
  }

  public void setOrigen(String lugarOrigen){
    this.lugarOrigen = lugarOrigen;
  }
  public String getOrigen(){
    return lugarOrigen;
  }

  public void setColor(String color){
    this.color = color;
  }
  public String getColor(){
    return color;
  }
}