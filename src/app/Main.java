package app;

import model.Direccion;
import model.GuiaTuristico;

public class Main {

    public static void main(String[] args) {

        Direccion d1 = new Direccion(
                "Av. Los Volcanes",
                120,
                "Llanquihue");

        Direccion d2 = new Direccion(
                "Calle Lago Todos Los Santos",
                45,
                "Puerto Varas");

        Direccion d3 = new Direccion(
                "Ruta 5 Sur",
                300,
                "Frutillar");

        GuiaTuristico guia1 = new GuiaTuristico(
                "11.111.111-1",
                "Juan Pérez",
                "987654321",
                d1,
                "Turismo Cultural",
                8);

        GuiaTuristico guia2 = new GuiaTuristico(
                "22.222.222-2",
                "María González",
                "912345678",
                d2,
                "Rutas Gastronómicas",
                5);

        GuiaTuristico guia3 = new GuiaTuristico(
                "33.333.333-3",
                "Pedro Soto",
                "998877665",
                d3,
                "Excursiones Lacustres",
                10);

        System.out.println("=== GUÍA 1 ===");
        System.out.println(guia1);

        System.out.println("\n=== GUÍA 2 ===");
        System.out.println(guia2);

        System.out.println("\n=== GUÍA 3 ===");
        System.out.println(guia3);
    }
}
