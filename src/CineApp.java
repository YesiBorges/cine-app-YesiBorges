import java.util.Scanner;

public class CineApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PRECIO_NORMAL = 3500.0;

        System.out.println("Bienvenido al sistema de venta de boletos de cine");
        System.out.print("Por favor, ingrese su edad: ");

        if (scanner.hasNextInt()) {
            int edad = scanner.nextInt();

            if (edad < 0 || edad > 120) {
                System.out.println("Edad inválida. Por favor ingrese una edad válida.");
                return;
            }

            double descuento = 0.0;
            String tipoDescuento = "";

            if (edad < 5) {
                descuento = 0.6; // 60% de descuento
                tipoDescuento = "60% (niños menores de 5 años)";
            } else if (edad > 60) {
                descuento = 0.55; // 55% de descuento
                tipoDescuento = "55% (personas mayores de 60 años)";
            } else {
                // Solo preguntar por cantidad de boletos si no tiene descuento por edad
                System.out.print("Ingrese la cantidad de boletos que desea comprar: ");
                if (scanner.hasNextInt()) {
                    int cantidadBoletos = scanner.nextInt();

                    if (cantidadBoletos < 1) {
                        System.out.println("Cantidad inválida. Debe comprar al menos 1 boleto.");
                        return;
                    }

                    if (cantidadBoletos >= 2) {
                        descuento = 0.3; // 30% de descuento
                        tipoDescuento = "30% (por compra de 2 o más boletos)";
                    }
                } else {
                    System.out.println("Entrada inválida. Debe ingresar un número entero.");
                    return;
                }
            }

            double precioFinal = PRECIO_NORMAL * (1 - descuento);

            System.out.println("\nDetalle de la compra:");
            if (descuento > 0) {
                System.out.println("Descuento aplicado: " + tipoDescuento);
                System.out.printf("Precio original: %.2f$\n", PRECIO_NORMAL);
                System.out.printf("Precio con descuento: %.2f$\n", precioFinal);
            } else {
                System.out.println("No se aplicaron descuentos");
                System.out.printf("Precio del boleto: %.2f$\n", PRECIO_NORMAL);
            }

        } else {
            System.out.println("Entrada inválida. Debe ingresar un número entero.");
        }

        scanner.close();
    }
}