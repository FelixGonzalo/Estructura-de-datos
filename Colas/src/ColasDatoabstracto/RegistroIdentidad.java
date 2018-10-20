package ColasDatoabstracto;

public class RegistroIdentidad {

    private int numDNI;
    private String surname, name, addressHouse, fechaBorn, sexo;

    public RegistroIdentidad(int numDNI, String surname, String name, String addressHouse, String fechaBorn, String sexo) {
        this.numDNI = numDNI;
        this.surname = surname;
        this.name = name;
        this.addressHouse = addressHouse;
        this.fechaBorn = fechaBorn;
        this.sexo = sexo;

    }

    public RegistroIdentidad() {

    }

    public int getNumDNI() {
        return numDNI;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getAddressHouse() {
        return addressHouse;
    }

    public String getFechaBorn() {
        return fechaBorn;
    }

    public String getSexo() {
        return sexo;
    }

}
