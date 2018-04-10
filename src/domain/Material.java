package domain;

import java.io.Serializable;

//Creacion de la clase Material e inmplementa el serializable
public class Material implements Serializable {

    //Los atributos de la clase
    private String name;
    private String code;
    private String year;

    //Constructores de la clase
    public Material() {
        this.name = "";
        this.code = "";
        this.year = "";
    }

    public Material(String name, String code, String year) {
        this.name = name;
        this.code = code;
        this.year = year;
    }

    //Accesores de los atributos de la clase
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the quantity
     */
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "Material{" + "name=" + name + ", code=" + code + ", year=" + year + '}';
    }

}
