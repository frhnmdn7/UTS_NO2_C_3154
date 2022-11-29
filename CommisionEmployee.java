/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NO2_C_20103154;

/**
 *
 * @author Lenovo
 */
public class CommisionEmployee extends Employee
{
     private double gajiPokok;
    private double Komisi;
    private int totJual;
    
    public CommisionEmployee(String nama, int NIP, double gajipokok, double komisi, int penjualan)
    {
        super (nama, NIP);
        this.gajiPokok = gajipokok;
        this.Komisi = komisi;
        this.totJual = penjualan;
    }
        public String nama()
        {
            return super.Nama;
        }
        public int NIP()
        {
            return super.nip;
        }
        public  double gajiPokok()
        {
            return gajiPokok;
        }
        public double komisi()
        {
            return Komisi;
        }
        public int penjualan()
        {
            return totJual;
        }
        
    @Override
    protected void CetakInfo() 
    {
        System.out.println("Nama Pegawai : "+ Nama );
        System.out.println("Nomor Induk : " + nip);
    }

    @Override
    protected double HitungGaji() 
    {
        return (gajiPokok+(Komisi*totJual));
    }
} 
private double gajiPokok;
    private double Komisi;
    private int totJual;
    
    public CommisionEmployee(String nama, int NIP, double gajipokok, double komisi, int penjualan)
    {
        super (nama, NIP);
        this.gajiPokok = gajipokok;
        this.Komisi = komisi;
        this.totJual = penjualan;
    }
        public String nama()
        {
            return super.Nama;
        }
        public int NIP()
        {
            return super.nip;
        }
        public  double gajiPokok()
        {
            return gajiPokok;
        }
        public double komisi()
        {
            return Komisi;
        }
        public int penjualan()
        {
            return totJual;
        }
        
    @Override
    protected void CetakInfo() 
    {
        System.out.println("Nama Pegawai : "+ Nama );
        System.out.println("Nomor Induk : " + nip);
    }

    @Override
    protected double HitungGaji() 
    {
        return (gajiPokok+(Komisi*totJual));
    }
}

