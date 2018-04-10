package file;

import domain.Loan;
import domain.Student;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Loan_File {

    //atributos
    public RandomAccessFile randomAccessFile;
    private int regsQuantity;//cantidad de registros en el archivo
    private int regSize;//tamanno del registro
    private String myFilePath;//ruta

    //constructor
    public Loan_File(File file) throws IOException {
        //almaceno la ruta
        myFilePath = file.getPath();

        //indico el tamanno maximo
        this.regSize = 150;

        //validacion 
        if (file.exists() && !file.isFile()) {
            throw new IOException(file.getName() + " is an invalid file");
        } else {
            //crear la nueva instancia de RAF
            randomAccessFile = new RandomAccessFile(file, "rw");

            //necesitamos indicar cuantos registros tiene el archivo
            this.regsQuantity = (int) Math.ceil((double) randomAccessFile.length() / (double) regSize);
        }
    }//end method

    //Cierra el archivo
    public void close() throws IOException {
        randomAccessFile.close();

    }

    //indicar la cantidad de registros de nuestro archivo
    public int getFileSize() {
        return this.regsQuantity;
    }

    //insertar un nuevo registro en una posicion especifica
    public boolean putValue(int position, Loan loan) throws IOException {
        //primero: verificar que sea valida la insercion
        if (position < 0 && position > this.regsQuantity) {
            System.err.println("1001 - Record position is out of bounds");
            return false;
        } else {
            if (loan.sizeInBytes() > this.regSize) {
                System.err.println("1002 - Record size is out of bounds");
                return false;
            } else {
                randomAccessFile.seek(position * this.regSize);
                randomAccessFile.writeUTF(loan.getRecord());
                randomAccessFile.writeUTF(loan.getMaterialCode());
                randomAccessFile.writeUTF(loan.getStudentCode());
                randomAccessFile.writeUTF(loan.getDeliveryDate());
                randomAccessFile.writeUTF(loan.getReturnDate());
                randomAccessFile.writeUTF(loan.getPending());
                randomAccessFile.writeInt(loan.getFine());
                return true;
            }
        }
    }//end method

    //insertar al final del archivo
    public boolean addEndRecord(Loan loan) throws IOException {
        boolean success = putValue(this.regsQuantity, loan);
        if (success) {
            ++this.regsQuantity;
        }
        return success;
    }//end method

    //obtener un el prestamo
    public Loan getLoan(int position) throws IOException {
        //validar la posici'on
        if (position >= 0 && position <= this.regsQuantity) {
            //colocamos el brazo en el lugar adecuado
            randomAccessFile.seek(position * this.regSize);

            //llevamos a cabo la lectura
            Loan loanTemp = new Loan();
            loanTemp.setRecord(randomAccessFile.readUTF());
            loanTemp.setMaterialCode(randomAccessFile.readUTF());
            loanTemp.setStudentCode(randomAccessFile.readUTF());
            loanTemp.setDeliveryDate(randomAccessFile.readUTF());
            loanTemp.setReturnDate(randomAccessFile.readUTF());
            loanTemp.setPending(randomAccessFile.readUTF());
            loanTemp.setFine(randomAccessFile.readInt());

            if (loanTemp.getRecord().equalsIgnoreCase("deleted")) {
                return null;
            } else {
                return loanTemp;
            }
        } else {
            System.err.println("1003 - position is out of bounds");
            return null;
        }
    }//end method

    //Retorna el arrayLiast de todos los prestamos
    public ArrayList<Loan> getAllLoans() throws IOException {
        ArrayList<Loan> loanArray = new ArrayList<Loan>();

        for (int i = 0; i < this.regsQuantity; i++) {
            Loan lTemp = this.getLoan(i);

            if (lTemp != null) {
                loanArray.add(lTemp);
            }
        }//end for
        return loanArray;
    }

}
