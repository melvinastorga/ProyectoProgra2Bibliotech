package file;

import domain.Books;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Creacion de la clase que maneja los archivos serializados de Books
public class Books_File {

    //Escribe en archivo books 
    public String writeBooks(Books book, boolean editable) {
        String message = "";
        File fl = new File("Books.dat");
        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fl, editable));

            oos.writeObject(book);

            message = "El libro fue agregado";
        } //Final del Try
        catch (Exception ex) {
            message = "No se pudo agregar el libro";
        } // Final del Catch
        return message;
    } // Fin del metodo WriteBooks

    //Retorna un arreglo de libros
    public ArrayList getArrayBooks() throws FileNotFoundException {

        ArrayList<Books> arrayBook = new ArrayList<Books>();

        File fl = new File("Books.dat");
        Object ob = new Object();
        ObjectInputStream ois;
        FileInputStream fis = new FileInputStream(fl);
        try {
            //For que recorre el archivo hasta el final
            for (;;) {
                ois = new ObjectInputStream(fis);
                ob = (Books) ois.readObject();
                if (ob instanceof Books) {

                    arrayBook.add((Books) ob);

                }
            }// Final del For 
        }//Final del try
        catch (Exception ex) {

        }//Final del cath
        return arrayBook;
    }//Final del metodo getArrayBook

    //Muestra el arreglo de libros
    //Crea el codigo de libros apartir de sus caracteristicas
    public String getBooksCode(String name, String autor, String editorial, String year, char digital) {
        String code = "";
        try {

            name = name.toUpperCase();

            code = name.charAt(0) + name.charAt(1) + "";

            autor = autor.toUpperCase();

            editorial = editorial.toLowerCase();

            code += autor.substring(0, 3) + editorial.substring(0, 2) + year.substring(2, 4) + digital + "";

            return code;
        } catch (Exception siobe) {

            return "Error creating the code";
        }

    }

    //Cuenta cuantos libros hay
    public int getBooksQuantity(String code) throws FileNotFoundException {
        int counter = 0;
        ArrayList<Books> arrayBook = getArrayBooks();
        for (int i = 0; i < arrayBook.size(); i++) {
            if (arrayBook.get(i).getCode().equalsIgnoreCase(code)) {
                counter++;
            }
        }
        return counter;
    }//end method

    //pregunta si los nombres son iguales
    public boolean starsWith(String name, String nameToFind) {
        if (nameToFind.isEmpty() || nameToFind.length() > name.length()) {
            return false;
        }
        for (int i = 0; i < nameToFind.length(); i++) {
            if (name.charAt(i) != nameToFind.charAt(i)) {
                return false;
            }
        }
        return true;
    }//end method

} // Final de la clase

