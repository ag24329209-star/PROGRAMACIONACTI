import java.util.Scanner;

public class Main {
    public static String[] nombre = new String[100];
    public static float[] sueldo = new float[100];
    public static String[] cargo = new String[100];
    public static int totalEmpleados = 0;

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        for (int siempre = 1; siempre == 1; siempre = 1) {
            mostrarMenu();
            int opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion == 1) { crearEmpleado(); }
            if (opcion == 2) { leerEmpleados(); }
            if (opcion == 3) { actualizarEmpleado(); }
            if (opcion == 4) { eliminarEmpleado(); }
            if (opcion == 5) {
                System.out.println("Saliendo...");
                break;
            }
        }

        entrada.close();
    }

    public static void mostrarMenu() {
        System.out.println("\n===== MENÚ CRUD EMPLEADOS =====");
        System.out.println("1. Crear empleado");
        System.out.println("2. Leer empleados");
        System.out.println("3. Actualizar empleado");
        System.out.println("4. Eliminar empleado");
        System.out.println("5. Salir");
        System.out.print("Elija una opción: ");
    }

    public static void crearEmpleado() {
        for (int seguir = 1; seguir == 1; seguir = 1) {
            if (totalEmpleados >= nombre.length) {
                System.out.println("No hay espacio para más empleados.");
                break;
            }

            System.out.println("\n--- Nuevo Empleado (#" + totalEmpleados + ") ---");
            leerDatos(totalEmpleados);
            totalEmpleados++;

            System.out.print("¿Desea agregar otro empleado? (s/n): ");
            String respuesta = entrada.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                break;
            }
        }
    }

    public static void leerEmpleados() {
        if (totalEmpleados == 0) {
            System.out.println("No hay empleados registrados.");
        }

        for (int i = 0; i < totalEmpleados; i++) {
            verDatos(i);
            System.out.println("---------------------------------");
        }
    }

    public static void actualizarEmpleado() {
        if (totalEmpleados == 0) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        System.out.print("Escriba el # del empleado a actualizar: ");
        int numero = entrada.nextInt();
        entrada.nextLine();

        if (numero < 0 || numero >= totalEmpleados) {
            System.out.println("Ese número no existe.");
            return;
        }

        System.out.println("Datos actuales:");
        verDatos(numero);

        System.out.println("Ingrese los nuevos datos:");
        leerDatos(numero);
        System.out.println("Empleado actualizado con éxito.");
    }

    public static void eliminarEmpleado() {
        if (totalEmpleados == 0) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        System.out.print("Escriba el # del empleado a eliminar: ");
        int numero = entrada.nextInt();
        entrada.nextLine();

        if (numero < 0 || numero >= totalEmpleados) {
            System.out.println("Ese número no existe.");
            return;
        }

        correrPosiciones(numero);
        totalEmpleados--;
        System.out.println("Empleado eliminado con éxito.");
    }

    public static void correrPosiciones(int desde) {
        for (int i = desde; i < totalEmpleados - 1; i++) {
            nombre[i] = nombre[i + 1];
            cargo[i] = cargo[i + 1];
            sueldo[i] = sueldo[i + 1];
        }
    }

    public static void verDatos(int nroEmpleado) {
        System.out.println("#: " + nroEmpleado);
        System.out.println("Nombre del empleado: " + nombre[nroEmpleado]);
        System.out.println("Cargo del empleado: " + cargo[nroEmpleado]);
        System.out.println("Sueldo del empleado: " + sueldo[nroEmpleado]);
    }

    public static void leerDatos(int nroEmpleado) {
        System.out.print("Escriba el nombre: ");
        nombre[nroEmpleado] = entrada.nextLine();

        System.out.print("Escriba el cargo: ");
        cargo[nroEmpleado] = entrada.nextLine();

        System.out.print("Escriba el sueldo: ");
        sueldo[nroEmpleado] = entrada.nextFloat();
        entrada.nextLine();
    }
}