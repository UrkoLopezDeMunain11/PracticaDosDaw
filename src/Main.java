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
}