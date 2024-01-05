public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        int numeroIf=0;
        if(numeroIf==0){
            System.out.println("El númeroIf es 0");
        } else if (numeroIf<0) {
            System.out.println("El númeroIf es menor 0: "+numeroIf);
        } else if (numeroIf>0) {
            System.out.println("El númeroIf es mayor 0: "+numeroIf);
        }

        //Ejercicio 2
        int numeroWhile=0;
        while (numeroWhile<3){
            System.out.println("El número while es: "+numeroWhile);
            numeroWhile++;
        }

        //Ejercicio 3
        do{
            System.out.println("El número do while es: "+numeroWhile);
            numeroWhile++;
        }while (numeroWhile<0);

        //Ejercicio 4
        for(int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("El número For es: "+numeroFor);
        }

        //Ejercicio 5
        String estacion="ooño";
        switch (estacion){
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "primeavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            default:
                System.out.println("Eso no es una estación");
        }

    }
}