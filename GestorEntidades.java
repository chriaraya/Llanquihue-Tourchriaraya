public class GestorEntidades {
    private List<Registrable> entidades = new ArrayList<>();

    public void agregar(Registrable r) {
        entidades.add(r);
    }

    public void procesarEntidades() {
        for (Registrable r : entidades) {
            r.mostrarResumen();
            if (r instanceof GuiaTuristico) {
                System.out.println(" [Aviso: Asignar bono a guía]");
            }
        }
    }
}
