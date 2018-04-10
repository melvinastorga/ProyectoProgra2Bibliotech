package domain;

import java.io.Serializable;

//Creacion de la clase Books que hereda de Material e implementa el serializable
public class Books extends Material implements Serializable {

    //Creacion de los atributos
    private String author;
    private String editorial;
    private String Type;

    //creacion de los constructores de la clase
    public Books() {
        super();
        this.author = "";
        this.editorial = "";
        this.Type = "";
    }

    public Books(String author, String editorial, String name, String code, String year, String type) {
        super(name, code, year);
        this.author = author;
        this.editorial = editorial;
        this.Type = type;
    }

    //Creacion de los accesores
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    //Creacion del ToString
    @Override
    public String toString() {
        return "Books{" + "author=" + author + ", editorial=" + editorial + ", shape=" + Type + '}';
    }

//Crea el codigo de libros apartir de sus caracteristicas
    public String getBooksCode(String name, String autor, String editorial, String year, char digital) {
        try {
            name = name.toUpperCase();
            String code = name.charAt(0) + name.charAt(1) + "";
            autor = autor.toUpperCase();
            editorial = editorial.toLowerCase();
            code += autor.substring(0, 3) + editorial.substring(0, 2) + year.substring(2, 4) + digital;
            return code;
        } catch (StringIndexOutOfBoundsException siobe) {
            return null;
        }
    }

}
