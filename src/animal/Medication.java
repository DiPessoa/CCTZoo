package animal;

/**
 * Class of a Medication object where is possible find all variables and methods
 * about medication
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 */
public class Medication {

    final private String medicationDate;
    final private String medicationDrug;
    final private String medicationComments;

    /**
     * Constructor Method
     *
     * @param date - String - Medication`s name
     * @param drug - String - Administration date
     * @param comments - String - Comments
     *
     */
    public Medication(String date, String drug, String comments) {
        this.medicationDate = date;
        this.medicationDrug = drug;
        this.medicationComments = comments;
    }

    /**
     * Method returns administration date
     *
     * @return medicationDate String
     */
    public String getMedicationDate() {
        return medicationDate;
    }

    /**
     * Method returns medications name
     *
     * @return medicationDate String
     */
    public String getMedicationDrug() {
        return medicationDrug;
    }

    /**
     * Method returns comments
     *
     * @return medicationComments String
     */
    public String getMedicationComments() {
        return medicationComments;
    }

    /**
     * Method returns a String of an object
     *
     * @return String output
     */
    @Override
    public String toString() {
        String output;
        output = "\t Name: " + this.medicationDrug + "\n";
        output += "\t Date of administration: " + this.medicationDate + "\n";
        output += "\t Comments: " + this.medicationComments + "\n";
        return output;
    }
}
