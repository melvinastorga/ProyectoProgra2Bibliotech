package domain;

public class Loan {

    private String studentCode;
    private String materialCode;
    private String record;
    private String deliveryDate;
    private String returnDate;
    private String pending;
    private int fine;

    public Loan() {
        studentCode = "";
        materialCode = "";
        record = "";
        deliveryDate = "";
        returnDate = "";
        pending = "";
        fine = 0;
    }

    public Loan(String studentCode, String materialCode, String record, String deliveryDate, String returnDate, String pending, int fine) {
        this.studentCode = studentCode;
        this.materialCode = materialCode;
        this.record = record;
        this.deliveryDate = deliveryDate;
        this.returnDate = returnDate;
        this.pending = pending;
        this.fine = fine;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getPending() {
        return pending;
    }

    public void setPending(String pending) {
        this.pending = pending;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    @Override
    public String toString() {
        return "Loan{" + "studentCode=" + studentCode + ", materialCode=" + materialCode + ", record=" + record + ", deliveryDate=" + deliveryDate + ", returnDate=" + returnDate + ", pending=" + pending + ", fine=" + fine + '}';
    }

    //Devuelve el tamano en bytes del cada registro del archivo
    public int sizeInBytes() {
        return 4 + this.studentCode.length() * 2
                + this.materialCode.length() * 2
                + this.record.length() * 2
                + this.returnDate.length() * 2
                + this.deliveryDate.length() * 2
                + this.pending.length() * 2;
    }

}
