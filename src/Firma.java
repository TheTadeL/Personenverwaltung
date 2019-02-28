import java.util.ArrayList;
import java.util.List;

public class Firma {
    private Person[] mitarbeiter;

    public Firma(Person[] mitarbeiter){
        this.mitarbeiter = mitarbeiter;
    }

    public Person[] getMitarbeiter() {
        return mitarbeiter;
    }
}
