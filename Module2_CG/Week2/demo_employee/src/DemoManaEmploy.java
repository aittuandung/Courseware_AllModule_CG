public class DemoManaEmploy {
    private int id ;
    private String name;
    private int tuoi;
    private int sobuoi;

    private int heso;

    public DemoManaEmploy(int id, String name, int age, String address){
    }

    public DemoManaEmploy(int id, String name, int tuoi, int sobuoi, int heso) {
        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
        this.sobuoi = sobuoi;
        this.heso = heso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getSobuoi() {
        return sobuoi;
    }

    public void setSobuoi(int sobuoi) {
        this.sobuoi = sobuoi;
    }

    public int getHeso() {
        return heso;
    }

    public void setHeso(int heso) {
        this.heso = heso;
    }

    public double partTime(){
        return getSobuoi()*200.000;
    }

    public double fullTIme(){
        return getHeso() * 30 * 500.000;
    }
}
