import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static int mostrarMenuPrincipal() {
        int opcion;
        do {
            System.out.println("MENU PRINCIPAL - CALCULADORA DE FIGURAS");
            System.out.println("1. Area");
            System.out.println("2. Volumen");
            System.out.println("3. Terminar");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 3);
        return opcion;
    }

    public static int mostrarMenuArea() {
        int opcion;
        do {
            System.out.println("CALCULAR AREA");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Circulo");
            System.out.println("4. Hexagono");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }

    public static int mostrarMenuVolumen() {
        int opcion;
        do {
            System.out.println("CALCULAR VOLUMEN");
            System.out.println("1. Cubo");
            System.out.println("2. Cilindro");
            System.out.println("3. Esfera");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 3);
        return opcion;
    }

    public static void calcularAreaCuadrado() {
        System.out.print("Ingrese el lado: ");
        double lado = sc.nextDouble();
        System.out.println("El area del cuadrado es: " + (lado * lado));
    }

    public static void calcularAreaTriangulo() {
        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = sc.nextDouble();
        System.out.println("El area del triangulo es: " + (base * altura / 2));
    }

    public static void calcularAreaCirculo() {
        System.out.print("Ingrese el radio: ");
        double radio = sc.nextDouble();
        System.out.println("El area del circulo es: " + (Math.PI * radio * radio));
    }

    public static void calcularAreaHexagono() {
        System.out.print("Ingrese el lado: ");
        double lado = sc.nextDouble();
        System.out.println("El area del hexagono es: " + (3 * Math.sqrt(3) / 2 * lado * lado));
    }

    public static void calcularVolumenCubo() {
        System.out.print("Ingrese el lado: ");
        double lado = sc.nextDouble();
        System.out.println("El volumen del cubo es: " + (lado * lado * lado));
    }

    public static void calcularVolumenCilindro() {
        System.out.print("Ingrese el radio: ");
        double radio = sc.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = sc.nextDouble();
        System.out.println("El volumen del cilindro es: " + (Math.PI * radio * radio * altura));
    }

    public static void calcularVolumenEsfera() {
        System.out.print("Ingrese el radio: ");
        double radio = sc.nextDouble();
        System.out.println("El volumen de la esfera es: " + (4.0 / 3 * Math.PI * radio * radio * radio));
    }

    public static void main(String[] args) {
        boolean terminar = false;

        do {
            int opcion = mostrarMenuPrincipal();

            if (opcion == 1) {
                switch (mostrarMenuArea()) {
                    case 1 -> calcularAreaCuadrado();
                    case 2 -> calcularAreaTriangulo();
                    case 3 -> calcularAreaCirculo();
                    case 4 -> calcularAreaHexagono();
                }
            } else if (opcion == 2) {
                switch (mostrarMenuVolumen()) {
                    case 1 -> calcularVolumenCubo();
                    case 2 -> calcularVolumenCilindro();
                    case 3 -> calcularVolumenEsfera();
                }
            } else {
                System.out.println("Gracias por usar el sistema.");
                terminar = true;
            }

        } while (!terminar);

        sc.close();
    }
}
