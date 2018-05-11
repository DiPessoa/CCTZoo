package animal;

/**
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 */
public class Medication {

    final private String medicationDate;
    final private String medicationDrug;
    final private String medicationComments;

    public Medication(String date, String drug, String comments) {
        this.medicationDate = date;
        this.medicationDrug = drug;
        this.medicationComments = comments;
    }

    public String getMedicationDate() {
        return medicationDate;
    }

    public String getMedicationDrug() {
        return medicationDrug;
    }

    public String getMedicationComments() {
        return medicationComments;
    }

    @Override
    public String toString() {
        String output;
        output = "\t Name: " + this.medicationDrug + "\n";
        output += "\t Date of administration: " + this.medicationDate + "\n";
        output += "\t Comments: " + this.medicationComments + "\n";
        return output;
    }
}
