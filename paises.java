public class Main {

    public static void main(String[] args) {gut
        String[] paisesAmerica = {
            "Canadá", "Estados Unidos", "México",
            "Belice", "Costa Rica", "El Salvador", "Guatemala", "Honduras", 
            "Nicaragua", "Panamá",
            "Antigua y Barbuda", "Bahamas", "Barbados", "Cuba", "Dominica", 
            "Granada", "Haití", "Jamaica", "República Dominicana", 
            "San Cristóbal y Nieves", "Santa Lucía", 
            "San Vicente y las Granadinas", "Trinidad y Tobago",
            "Argentina", "Bolivia", "Brasil", "Chile", "Colombia", 
            "Ecuador", "Guyana", "Paraguay", "Perú", "Surinam", 
            "Uruguay", "Venezuela"
        };
        
        int contador = contarPaisesCuatroLetras(paisesAmerica);
        System.out.println("Número de países con nombre de 4 letras: " + contador);
    }

    public static int contarPaisesCuatroLetras(String[] paises) {
        int contador = 0;
        for (String pais : paises) {
            if (pais.length() == 4) {
                contador++;
            }
        }
        return contador;
    }
}
