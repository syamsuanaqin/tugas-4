/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class EtestE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        encapsulation s[] = new encapsulation[5];
        System.out.println("--------------------Selamat datang --------------------");
        System.out.println("Silahkan masukan identitas lengkap anda : ");
        for (int i = 0; i < 3; i++) {
            s[i] = new encapsulation();
            System.out.print("Nama Lengkap : ");
            String nam = in.nextLine();
            s[i].setNama(nam);
            System.out.print("Alamat       : ");
            String al = in.nextLine();
            s[i].setAlamat(al);
            System.out.print("Nomor Telpon : ");
            String no = in.nextLine();
            s[i].setNoTlp(no);
            System.out.print("E-mail       : ");
            String em = in.nextLine();
            s[i].setEmail(em);
            System.out.println("----------------------------------------------");
        }
    }
}

