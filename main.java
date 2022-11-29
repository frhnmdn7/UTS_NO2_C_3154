/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_NO2_C_20103154;

/**
 *
 * @author Lenovo
 */
public class main {
    public static void main(String[] args) 
    {
        SalariedEmployee se = new SalariedEmployee("Hari",201547,170000.00);
        se.CetakInfo();
        System.out.println("Gaji : " + se.HitungGaji());
        System.out.println("\n");
        CommisionEmployee ce = new CommisionEmployee("Agus",99999,690000.00,70000.00,11);
        ce.CetakInfo();
        System.out.println("Gaji : " + ce.HitungGaji());
        System.out.println("\n");

        var pp = new ProjectPlanner("Nanda",2132155,2320000.00,50000.00,4,0.05f);
        pp.CetakInfo();
        System.out.println("Gaji : " + pp.HitungGaji());
    }
}

