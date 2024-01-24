package org.example.modeles;

public class ModelesQPIGS {
    private String tensionReseaux, tensionSortie,tensionBUS, tensionBatterie, tensionEntree1, tensionBatterieSCC1;
    private String frequenceReseaux, frequenceSortie;
    private String puissanceApparenteSortie, puissanceActiveSortie, puissanceCharge1;
    private int pourcentageChargeSortie;
    private String courantChargeBatterie, courantEntree1, courantDechargeBatterie;
    private int capaciteBatterie;
    private String temperatureDissipateurThermiqueOnduleur;
    private byte etatAppareil;
    private String decalageTensionBatterieVentilateursAllumes;
    private String versionEEPROM;


    public String getTensionReseaux() {
        return tensionReseaux;
    }

    public void setTensionReseaux(String tensionReseaux) {
        this.tensionReseaux = tensionReseaux;
    }

    public String getTensionSortie() {
        return tensionSortie;
    }

    public void setTensionSortie(String tensionSortie) {
        this.tensionSortie = tensionSortie;
    }

    public String getTensionBUS() {
        return tensionBUS;
    }

    public void setTensionBUS(String tensionBUS) {
        this.tensionBUS = tensionBUS;
    }

    public String getTensionBatterie() {
        return tensionBatterie;
    }

    public void setTensionBatterie(String tensionBatterie) {
        this.tensionBatterie = tensionBatterie;
    }

    public String getTensionEntree1() {
        return tensionEntree1;
    }

    public void setTensionEntree1(String tensionEntree1) {
        this.tensionEntree1 = tensionEntree1;
    }

    public String getTensionBatterieSCC1() {
        return tensionBatterieSCC1;
    }

    public void setTensionBatterieSCC1(String tensionBatterieSCC1) {
        this.tensionBatterieSCC1 = tensionBatterieSCC1;
    }

    public String getFrequenceReseaux() {
        return frequenceReseaux;
    }

    public void setFrequenceReseaux(String frequenceReseaux) {
        this.frequenceReseaux = frequenceReseaux;
    }

    public String getFrequenceSortie() {
        return frequenceSortie;
    }

    public void setFrequenceSortie(String frequenceSortie) {
        this.frequenceSortie = frequenceSortie;
    }

    public String getPuissanceApparenteSortie() {
        return puissanceApparenteSortie;
    }

    public void setPuissanceApparenteSortie(String puissanceApparenteSortie) {
        this.puissanceApparenteSortie = puissanceApparenteSortie;
    }

    public String getPuissanceActiveSortie() {
        return puissanceActiveSortie;
    }

    public void setPuissanceActiveSortie(String puissanceActiveSortie) {
        this.puissanceActiveSortie = puissanceActiveSortie;
    }

    public String getPuissanceCharge1() {
        return puissanceCharge1;
    }

    public void setPuissanceCharge1(String puissanceCharge1) {
        this.puissanceCharge1 = puissanceCharge1;
    }

    public int getPourcentageChargeSortie() {
        return pourcentageChargeSortie;
    }

    public void setPourcentageChargeSortie(int pourcentageChargeSortie) {
        this.pourcentageChargeSortie = pourcentageChargeSortie;
    }

    public String getCourantChargeBatterie() {
        return courantChargeBatterie;
    }

    public void setCourantChargeBatterie(String courantChargeBatterie) {
        this.courantChargeBatterie = courantChargeBatterie;
    }

    public String getCourantEntree1() {
        return courantEntree1;
    }

    public void setCourantEntree1(String courantEntree1) {
        this.courantEntree1 = courantEntree1;
    }

    public String getCourantDechargeBatterie() {
        return courantDechargeBatterie;
    }

    public void setCourantDechargeBatterie(String courantDechargeBatterie) {
        this.courantDechargeBatterie = courantDechargeBatterie;
    }

    public int getCapaciteBatterie() {
        return capaciteBatterie;
    }

    public void setCapaciteBatterie(int capaciteBatterie) {
        this.capaciteBatterie = capaciteBatterie;
    }

    public String getTemperatureDissipateurThermiqueOnduleur() {
        return temperatureDissipateurThermiqueOnduleur;
    }

    public void setTemperatureDissipateurThermiqueOnduleur(String temperatureDissipateurThermiqueOnduleur) {
        this.temperatureDissipateurThermiqueOnduleur = temperatureDissipateurThermiqueOnduleur;
    }

    public byte getEtatAppareil() {
        return etatAppareil;
    }

    public void setEtatAppareil(byte etatAppareil) {
        this.etatAppareil = etatAppareil;
    }

    public String getDecalageTensionBatterieVentilateursAllumes() {
        return decalageTensionBatterieVentilateursAllumes;
    }

    public void setDecalageTensionBatterieVentilateursAllumes(String decalageTensionBatterieVentilateursAllumes) {
        this.decalageTensionBatterieVentilateursAllumes = decalageTensionBatterieVentilateursAllumes;
    }

    public String getVersionEEPROM() {
        return versionEEPROM;
    }

    public void setVersionEEPROM(String versionEEPROM) {
        this.versionEEPROM = versionEEPROM;
    }
}
