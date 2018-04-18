/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author Diogo Pessoa
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

}
