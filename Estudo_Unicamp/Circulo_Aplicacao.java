package Estudo_Unicamp;

public class Circulo_Aplicacao {
    public static void main(String args[]) {
        Circulo_Classe umcirc; //criação da nova variável
        umcirc = new Circulo_Classe(); //alocação da nova varíavel
        System.out.println("(" + umcirc.x + "," + umcirc.y + "," + umcirc.raio + ")");
        umcirc.x=umcirc.x+1;
        umcirc.y=umcirc.y+1;
        System.out.println("(" + umcirc.x + "," + umcirc.y + "," + umcirc.raio + ")");
    }
}
