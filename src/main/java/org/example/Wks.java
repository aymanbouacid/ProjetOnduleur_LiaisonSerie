package org.example;

import jssc.SerialPortEvent;
import jssc.SerialPortException;
import org.apache.commons.lang3.ArrayUtils;
import org.example.modeles.modelesQPIGS;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Objects;

public class Wks extends LiaisonSerie {

    private final byte[] QPIGS = "QPIGS".getBytes(StandardCharsets.US_ASCII);
    private final byte[] QPIRI = "QPIRI".getBytes(StandardCharsets.US_ASCII);
    private final byte[] QPIWS = "QPIWS".getBytes(StandardCharsets.US_ASCII);
    private final byte START = 0x28;
    private final byte CR = 0x0d;
    modelesQPIGS qpigs = new modelesQPIGS();

    @Override
    public void serialEvent(SerialPortEvent event) {
        try {
            if (serialPort.getInputBufferBytesCount()==110) {
                Thread.sleep(500);
                byte[] trameBrute = super.lireTrame(super.detecteSiReception());
                StringBuilder sb = new StringBuilder();

                for (byte b : trameBrute) {
                    sb.append(String.format("%02X ", b));
                }
                String[] dcp =  sb.toString().split(" ");
                qpigs.setTensionReseaux(dcp[0].replace("(", ""));
                qpigs.setFrequenceReseaux(dcp[1]);
                qpigs.setTensionSortie(dcp[2]);
                qpigs.setFrequenceSortie(dcp[3]);
                qpigs.setPuissanceApparenteSortie(dcp[4]);
                qpigs.setPuissanceActiveSortie(dcp[5]);
                qpigs.setP
                    if(Objects.equals(dcp[7], s))
                    System.out.println(s+"\n");
                }
                System.out.println("réponse (hexa)  -> " + sb);
                System.out.println("réponse (ascii) -> " + new String(trameBrute, StandardCharsets.US_ASCII));}
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
}
