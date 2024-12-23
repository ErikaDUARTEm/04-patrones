package org.example.tienda;

public class Ajuste extends PrendaDecorator{
  public Ajuste(IPrenda prenda) {
    super(prenda);
  }

  @Override
  public String getDescription() {
    return prenda.getDescription() + "+ ajustes";
  }

  @Override
  public Double getPrice() {
    return prenda.getPrice() + 5.0;
  }

  @Override
  public String getMaterial() {
    return prenda.getMaterial() + ", Sintetico";
  }
  @Override
  public String getColor() {
    return prenda.getColor() + "y aquamarine";
  }
}
