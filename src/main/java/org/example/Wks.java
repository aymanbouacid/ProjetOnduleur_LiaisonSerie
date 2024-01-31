package org.example;

import jssc.SerialPortEvent;
import jssc.SerialPortException;
import org.apache.commons.lang3.ArrayUtils;
import org.example.modeles.ModelesQPIGS;
import org.example.modeles.ModelesQPIRI;
import org.example.modeles.ModelesQPIWS;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;




public class Wks extends LiaisonSerie {

    private final byte[] QPIGS = "QPIGS".getBytes(StandardCharsets.US_ASCII);
    private final byte[] QPIRI = "QPIRI".getBytes(StandardCharsets.US_ASCII);
    private final byte[] QPIWS = "QPIWS".getBytes(StandardCharsets.US_ASCII);
    private final byte START = 0x28;
    private final byte CR = 0x0d;
    ModelesQPIGS qpigs = new ModelesQPIGS();
    ModelesQPIRI qpiri = new ModelesQPIRI();
    ModelesQPIWS qpiws = new ModelesQPIWS();

    @Override
    public void serialEvent(SerialPortEvent event) {
        try {
            if (serialPort.getInputBufferBytesCount()==110) {
                Thread.sleep(500);
                byte[] trameBrute = super.lireTrame(110);
                String st_trameBrute= new String(trameBrute,StandardCharsets.US_ASCII);
                String dcp[]= st_trameBrute.split(" ");
                System.out.println(dcp.length);
                //System.out.println(dcp[0].replace("(", "")+" V" + " = Tension du reseau");
                //System.out.println(dcp[1]+" Hz" + " = Frequence du reseau");
                //System.out.println(dcp[2]+" V" + " = Tension de sortie (AC)");
                //System.out.println(dcp[3]+" Hz" + " = Frequence de sortie (AC)");
                //System.out.println(dcp[4]+" VA"+ " = Puissance apparente de sortie CA");
                //System.out.println(dcp[5]+" W"+ " = Puissance active de sortie CA");
                //System.out.println(dcp[6]+" %"+ " = Pourcentage de charge de sortie");
                //System.out.println(dcp[7]+" V"+ " = Tension BUS");
                //System.out.println(dcp[8]+" V"+ " = Tension de la batterie");
                //System.out.println(dcp[9]+" A"+ " = Courant de charge de la batterie");
                //System.out.println(dcp[10]+" %"+ " = Capacite de la batterie");
                //System.out.println(dcp[11]+" °C (degres)"+ " = Temperature du dissipateur thermique de l onduleur");
                //System.out.println(dcp[12]+" A"+ " = Courant entree 1 PV");
                //System.out.println(dcp[13]+" V"+ " = Tension entree 1 PV");
                //System.out.println(dcp[14]+" V"+ " = Tension de la batterie a partir de SCC 1");
                //System.out.println(dcp[15]+" A"+ " = Courant de décharge de la batterie");
//                System.out.print("Etat de l appareil : ");
//                System.out.println(dcp[16]);
//                System.out.print("si les 3 derniers chiffres sont 000 alors la batterie est out\n" +
//                        "si les 3 derniers chiffres sont 110 alors l appareil charge sur SCC1\n" +
//                        "si les 3 derniers chiffres sont 101 alors l appareil charge en courant alternatif \n" +
//                        "si les 3 derniers chiffres sont 111 alors l appareil charge avec SCC1 et charge sur CA\n");
                //System.out.println(dcp[16].toCharArray()[0] + " = ajout de la priorite SBU Version (oui:1 ; non:0)");
                //System.out.print("Etat de l appareil : ");
                //System.out.println(dcp[16].toCharArray()[1] + " = Etat de la configuration (Change:1 ; unchanged:0)");
//                System.out.print("Etat de l appareil : ");
//                System.out.println(dcp[16].toCharArray()[2] + " = Version du micrologiciel SCC (Update:1 ; unchanged:0)");
             //   System.out.print("Etat de l appareil : ");
//                System.out.println(dcp[16].toCharArray()[3] + " = Etat de la charge (Load off:1 ; Load on:0)");
//                System.out.print("Etat de l appareil : ");
                //System.out.println(dcp[16].toCharArray()[4] + " = Etat de la tension de la batterie a stable pendant la charge");
               // System.out.print("Etat de l appareil : ");
//                System.out.println(dcp[16].toCharArray()[5] + " = Etat Charge ( Chargement/arret)");
               // System.out.print("Etat de l appareil : ");
             //   System.out.println(dcp[16].toCharArray()[6] + " = Etat de charge (SCC1 charge on/off)");
               // System.out.print("Etat de l appareil : ");
              //  System.out.println(dcp[16].toCharArray()[7] + " = Etat de charge (AC charge on/off)");
                //System.out.println(dcp[17]+" mV" + " = Decalage de la tension de la batterie pour les ventilateurs allumes");
                //System.out.println(dcp[18]+ " = Version EEPROM");
              //  System.out.println(dcp[19]+" W" + " = Puissance de charge 1 PV");
//                System.out.print("Etat de l appareil : ");
//                System.out.println(dcp[20]);
//                System.out.println(dcp[20].toCharArray()[0]+ " = drapeau pour charger a Mode flottant");
                //System.out.println(dcp[20].toCharArray()[1]+ " = appareil allumé (oui:1 ; non:0");
                //System.out.println(dcp[20].toCharArray()[2]+ " = reserved");

                System.out.println("""
                        
                      %s V = Tension de sortie (AC)
                      %s VA = Puissance apparente de sortie CA
                      %s W = Puissance active de sortie CA
                      %s /100 = Pourcentage de charge de sortie
                      %s  /100 = Capacite de la batterie
                      %s Etat appareil
                      000 = appareil out ; 110 = appareil charge sur SCC1 \n 101 = appareil charge en courant alternatif \n 111 = appareil charge avec SCC1, charge sur CA
                      %s  = ajout de la priorite SBU Version (oui:1 ; non:0)"
                      %s = Etat de la configuration (Change:1 ; unchanged:0)
                      %s = Version du micrologiciel SCC (Update:1 ; unchanged:0)
                      %s = Etat de la charge (Load off:1 ; Load on:0)
                      %s = Etat de la tension de la batterie a stable pendant la charge
                      %s = Etat Charge ( Chargement/arret)
                      %s = Etat de charge (SCC1 charge on/off)
                      %s = Etat de charge (AC charge on/off)
                      %s W = Puissance de charge 1 PV
                      %s Etat appareil
                      %s = drapeau pour charger a Mode flottant
                      %s = appareil allumé (oui:1 ; non:0)
                      %s = appareil allumé (oui:1 ; non:0)
                      %s = reserved
                      
                      
                        """.formatted(dcp[2],dcp[4],dcp[5],dcp[6],dcp[10],dcp[16],dcp[16].toCharArray()[0],dcp[16].toCharArray()[1],dcp[16].toCharArray()[2],
                        dcp[16].toCharArray()[3],dcp[16].toCharArray()[4],dcp[16].toCharArray()[5],dcp[16].toCharArray()[6],dcp[16].toCharArray()[7],
                        dcp[19],dcp[20],dcp[20].toCharArray()[0],dcp[20].toCharArray()[1],dcp[20].toCharArray()[1],dcp[20].toCharArray()[2]));
//235246

            }

            if (serialPort.getInputBufferBytesCount()==98) {
                Thread.sleep(500);
                byte[] trameBrute = super.lireTrame(98);
                String st_trameBrute= new String(trameBrute,StandardCharsets.US_ASCII);
                String dcp[]= st_trameBrute.split(" ");
                System.out.println(dcp.length);
                System.out.println("");
//                qpigs.setTensionReseaux(dcp[0].replace("(", ""));
//                qpiri.setTensionNominaleReseau(dcp[1]);
//                qpiri.setCourantNominalReseau(dcp[2]);
//                qpiri.setTensionNominaleSortie(dcp[3]);
//                qpiri.setFrequenceNominaleSortie(dcp[4]);
//                qpiri.setCourantNominalSortie(dcp[5]);
//                qpiri.setPuissanceApparenteNominaleSortie(dcp[6]);
//                qpiri.setPuissanceNominaleSortie_puissanceActive(dcp[7]);
//                qpiri.setTensionNominaleBatterie(dcp[8]);
//                qpiri.setTensionRechargeBatterie(dcp[9]);
//                qpiri.setBatterieSousTension(dcp[10]);
//                qpiri.setTensionApparenteBatterie(dcp[11]);
//                qpiri.setTensionFlottanteBatterie(dcp[12]);
//                qpiri.setTypeBatterie(dcp[13]);
//                qpiri.setCourantChargeACmax(dcp[14]);
//                qpiri.setCourantChargeMax(dcp[15]);
//                qpiri.setPlageTensionEntree(dcp[16]);
//                qpiri.setPrioriteSourceSortie(dcp[17]);
//                qpiri.setPrioriteSourceChargeur(dcp[18]);
//                qpiri.setNombreMaxParallele(dcp[19]);
//                qpiri.setTypeMachine(dcp[20]);
//                qpiri.setTopologie(dcp[21]);
//                qpiri.setModeSortie(dcp[22]);
//                qpiri.setTensionDechargeBatterie(dcp[23]);
//                qpiri.setConditionOKParallele(dcp[24]);
//                qpiri.setBilanPuissancePhotovoltaique(dcp[25]);



            }
            if (serialPort.getInputBufferBytesCount()==42) {
                Thread.sleep(500);
                byte[] trameBrute = super.lireTrame(super.detecteSiReception());
                StringBuilder sb = new StringBuilder();
                for (byte b : trameBrute) {
                    sb.append(String.format("%02X ", b));
                }
                String[] dcp = sb.toString().split(" ");
                qpiws.setDefaillanceOnduleur(dcp[2]);
                qpiws.setBusOver(dcp[3]);
                qpiws.setBusSous(dcp[4]);
                qpiws.setEchecProgressifBus(dcp[5]);
                qpiws.setLineFail(dcp[6]);
                qpiws.setoPVShort(dcp[7]);
                qpiws.setTensionOnduleurTropFaible(dcp[8]);
                qpiws.setTensionOnduleurTropElevee(dcp[9]);
                qpiws.setSurchauffe(dcp[10]);
                qpiws.setVentilateurVerrouille(dcp[11]);
                qpiws.setTensionBatterieElevee(dcp[12]);
                qpiws.setAlarmeBatterieFaible(dcp[13]);
                qpiws.setReserve_Surcharge(dcp[14]);
                qpiws.setBatterieArret(dcp[15]);
                qpiws.setReserveDeclassementBatterie(dcp[16]);
                qpiws.setSurcharge(dcp[17]);
                qpiws.setDefautEeprom(dcp[18]);
                qpiws.setSurintensiteOnduleur(dcp[19]);
                qpiws.setOnduleurSoftFail(dcp[20]);
                qpiws.setEchecAuto_test(dcp[21]);
                qpiws.setTensionContinueOPsur(dcp[22]);
                qpiws.setBatOpen(dcp[23]);
                qpiws.setDefaillanceCapteurCourant(dcp[24]);
                qpiws.setBatteriecourte(dcp[25]);
                qpiws.setLimitePuissance(dcp[26]);
                qpiws.setTensionElevee1(dcp[27]);
                qpiws.setDefautSurchargeMPPT1(dcp[28]);
                qpiws.setAvertissementSurchargeMPPT1(dcp[29]);
                qpiws.setBatterieTropFaiblePourEtreChargee1(dcp[30]);
                qpiws.setTensionPVelevee2(dcp[31]);
                qpiws.setDefautSurchargeMPPT2(dcp[32]);
                qpiws.setAvertissementSurchargeMPPT2(dcp[33]);
                qpiws.setBatterieTropFaiblePourCharger2(dcp[34]);
                qpiws.setTensionPVelevee3(dcp[35]);
                qpiws.setDefautSurchargeMPPT3(dcp[36]);
                qpiws.setAvertissementSurchargeMPPT3(dcp[37]);
                qpiws.setBatterieTropFaiblePourEtreChargee3(dcp[38]);


            }
        } catch (InterruptedException | SerialPortException e) {
            throw new RuntimeException(e);
        }
    }

    public void demandeQPIGS() {
        StringBuilder sb = new StringBuilder();
        byte[] crc = intToByteArray(crc16CcittXmodel(QPIGS));
        for (byte b : ArrayUtils.add(ArrayUtils.addAll(QPIGS, crc), CR)) {
            sb.append(String.format("%02X ", b));
        }

        System.out.println("Demande (hexa)  -> " + sb);
        System.out.println("Demande (acsii) -> " + new String(ArrayUtils.add(ArrayUtils.addAll(QPIGS, crc), CR)));
        super.ecrire(ArrayUtils.add(ArrayUtils.addAll(QPIGS, crc), CR));
    }
    public void demandeQPIRI() {
        StringBuilder sb = new StringBuilder();
        byte[] crc = intToByteArray(crc16CcittXmodel(QPIRI));
        for (byte b : ArrayUtils.add(ArrayUtils.addAll(QPIRI, crc), CR)) {
            sb.append(String.format("%02X ", b));
        }

        System.out.println("Demande (hexa)  -> " + sb);
        System.out.println("Demande (acsii) -> " + new String(ArrayUtils.add(ArrayUtils.addAll(QPIRI, crc), CR)));
        super.ecrire(ArrayUtils.add(ArrayUtils.addAll(QPIRI, crc), CR));
    }
    public void demandeQPIWS() {
        StringBuilder sb = new StringBuilder();
        byte[] crc = intToByteArray(crc16CcittXmodel(QPIWS));
        for (byte b : ArrayUtils.add(ArrayUtils.addAll(QPIWS, crc), CR)) {
            sb.append(String.format("%02X ", b));
        }

        System.out.println("Demande (hexa)  -> " + sb);
        System.out.println("Demande (acsii) -> " + new String(ArrayUtils.add(ArrayUtils.addAll(QPIWS, crc), CR)));
        super.ecrire(ArrayUtils.add(ArrayUtils.addAll(QPIWS, crc), CR));
    }

    public int crc16CcittXmodel(byte[] bytes) {
        int crc = 0x0000;          // initial value=0x0000 (CCITT Xmodem) initial value=0x0000 (CCITT)
        int polynomial = 0x1021;   // 0001 0000 0010 0001  (0, 5, 12)
        for (byte b : bytes) {
            for (int i = 0; i < 8; i++) {
                boolean bit = ((b >> (7 - i) & 1) == 1);
                boolean c15 = ((crc >> 15 & 1) == 1);
                crc <<= 1;
                if (c15 ^ bit) crc ^= polynomial;
            }
        }
        crc &= 0xffff;
        //System.out.println("CRC16-CCITT = " + Integer.toHexString(crc));
        return crc;
    }

    public byte[] intToByteArray(int value) {
        return new byte[]{(byte) (value >>> 8), (byte) value};
    }
    public static int hex_to_int(String s)
    {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
}
