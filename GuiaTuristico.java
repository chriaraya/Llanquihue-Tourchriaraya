package model;
public class GuiaTuristico extends Persona {
    private String especialidad;
    public GuiaTuristico(String nombre, String rut, String especialidad) {
        super(nombre, rut);
        this.especialidad = especialidad;
    }
    @Override
    public void mostrarResumen() {
        System.out.println("-> Guía: " + getNombre() + " | Especialidad: " + especialidad);
    }
}