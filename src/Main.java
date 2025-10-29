public class Main {
    public static void main(String[] args) {
        String nombreCliente = JOptionPane.showInputDialog("Escribe el nombre del cliente:");
        List<Producto> productos = new ArrayList<>();

        while (true) {
            String nombreProducto = JOptionPane.showInputDialog("Escribe el nombre del producto:");
            if (nombreProducto == null || nombreProducto.isEmpty()) {
                break;
            }

            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad de " + nombreProducto + ":"));
            double precioUnitario = Double.parseDouble(JOptionPane.showInputDialog("Escribe el precio unitario de " + nombreProducto + ":"));

            String[] opcionesIVA = {"21%", "10%", "4%"};
            int opcionIVA = JOptionPane.showOptionDialog(null, "Seleccione el tipo de IVA:", "IVA",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcionesIVA, opcionesIVA[0]);

            double iva = 0.21;
            if (opcionIVA == 1) iva = 0.10;
            else if (opcionIVA == 2) iva = 0.04;

            productos.add(new Producto(nombreProducto, cantidad, precioUnitario, iva));
        }
    }
    public static void f1(){
        System.out.println("Hola mundo");
    }
    public static void f1(){
        System.out.println("Hola mundo");
    }
<<<<<<< HEAD
    public static void f1(){
        System.out.println("Dime tu nombre");
    }
=======
    StringBuilder factura = new StringBuilder();
        factura.append("Factura de ").append(nombreCliente).append("\n\n");
        factura.append(String.format("%-15s %-10s %-10s %-10s %-10s\n", "Producto", "Cantidad", "Precio", "IVA", "Total"));

    double totalFactura = 0;

        for (Producto p : productos) {
        factura.append(String.format("%-15s %-10d %-10.2f %-10.2f %-10.2f\n",
                p.nombre, p.cantidad, p.precioUnitario, p.calcularIVA(), p.calcularTotal()));
        totalFactura += p.calcularTotal();
    }

        factura.append("\nTotal a pagar: ").append(String.format("%.2f €", totalFactura));

        JOptionPane.showMessageDialog(null, factura.toString(), "Factura", JOptionPane.INFORMATION_MESSAGE);
}
public class A {
     System.out.println("Hola mundo");
}
>>>>>>> 19ef95843e1e9f3f27ea6ad3436a60302db1db01
}