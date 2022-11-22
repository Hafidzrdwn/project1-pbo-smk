package project.thread_lift;

import static java.lang.Thread.sleep;
import java.util.Scanner;

/**
 *
 * @author Hafidz Ridwan
 */
public class Lift {
     int lantai, tujuan;
    static Scanner scan = new Scanner(System.in);
   
    Lift(int lantai, int tujuan) {
        this.lantai = lantai;
        this.tujuan = tujuan;
    }
    
    private void proses() {
        Thread th = new Thread() {
           @Override  
          public void run() {
              
              if(lantai <= tujuan) {
                    try {

                        for(int i = lantai; i <= tujuan; i++) {
                            System.out.println("Naik : lantai = "+ i);
                            sleep(500);
                        }

                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
              } else {
                    try {

                    for(int i = lantai; i >= tujuan; i--) {
                        System.out.println("Turun : lantai = "+ i);
                        sleep(500);
                    }
                  
                    }catch(InterruptedException e) {
                        e.printStackTrace();
                    }
              }
          }  
        
        };
        
        th.start();
    }
    
    public static void main(String[] args) {
        int lantai, tujuan;
        
        System.out.print("\n\nMasukkan posisi lantai = ");
        lantai = scan.nextInt();
        System.out.print("Masukkan lantai tujuan = ");
        tujuan = scan.nextInt();

        Lift result = new Lift(lantai, tujuan);
        result.proses();
    }
}
