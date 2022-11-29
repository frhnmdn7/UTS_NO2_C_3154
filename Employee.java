/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NO2_C_20103154;

/**
 *
 * @author Lenovo
 */
    public abstract class Employee 
{
    final String Nama;
    final int nip;
    
    Employee (String nama, int NIP)
    {
        Nama=nama;
        this.nip=NIP;
    }
    public String NamaPegawai ()
    {
        return Nama;
    }

    public int nipPegawai()
    {
        return nip;
    }
    protected abstract void CetakInfo();
    protected abstract double HitungGaji();  
}
