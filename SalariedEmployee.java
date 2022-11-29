/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NO2_C_20103154;

/**
 *
 * @author Lenovo
 */
public final class SalariedEmployee extends Employee{
      private final double Upah;
    
    public SalariedEmployee(String nama, int NIP, double upah)
    {
        super (nama, NIP);
        this.Upah = upah;
    }
    public String nama()
    {
        return super.NamaPegawai();
    }
    public int nip()
    {
        return super.nipPegawai();
    }

    @Override
    public void CetakInfo() 
    {
        System.out.println("Nama Pegawai : " + Nama);
        System.out.println("Nomor Induk Pegawai : " + nip);
    }

    @Override
    public double HitungGaji() 
    {
        return Upah;
    }
}
