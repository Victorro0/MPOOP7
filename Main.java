class Main {
  public static void main(String[] args) {
    Gerente ger = new Gerente();
    System.out.println(ger);

    ger.setNombre("Romina Perez");
    ger.setNumEmpleado(654789);
    ger.setSueldo(35_000);//El guion bajo es un separador
    System.out.println(ger);
    System.out.println(ger.getNombre());
    ger.setPresupuesto(90_000);
    System.out.println(ger);

    Gerente ger2 = new Gerente("Samuel Torres", 895632, 15_000,25_000);
    System.out.println(ger2);

    Ballena ballena1 = new Ballena();
    System.out.println("*** Animal Acuatico (Ballena) ***");
    ballena1.setNombre("Moby");
    ballena1.setOrigen("Agua");
    ballena1.setColor("Azul");
    ballena1.setAletas(4);
    ballena1.setLargo(26);
    System.out.println("Nombre: "+ballena1.getNombre());
    System.out.println("Origen: "+ballena1.getOrigen());
    System.out.println("Color: "+ballena1.getColor());
    System.out.println("Aletas: "+ballena1.getAletas());
    System.out.println("Largo: "+ballena1.getLargo());

    System.out.println("*** Animal Terrestre (Perro) ***");
    Perro perro1 = new Perro();
    perro1.setNombre("Milaneso");
    perro1.setOrigen("Ecatepec");
    perro1.setColor("Cafe");
    perro1.setPatas(4);
    perro1.setCollar("Verde");
    System.out.println("Nombre: "+perro1.getNombre());
    System.out.println("Origen: "+perro1.getOrigen());
    System.out.println("Color: "+perro1.getColor());
    System.out.println("Patas: "+perro1.getPatas());
    System.out.println("Color collar: "+perro1.getCollar());

    System.out.println("*** Animal Aereo (Pajaro) ***");
    Pajaro pajaro1 = new Pajaro();
    pajaro1.setNombre("Zeus");
    pajaro1.setOrigen("Tepito");
    pajaro1.setColor("verde");
    pajaro1.setAlas(2);
    pajaro1.setPico("Carroñero");
    System.out.println("Nombre: "+pajaro1.getNombre());
    System.out.println("Origen: "+pajaro1.getOrigen());
    System.out.println("Color: "+pajaro1.getColor());
    System.out.println("Alas: "+pajaro1.getAlas());
    System.out.println("Tipo de pico: "+pajaro1.getPico());
  }
}