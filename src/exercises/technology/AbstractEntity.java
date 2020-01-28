package exercises.technology;

public abstract class AbstractEntity {
    public int idNumber;
    public static int uniqueId = 100;

    public AbstractEntity() {
        idNumber = uniqueId;
        uniqueId++;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
