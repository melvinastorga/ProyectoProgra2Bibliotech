package file;

import domain.Student;
import java.util.ArrayList;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;

public class Student_File {

    //atributos
    public RandomAccessFile randomAccessFile;
    private int regsQuantity;//cantidad de registros en el archivo
    private int regSize;//tamanno del registro
    private String myFilePath;//ruta

    //constructor
    public Student_File(File file) throws IOException {
        //almaceno la ruta
        myFilePath = file.getPath();

        //indico el tamanno maximo
        this.regSize = 150;

        //una validacion sencilla
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
    public int fileSize() {
        return this.regsQuantity;
    }

    //insertar un nuevo registro en una posicion especifica
    public boolean putValue(int position, Student student) throws IOException {
        //primero: verificar que sea v'alida la inserci'on
        if (position < 0 && position > this.regsQuantity) {
            System.err.println("1001 - Record position is out of bounds");
            return false;
        } else {
            if (student.sizeInBytes() > this.regSize) {
                System.err.println("1002 - Record size is out of bounds");
                return false;
            } else {

                randomAccessFile.seek(position * this.regSize);
                randomAccessFile.writeUTF(student.getName());
                randomAccessFile.writeUTF(student.getCode());
                randomAccessFile.writeUTF(student.getCareer());
                randomAccessFile.writeUTF(student.getYear());
                return true;
            }
        }
    }//end method

    //insertar al final del archivo
    public boolean addEndRecord(Student student) throws IOException {
        boolean success = putValue(this.regsQuantity, student);
        if (success) {
            ++this.regsQuantity;
        }
        return success;
    }

    //obtener un estudiante
    public Student getStudent(int position) throws IOException {
        //validar la posici'on
        if (position >= 0 && position <= this.regsQuantity) {
            //colocamos el brazo en el lugar adecuado
            randomAccessFile.seek(position * this.regSize);

            //llevamos a cabo la lectura
            Student studentTemp = new Student() {
            };
            studentTemp.setName(randomAccessFile.readUTF());
            studentTemp.setCode(randomAccessFile.readUTF());
            studentTemp.setCareer(randomAccessFile.readUTF());
            studentTemp.setYear(randomAccessFile.readUTF());

            if (studentTemp.getName().equalsIgnoreCase("deleted")) {
                return null;
            } else {
                return studentTemp;
            }
        } else {
            System.err.println("1003 - position is out of bounds");
            return null;
        }
    }//end method

    //eliminar un estudiante
    public boolean deleteStudent(String code) throws IOException {
        Student myStudent;

        //buscar el estudiante
        for (int i = 0; i < this.regsQuantity; i++) {
            //obtener el estudiante de la posici'on actual
            myStudent = this.getStudent(i);

            //preguntar si es el estudiante que deseo eliminar
            if (myStudent.getCode().equalsIgnoreCase(code)) {
                //marcar como eliminado
                myStudent.setName("deleted");

                return this.putValue(i, myStudent);
            }
        }
        return false;
    }

    //retornar una lista de estudiantes
    public ArrayList<Student> getAllStudents() throws IOException {
        ArrayList<Student> studentsArray = new ArrayList<Student>();

        for (int i = 0; i < this.regsQuantity; i++) {
            Student sTemp = this.getStudent(i);

            if (sTemp != null && !sTemp.getName().equalsIgnoreCase("deleted")) {
                studentsArray.add(sTemp);
            }
        }//end for
        return studentsArray;
    }

    //Crea el carnet del estudiante
    public String createsCode(String career, String year) {
        String code = career.charAt(0) + "";

        code += year.charAt(year.length() - 1);

        if (regsQuantity < 10) {
            code += "00";
        }

        if (regsQuantity < 100 && regsQuantity > 9) {
            code += "0";
        }

        code += regsQuantity;

        return code;
    }

    public ArrayList<Student> getComputingStudents(ArrayList<Student> student) throws IOException {
        ArrayList<Student> studentsComputingArray = new ArrayList<Student>();

        for (int i = 0; i < student.size(); i++) {
            Student sTemp = new Student(student.get(i).getName(), student.get(i).getCode(),
                    student.get(i).getCareer(), student.get(i).getYear()) {
            };

            if (sTemp.getCareer().equalsIgnoreCase("Computing")) {
                studentsComputingArray.add(sTemp);
            }
        }//end for
        return studentsComputingArray;
    }

    public ArrayList<Student> getEducationStudents(ArrayList<Student> student) throws IOException {
        ArrayList<Student> studentsEducationArray = new ArrayList<Student>();

        for (int i = 0; i < student.size(); i++) {
            Student sTemp = new Student(student.get(i).getName(), student.get(i).getCode(),
                    student.get(i).getCareer(), student.get(i).getYear()) {
            };

            if (sTemp.getCareer().equalsIgnoreCase("Education")) {
                studentsEducationArray.add(sTemp);
            }
        }//end for
        return studentsEducationArray;
    }

    public ArrayList<Student> getAgronomyStudents(ArrayList<Student> student) throws IOException {
        ArrayList<Student> studentsAgronomyArray = new ArrayList<Student>();

        for (int i = 0; i < student.size(); i++) {
            Student sTemp = new Student(student.get(i).getName(), student.get(i).getCode(),
                    student.get(i).getCareer(), student.get(i).getYear()) {
            };

            if (sTemp.getCareer().equalsIgnoreCase("Agronomy")) {
                studentsAgronomyArray.add(sTemp);
            }
        }//end for
        return studentsAgronomyArray;
    }

}
