public class App {
    public static void main(String[] args) throws Exception {
        int base = 0;
        int exponente = 0;
        int resultado = 1;

        boolean correcto = false;
        do {
            try {
                base = Integer.parseInt(System.console().readLine("Introduzca la base: "));
                exponente = Integer.parseInt(System.console().readLine("Introduzca el exponente maximo: "));
                correcto = true;
            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un numero entero");
                correcto = false;
            } catch (Exception e) {
                System.out.println("Se a prodicido un Error Inesperado, Intentelo de nuevo");
                correcto = false;
            }
        } while (!correcto);

        for (int i = 1; i <= exponente; i++) {
            resultado *= base;
            System.out.printf("%d^%d = %d%n",base,i,resultado ); 
        }

    }
}
