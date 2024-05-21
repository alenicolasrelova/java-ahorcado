import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "alejandro";
        int intentosMax = 15;
        int intento = 0;
        boolean isAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //Bucle de control
        for(int i=0; i < letrasAdivinadas.length ; i++){
            letrasAdivinadas[i] = '_';
            System.out.print(letrasAdivinadas[i]);
        }

        while (!isAdivinada && intento < intentosMax) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (a" + palabraSecreta.length() + " letras)" );
            System.out.println("Introduce una letra por favor");
            char letra = Character.toLowerCase(scanner.next().charAt(0));
            
            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                //Estructura de control condicional
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if(!letraCorrecta){
                intento++;
                System.out.println("Letra incorrecta! Te quedan " + (intentosMax - intento) + " intentos.");
            }
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                isAdivinada = true;
                System.out.println("Felicidades!!! La palabra secreta era: " + palabraSecreta);
            }
            
        }
        if (!isAdivinada){
            System.out.println("Que pena, te quedaste sin intentos.! La palabra era: " + palabraSecreta );
        }
        scanner.close();
    }
}
