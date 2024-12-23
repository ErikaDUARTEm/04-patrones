package org.example.tienda;

public class PrendaBasica implements IPrenda{
  @Override
  public String getDescription() {
    return "Prenda básica";
  }

  @Override
  public Double getPrice() {
    return 25.0;
  }

  @Override
  public String getMaterial() {
    return "Piel de durazno";
  }

  @Override
  public String getColor() {
    return "Morado";
  }
}
