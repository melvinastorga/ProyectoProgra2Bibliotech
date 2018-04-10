package domain;

import java.io.Serializable;

//Creacion de la clase AudioVisual que hereda de Material e implementa el serializable
public class AudioVisual extends Material implements Serializable {

    //Creacion de los atributos
    private String brand;
    private String funtion;

    //Creacion de los constructores
    public AudioVisual() {
        super();
        this.brand = "";
        this.funtion = "";
    }

    public AudioVisual(String brand, String funtion, String name, String code, String year) {
        super(name, code, year);
        this.brand = brand;
        this.funtion = funtion;
    }

    //Creacion de los accesores
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuntion() {
        return funtion;
    }

    public void setFuntion(String funtion) {
        this.funtion = funtion;
    }

    //creacion del toString
    @Override
    public String toString() {
        return "AudioVisualMaterial{" + "brand=" + brand + ", funtion=" + funtion + '}';
    }

}
