package org.example.modeles;

public class ModelesQPIRI {

    private String tensionNominaleReseau, tensionNominaleSortie, tensionNominaleBatterie, tensionRechargeBatterie, tensionApparenteBatterie, tensionFlottanteBatterie;
    private String courantNominalReseau, courantNominalSortie, courantChargeACmax, courantChargeMax;
    private String frequenceNominaleSortie;
    private String puissanceApparenteNominaleSortie, puissanceNominaleSortie_puissanceActive;
    private String batterieSousTension;
    private String typeBatterie, typeMachine;
    private String plageTensionEntree;
    private String prioriteSourceSortie, prioriteSourceChargeur;
    private String nombreMaxParallele;
    private String topologie;
    private String modeSortie;
    private String tensionDechargeBatterie;
    private String conditionOKParallele;
    private String BilanPuissancePhotovoltaique;

    public String getTensionNominaleReseau() {
        return tensionNominaleReseau;
    }

    public void setTensionNominaleReseau(String tensionNominaleReseau) {
        this.tensionNominaleReseau = tensionNominaleReseau;
    }

    public String getTensionNominaleSortie() {
        return tensionNominaleSortie;
    }

    public void setTensionNominaleSortie(String tensionNominaleSortie) {
        this.tensionNominaleSortie = tensionNominaleSortie;
    }

    public String getTensionNominaleBatterie() {
        return tensionNominaleBatterie;
    }

    public void setTensionNominaleBatterie(String tensionNominaleBatterie) {
        this.tensionNominaleBatterie = tensionNominaleBatterie;
    }

    public String getTensionRechargeBatterie() {
        return tensionRechargeBatterie;
    }

    public void setTensionRechargeBatterie(String tensionRechargeBatterie) {
        this.tensionRechargeBatterie = tensionRechargeBatterie;
    }

    public String getTensionApparenteBatterie() {
        return tensionApparenteBatterie;
    }

    public void setTensionApparenteBatterie(String tensionApparenteBatterie) {
        this.tensionApparenteBatterie = tensionApparenteBatterie;
    }

    public String getTensionFlottanteBatterie() {
        return tensionFlottanteBatterie;
    }

    public void setTensionFlottanteBatterie(String tensionFlottanteBatterie) {
        this.tensionFlottanteBatterie = tensionFlottanteBatterie;
    }

    public String getCourantNominalReseau() {
        return courantNominalReseau;
    }

    public void setCourantNominalReseau(String courantNominalReseau) {
        this.courantNominalReseau = courantNominalReseau;
    }

    public String getCourantNominalSortie() {
        return courantNominalSortie;
    }

    public void setCourantNominalSortie(String courantNominalSortie) {
        this.courantNominalSortie = courantNominalSortie;
    }

    public String getCourantChargeACmax() {
        return courantChargeACmax;
    }

    public void setCourantChargeACmax(String courantChargeACmax) {
        this.courantChargeACmax = courantChargeACmax;
    }

    public String getCourantChargeMax() {
        return courantChargeMax;
    }

    public void setCourantChargeMax(String courantChargeMax) {
        this.courantChargeMax = courantChargeMax;
    }

    public String getFrequenceNominaleSortie() {
        return frequenceNominaleSortie;
    }

    public void setFrequenceNominaleSortie(String frequenceNominaleSortie) {
        this.frequenceNominaleSortie = frequenceNominaleSortie;
    }

    public String getPuissanceApparenteNominaleSortie() {
        return puissanceApparenteNominaleSortie;
    }

    public void setPuissanceApparenteNominaleSortie(String puissanceApparenteNominaleSortie) {
        this.puissanceApparenteNominaleSortie = puissanceApparenteNominaleSortie;
    }

    public String getPuissanceNominaleSortie_puissanceActive() {
        return puissanceNominaleSortie_puissanceActive;
    }

    public void setPuissanceNominaleSortie_puissanceActive(String puissanceNominaleSortie_puissanceActive) {
        this.puissanceNominaleSortie_puissanceActive = puissanceNominaleSortie_puissanceActive;
    }

    public String getBatterieSousTension() {
        return batterieSousTension;
    }

    public void setBatterieSousTension(String batterieSousTension) {
        this.batterieSousTension = batterieSousTension;
    }

    public String getTypeBatterie() {
        return typeBatterie;
    }

    public void setTypeBatterie(String typeBatterie) {
        this.typeBatterie = typeBatterie;
    }

    public String getTypeMachine() {
        return typeMachine;
    }

    public void setTypeMachine(String typeMachine) {
        this.typeMachine = typeMachine;
    }

    public String getPlageTensionEntree() {
        return plageTensionEntree;
    }

    public void setPlageTensionEntree(String plageTensionEntree) {
        this.plageTensionEntree = plageTensionEntree;
    }

    public String getPrioriteSourceSortie() {
        return prioriteSourceSortie;
    }

    public void setPrioriteSourceSortie(String prioriteSourceSortie) {
        this.prioriteSourceSortie = prioriteSourceSortie;
    }

    public String getPrioriteSourceChargeur() {
        return prioriteSourceChargeur;
    }

    public void setPrioriteSourceChargeur(String prioriteSourceChargeur) {
        this.prioriteSourceChargeur = prioriteSourceChargeur;
    }

    public String getNombreMaxParallele() {
        return nombreMaxParallele;
    }

    public void setNombreMaxParallele(String nombreMaxParallele) {
        this.nombreMaxParallele = nombreMaxParallele;
    }

    public String getTopologie() {
        return topologie;
    }

    public void setTopologie(String topologie) {
        this.topologie = topologie;
    }

    public String getModeSortie() {
        return modeSortie;
    }

    public void setModeSortie(String modeSortie) {
        this.modeSortie = modeSortie;
    }

    public String getTensionDechargeBatterie() {
        return tensionDechargeBatterie;
    }

    public void setTensionDechargeBatterie(String tensionDechargeBatterie) {
        this.tensionDechargeBatterie = tensionDechargeBatterie;
    }

    public String getConditionOKParallele() {
        return conditionOKParallele;
    }

    public void setConditionOKParallele(String conditionOKParallele) {
        this.conditionOKParallele = conditionOKParallele;
    }

    public String getBilanPuissancePhotovoltaique() {
        return BilanPuissancePhotovoltaique;
    }

    public void setBilanPuissancePhotovoltaique(String bilanPuissancePhotovoltaique) {
        BilanPuissancePhotovoltaique = bilanPuissancePhotovoltaique;
    }
}
