public class Main {
    public static void main(String[] args)
    {
        int resultado =suma(10,5,21);
        System.out.println(resultado);
        Coche auto=new Coche();
        System.out.println(auto.sumarPuerta());
        System.out.println(auto.sumarPuerta());
    }
    public static int suma(int a,int b,int c){
        return a+b+c;
    }
}

 class Coche{
    private int puertas=0;

    public int sumarPuerta(){
        this.puertas++;
        return this.puertas;
    }
 }