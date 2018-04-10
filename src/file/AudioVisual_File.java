package file;

import domain.AudioVisual;
import domain.Books;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//Creacion de la clase que maneja los archivos serializables del audioVisual
public class AudioVisual_File {

    //Metodo que escribe los objetos serializados en el archivo .dat
    public String writeAudioVisual(AudioVisual audiovisual, boolean editable) {
        String message = "";
        File fl = new File("AudioVisual.dat");
        try {

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fl, editable));

            oos.writeObject(audiovisual);
            message = "El AudioVisual " + audiovisual.getCode() + " fue agregado";
        } //Final del Try
        catch (Exception ex) {
            message = "No se pudo agregar el AudioVisual";
        } // Final del Catch
        return message;
    } // Fin del metodo WriteAudioVisual

    //Retorna un arreglo de AudioVisuales, lee el archivo
    public ArrayList getArrayAudioVisual() throws FileNotFoundException {

        ArrayList<AudioVisual> arrayAudioVisual = new ArrayList<AudioVisual>();

        File fl = new File("AudioVisual.dat");
        Object ob = new Object();
        ObjectInputStream ois;
        FileInputStream fis = new FileInputStream(fl);
        try {

            //For que recorre todo el archivo hasta el final
            for (;;) {
                ois = new ObjectInputStream(fis);
                ob = (AudioVisual) ois.readObject();
                if (ob instanceof AudioVisual) {
                    arrayAudioVisual.add((AudioVisual) ob);
                }

            }// Final del For
        } // Final del try
        catch (Exception ex) {
            System.out.println("End of the file");
        } // final del catch
        return arrayAudioVisual;
    }//Final del Metodo getArrayAudioVisual

    //Crea el codigo de los audiovisuales
    public String getAudiVisualCode(String name) {
        String code = "";
        name = name.toUpperCase();
        int firtsChart = name.charAt(0);
        int count = 0;
        ArrayList<AudioVisual> arrayAudioVisual = new ArrayList<AudioVisual>();
        for (int i = 0; i < arrayAudioVisual.size(); i++) {
            if (arrayAudioVisual.get(i).getName().equals(name)) {
                count++;
            }
        }
        code += (name.charAt(0) + name.charAt(1)) % 100;
        if (count < 10) {
            code += "00";
        }
        if (count >= 10 && count < 100) {
            code += "0";
        }
        code += count + "";
        System.out.println(count);
        return code;
    }//end of method

} // Final de la clase
