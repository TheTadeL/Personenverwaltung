public abstract class Person {
    private String name;
    private String vorname;
    private int personalnummer;

    public Person(String name, String vorname, int personalnummer){
        this.name = name;
        this.vorname = vorname;
        this.personalnummer = personalnummer;
    }

    public abstract int berrechneFerien(int alter);

    public void print(){
        System.out.println("\nName: " + this.name + " " + this.vorname);
        System.out.println("Personalnummer: " + this.personalnummer);
    }
}
