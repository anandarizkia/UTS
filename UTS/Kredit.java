/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author LENOVO
 */
public class Kredit implements Metode_Pembayaran {
    private String KartuKredit;
    private String pin;

    public Kredit(String KartuKredit) {
        this.KartuKredit = KartuKredit;
    }
    
    @Override
    public void SetPin (String pin){
        this.pin = pin;
    }
    
    @Override
    public String GetPin (){
        return this.pin;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Pembayaran sebesar " + jumlah + " dengan kartu kredit " + KartuKredit + " berhasil diproses.");
    }
}
