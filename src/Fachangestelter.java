public class Fachangestelter extends Person {
    private Chef vorgesetzter;

    public Fachangestelter(String name, String vorname, int personalnummer, Chef vorgesetzter){
        super(name, vorname, personalnummer);
        this.vorgesetzter = vorgesetzter;
    }

    @Override
    public int berrechneFerien(int alter) {
        if(alter >= 60){
            return 6;
        } else if(alter >= 50){
            return 5;
        } else {
            return 4;
        }
    }

}
