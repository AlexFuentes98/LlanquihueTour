package model;

public class GuiaTuristico extends Persona {

    private String especialidad;
    private int aniosExperiencia;

    public GuiaTuristico(String rut,
                         String nombre,
                         String telefono,
                         Direccion direccion,
                         String especialidad,
                         int aniosExperiencia) {

        super(rut, nombre, telefono, direccion);

        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }
}

