public class Lernender extends Person{
    private int lehrjahr;

    public Lernender(String name, String vorname, int personalnummer, int lehrjahr){
        super(name, vorname, personalnummer);
        this.lehrjahr = lehrjahr;
    }

    @Override
    public int berrechneFerien(int alter) {
        return 5;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Lehrjahr: " + this.lehrjahr);
    }
}
