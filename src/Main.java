public class Main {

    public static void main(String[] args) {
        Person[] angestellte = new Person[3];
        angestellte[0] = new Chef("Müller", "Stefan", 20010911, "Finanzen");
        angestellte[1] = new Fachangestelter("Deftigen", "Anna", 19952108, (Chef)angestellte[0]);
        angestellte[2] = new Lernender("Rüfenacht", "Mateusz", 29749012, 2);

        Firma testFirma = new Firma(angestellte);

        for(Person p : testFirma.getMitarbeiter()){
            p.print();
            System.out.println("Ferien: " + p.berrechneFerien(56) + " Wochen");
        }
    }
}
