package ejercicio3_2;

public class Main {

    public static void main(String[] args) {
        Cadena cadena1 = new Cadena();
        String mayus ="";
        int longitud = cadena1.cadenaInicial.length();
        System.out.println("La longitud del String es = "+longitud);
        String cadenaSinEspacios = cadena1.cadenaInicial.trim();
        System.out.println("El String sin espacios en blanco = "+cadenaSinEspacios);
        String cadenaMayuscula = cadenaSinEspacios.toUpperCase();
        System.out.println("El String en mayuscula = "+cadenaMayuscula);
        String cadenaConcatenada = cadenaMayuscula.concat("12345");
        System.out.println("El String concatenado = "+ cadenaConcatenada);
        String cadenaExtraida = cadenaConcatenada.substring(24,31);
        System.out.println("El String extraido = "+ cadenaExtraida);
        String cadenaRemplazada = cadenaExtraida.replace("O","X");
        System.out.println("El String remplazado= "+ cadenaRemplazada);
        boolean comparacion= cadenaRemplazada.equals("Programacion");
        System.out.println("Los String son iguales = "+ comparacion);

        //Un metodo que reciba como parámetro un String y calcule cuántas mayúsculas tiene.

        System.out.println("Un metodo que reciba como parametro un String y calcule cuantas mayusculas tiene.");

        for (int i=0;i<cadena1.cadenaInicial.length();i++){
            if(Character.isUpperCase(cadena1.cadenaInicial.charAt(i))){
                mayus=mayus+cadena1.cadenaInicial.charAt(i);
            }
        }
        System.out.println("Las mayusculas son: "+ mayus);

        int contador = 0;
        for (int i = 0; i < cadena1.cadenaInicial.length(); i++) {
            char caracter = cadena1.cadenaInicial.charAt(i);
            if (Character.isUpperCase(caracter)) {
                contador++;
            }
        }
        System.out.println("La cantidad de mayusculas son: "+contador);

//Un metodo que reciba como parametro un String y una letra, y determine cuántas veces está la letra en el String (la letra puede estar en mayuscula o minuscula).
        int contador2 = 0;
        char letra = 'a';
        for (int i = 0; i < cadena1.cadenaInicial.length(); i++) {
            char caracter = cadena1.cadenaInicial.charAt(i);
            if (caracter == letra || Character.toLowerCase(caracter) == Character.toLowerCase(letra)) {
                contador2++;
            }
        }
        System.out.println("La letra '" + letra + "' aparece " + contador2 + " veces en el texto: " + cadena1.cadenaInicial);

        //Un mtodo que reciba como parametro un String, y que elimine todos sus espacios en blanco y escriba en pantalla el String resultante.

        String TextoSinEspacios = cadena1.cadenaInicial.replaceAll(" ", "");
        System.out.println("Texto sin espacios: " + TextoSinEspacios);

        //Un método que reciba como parámetro un String, y obtenga el String escrito al revés.

        String textoInvertido = "";
        for (int i = cadena1.cadenaInicial.length() - 1; i >= 0; i--) {
            textoInvertido = textoInvertido +cadena1.cadenaInicial.charAt(i);
        }
        System.out.println("Texto invertido: ");
        System.out.println(textoInvertido);





    }
}
