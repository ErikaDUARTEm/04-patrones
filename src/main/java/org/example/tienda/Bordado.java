package org.example.tienda;

public class Bordado extends PrendaDecorator{
  public Bordado(IPrenda prenda) {
    super(prenda);
  }

  @Override
  public String getDescription() {
    return prenda.getDescription()  + " + Bordado de mariposas";
  }
  @Override
  public Double getPrice() {
    return prenda.getPrice() + 10.0;
  }
  @Override
  public String getMaterial() {
    return prenda.getMaterial() + ", Bordado de seda";
  }
  @Override
  public String getColor() {
    return prenda.getColor() + "y Fucsia";
  }
}
