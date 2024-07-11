package org.example;

public class Vehiculos {
    public String placa;
    public String marca;
    public int cilindraje;
    public String tipoCombustible;
    public String color;
    public String propietario;

    public Vehiculos() {}

    public Vehiculos(String placa, String marca, int cilindraje, String tipoCombustible, String color, String propietario) {
        this.placa = placa;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.tipoCombustible = tipoCombustible;
        this.color = color;
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
