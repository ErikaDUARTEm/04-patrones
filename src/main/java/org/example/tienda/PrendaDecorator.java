package org.example.tienda;

public abstract class PrendaDecorator implements IPrenda{
  protected IPrenda prenda;

  public PrendaDecorator(IPrenda prenda) {
    this.prenda = prenda;
  }

  @Override
  public String getDescription() {
    return "";
  }

  @Override
  public Double getPrice() {
    return 0.0;
  }

  @Override
  public String getMaterial() {
    return "";
  }

  @Override
  public String getColor() {
    return "";
  }
}
