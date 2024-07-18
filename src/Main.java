import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int codMenuPpal;
        int platosProcesados = 0;
        int platosTipicos = 0;
        int platosALaCarta = 0;
        int platosInternacionales = 0;
        double valorTotal = 0;
        String factura = "";

        String nombreUsuario = JOptionPane.showInputDialog("Ingrese su nombre:");

        do {
            String menu = "MENÚ RESTAURANTE\n\n";
            menu += "1. Plato Típico\n";
            menu += "2. Plato a la carta\n";
            menu += "3. Plato internacional\n";
            menu += "4. Salir\n\n";
            menu += "Por favor seleccione una opción: ";

            codMenuPpal = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Menú Principal", JOptionPane.PLAIN_MESSAGE));

            switch (codMenuPpal) {
                case 1:
                    int codMenuTipico;
                    do {
                        String menuTipico = "MENÚ TÍPICO\n\n";
                        menuTipico += "1. Frijoles ($12,000)\n";
                        menuTipico += "2. Sopa de Verduras ($8,000)\n";
                        menuTipico += "3. Regresar\n\n";
                        menuTipico += "Por favor seleccione una opción: ";

                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog(null, menuTipico, "Menú Típico", JOptionPane.PLAIN_MESSAGE));

                        switch (codMenuTipico) {
                            case 1:
                                platosProcesados++;
                                platosTipicos++;
                                valorTotal += 12000;
                                factura += "Frijoles: $12,000\n";
                                break;
                            case 2:
                                platosProcesados++;
                                platosTipicos++;
                                valorTotal += 8000;
                                factura += "Sopa de Verduras: $8,000\n";
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuTipico = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menú típico, de lo contrario regresará al menú principal "));
                        if (codMenuTipico != 1) {
                            codMenuTipico = 3;
                        }
                    } while (codMenuTipico != 3);
                    break;
                case 2:
                    int codMenuCarta;
                    do {
                        String menuCarta = "MENÚ A LA CARTA\n\n";
                        menuCarta += "1. Filete de Res ($20,000)\n";
                        menuCarta += "2. Pollo a la Plancha ($18,000)\n";
                        menuCarta += "3. Regresar\n\n";
                        menuCarta += "Por favor seleccione una opción: ";

                        codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog(null, menuCarta, "Menú A la Carta", JOptionPane.PLAIN_MESSAGE));

                        switch (codMenuCarta) {
                            case 1:
                                platosProcesados++;
                                platosALaCarta++;
                                valorTotal += 20000;
                                factura += "Filete de Res: $20,000\n";
                                break;
                            case 2:
                                platosProcesados++;
                                platosALaCarta++;
                                valorTotal += 18000;
                                factura += "Pollo a la Plancha: $18,000\n";
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuCarta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menú a la carta, de lo contrario regresará al menú principal "));
                        if (codMenuCarta != 1) {
                            codMenuCarta = 3;
                        }
                    } while (codMenuCarta != 3);
                    break;
                case 3:
                    int codMenuInternacional;
                    do {
                        String menuInternacional = "MENÚ INTERNACIONAL\n\n";
                        menuInternacional += "1. Pasta carbonara ($25,000)\n";
                        menuInternacional += "2. Tacos ($15,000)\n";
                        menuInternacional += "3. Regresar\n\n";
                        menuInternacional += "Por favor seleccione una opción: ";

                        codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog(null, menuInternacional, "Menú Internacional", JOptionPane.PLAIN_MESSAGE));

                        switch (codMenuInternacional) {
                            case 1:
                                platosProcesados++;
                                platosInternacionales++;
                                valorTotal += 25000;
                                factura += "Pasta Carbonara: $25,000\n";
                                break;
                            case 2:
                                platosProcesados++;
                                platosInternacionales++;
                                valorTotal += 15000;
                                factura += "Tacos: $15,000\n";
                                break;
                            case 3:
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuInternacional = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir el menú internacional, de lo contrario regresará al menú principal "));
                        if (codMenuInternacional != 1) {
                            codMenuInternacional = 3;
                        }
                    } while (codMenuInternacional != 3);
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un código válido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } while (codMenuPpal != 4);

        // Impresion de factura
        String facturaCompleta = "Factura\n\n";
        facturaCompleta += "Nombre del usuario: " + nombreUsuario + "\n";
        facturaCompleta += "Platos procesados: " + platosProcesados + "\n";
        facturaCompleta += "Platos típicos: " + platosTipicos + "\n";
        facturaCompleta += "Platos a la carta: " + platosALaCarta + "\n";
        facturaCompleta += "Platos internacionales: " + platosInternacionales + "\n";
        facturaCompleta += "Valor total a pagar: $" + valorTotal + "\n";
        facturaCompleta += "\nDetalle de la orden:\n" + factura;

        JOptionPane.showMessageDialog(null, facturaCompleta, "Factura", JOptionPane.PLAIN_MESSAGE);

    }
}