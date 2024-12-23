package org.example;

import org.example.tienda.Ajuste;
import org.example.tienda.Bordado;
import org.example.tienda.IPrenda;
import org.example.tienda.PrendaBasica;

public class Main {
  public static void main(String[] args) {

    IPrenda prenda = new PrendaBasica();
    System.out.println(prenda.getDescription() + ": $" + prenda.getPrice());
    System.out.println("Material: " + prenda.getMaterial() + ", Color: " + prenda.getColor());

    prenda = new Bordado(prenda);
    System.out.println("-------------------------------------------------");
    System.out.println(prenda.getDescription() + ": $" + prenda.getPrice());
    System.out.println("Material: " + prenda.getMaterial() + ", Color: " + prenda.getColor());
    System.out.println("-------------------------------------------------");

    prenda = new Ajuste(prenda);
    System.out.println(prenda.getDescription() + ": $" + prenda.getPrice());
    System.out.println("Material: " + prenda.getMaterial() + ", Color: " + prenda.getColor());
  }
}