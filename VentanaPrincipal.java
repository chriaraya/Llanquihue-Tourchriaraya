public class VentanaPrincipal {
    private GestorEntidades gestor = new GestorEntidades();

    public void iniciar() {
        String nombre = JOptionPane.showInputDialog("Ingrese Nombre del Guía:");
        String rut = JOptionPane.showInputDialog("Ingrese RUT:");
        String esp = JOptionPane.showInputDialog("Especialidad:");
        GuiaTuristico nuevoGuia = new GuiaTuristico(nombre, rut, esp);
        gestor.agregar(nuevoGuia);
        JOptionPane.showMessageDialog(null, "Guía registrado exitosamente.");
        gestor.procesarEntidades();
    }
}
