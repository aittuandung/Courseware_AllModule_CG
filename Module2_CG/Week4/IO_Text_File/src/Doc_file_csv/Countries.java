package Doc_file_csv;

public class Countries {
    private int number ;
    private String ID;
    private String country;

    public Countries() {
    }

    public Countries(int number, String ID, String country) {
        this.number = number;
        this.ID = ID;
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return   number +
                ", " + ID  +
                ", " + country;
    }
}
