public class SentenciasControl {
    public static void main(String[] args) {

        System.out.println("Trabajando con IF");

        int numeroIf = 5;

        if (numeroIf > 0) {
            System.out.println("El Numero es Positivo");
        } else if (numeroIf > 0) {
            System.out.println("El Numero es Negativo");
        }
        else {
            System.out.println("El Numero es Cero");
        }

        System.out.println("");

        System.out.println("Trabajando con While");
        int numeroWhile = 1;
        while (numeroWhile <= 3){
            System.out.println("Numero While vale " + String.format("%d",numeroWhile));
            numeroWhile = numeroWhile +1 ;
        }

        System.out.println("");

        System.out.println("Trabajando con Do While");
        int numeroDoWhile = 3;
        do{
            numeroDoWhile = numeroDoWhile +1 ;
            System.out.println("Numero Do_While vale "+ String.format("%d", numeroDoWhile) );
        }
        while ( numeroDoWhile <=3);

        System.out.println("");

        System.out.println("Trabajando con Ciclo For");
        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("Numero For vale "+ String.format("%d", numeroFor) );
        }

        System.out.println("");

        System.out.println("Trabajando con Sentencias Swich");

        String estacion = "Invierno";

        switch (estacion){
            case "Verano" :
                System.out.println("Estamos en: " + estacion);
                break;
            case "Otoño" :
                System.out.println("Estamos en: " + estacion);
                break;
            case "Invierno" :
                System.out.println("Estamos en: " + estacion);
                break;
            case "Primavera" :
                System.out.println("Estamos en: " + estacion);
                break;
        }
    }
}
