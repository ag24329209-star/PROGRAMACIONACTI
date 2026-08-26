import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static int mostrarMenuPrincipal() {
        int opcion;
        do {
            System.out.println("+--------------------------+");
            System.out.println("| MENU PRINCIPAL           |");
            System.out.println("| CALCULADORA DE FIGURAS   |");
            System.out.println("| 1. Area                  |");
            System.out.println("| 2. Volumen               |");
            System.out.println("| 3. Terminar              |");
            System.out.println("+--------------------------+");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 3);
        return opcion;
    }

    public static int mostrarMenuArea() {
        int opcion;
        do {
            System.out.println();
            System.out.println("+--------------------------+");
            System.out.println("| CALCULAR AREA            |");
            System.out.println("| 1. Cuadrado              |");
            System.out.println("| 2. Triangulo             |");
            System.out.println("| 3. Circulo               |");
            System.out.println("| 4. Hexagono              |");
            System.out.println("+--------------------------+");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }

    public static int mostrarMenuVolumen() {
        int opcion;
        do {
            System.out.println();
            System.out.println("+--------------------------+");
            System.out.println("| CALCULAR VOLUMEN         |");
            System.out.println("| 1. Cubo                  |");
            System.out.println("| 2. Cilindro              |");
            System.out.println("| 3. Esfera                |");
            System.out.println("+--------------------------+");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();
        } while (opcion < 1 || opcion > 3);
        return opcion;
    }

    public static void calcularAreaCuadrado() {
        System.out.print("Ingrese el lado: ");
        double lado = sc.nextDouble();
        double area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    }

    public static void calcularAreaTriangulo() {
        System.out.print("Ingrese la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = sc.nextDouble();
        double area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }

    public static void calcularAreaCirculo() {
        System.out.print("Ingrese el radio: ");
        double radio = sc.nextDouble();
        double area = Math.PI * radio * radio;
        System.out.println("El area del circulo es: " + area);
    }

    public static void calcularAreaHexagono() {
        System.out.print("Ingrese el lado: ");
        double lado = sc.nextDouble();
        double area = (3 * Math.sqrt(3) / 2) * lado * lado;
        System.out.println("El area del hexagono es: " + area);
    }

    public static void calcularVolumenCubo() {
        System.out.print("Ingrese el lado: ");
        double lado = sc.nextDouble();
        double volumen = lado * lado * lado;
        System.out.println("El volumen del cubo es: " + volumen);
    }

    public static void calcularVolumenCilindro() {
        System.out.print("Ingrese el radio: ");
        double radio = sc.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = sc.nextDouble();
        double volumen = Math.PI * radio * radio * altura;
        System.out.println("El volumen del cilindro es: " + volumen);
    }

    public static void calcularVolumenEsfera() {
        System.out.print("Ingrese el radio: ");
        double radio = sc.nextDouble();
        double volumen = (4.0 / 3.0) * Math.PI * radio * radio * radio;
        System.out.println("El volumen de la esfera es: " + volumen);
    }

    public static void main(String[] args) {
        boolean terminar = false;

        do {
            int opcion = mostrarMenuPrincipal();

            if (opcion == 1) {
                int subOpcion = mostrarMenuArea();

                if (subOpcion == 1) {
                    calcularAreaCuadrado();
                } else if (subOpcion == 2) {
                    calcularAreaTriangulo();
                } else if (subOpcion == 3) {
                    calcularAreaCirculo();
                } else if (subOpcion == 4) {
                    calcularAreaHexagono();
                }

            } else if (opcion == 2) {
                int subOpcion = mostrarMenuVolumen();

                if (subOpcion == 1) {
                    calcularVolumenCubo();
                } else if (subOpcion == 2) {
                    calcularVolumenCilindro();
                } else if (subOpcion == 3) {
                    calcularVolumenEsfera();
                }

            } else if (opcion == 3) {
                System.out.println();
                System.out.println("+--------------------------+");
                System.out.println("| Gracias por usar el      |");
                System.out.println("| sistema.                 |");
                System.out.println("+--------------------------+");
                terminar = true;
            }

            System.out.println();

        } while (!terminar);

        sc.close();
    }
}