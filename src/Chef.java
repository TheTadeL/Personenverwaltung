public class Chef extends Person{
    private String abteilung;

    public Chef(String name, String vorname, int personalnummer, String abteilung){
        super(name, vorname, personalnummer);
        this.abteilung = abteilung;
    }

    @Override
    public int berrechneFerien(int alter) {
        if(alter >= 55){
            return 6;
        } else if(alter >= 45){
            return 5;
        } else {
            return 4;
        }
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Abteilung: " + this.abteilung);
    }
}
