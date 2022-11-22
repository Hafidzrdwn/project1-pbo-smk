package project.thread_tentara;

import static java.lang.Thread.sleep;

/**
 *
 * @author Hafidz Ridwan
 */
public class Tentara {
      void proses() {
        
        Thread kopasus = new Thread() {
            public void run() {
                
                try {
                    
                    System.out.println("Kopasus masuk ke TKP");
                    for(int i = 1; i <=3; i++) {
                        System.out.println("Kopasus berhasil menyelamatkan ibu hamil ke - "+ i);
                        if(i == 3) {
                            System.out.println("Kopasus keluar TKP");
                        }
                        sleep(1000);
                    }
                    
                    
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                

            }
            
            
        };
        
        Thread marinir = new Thread() {
            
          public void run() {
              
              try {
                    System.out.println("\nMarinir masuk ke TKP");
                    for(int a = 1; a <= 10; a++) {
                        
                        System.out.println("Marinir berhasil membunuh teroris ke - "+ a);
                        if(a <= 2) {
                            System.out.println("Marinir berhasil menyelamatkan warga manula ke - "+ a);
                        }
                        
                        if(a == 10) {
                            System.out.println("Marinir keluar TKP");
                        }
                        
                        
                        sleep(1000);
                    }
                    
                    System.out.println("\nPasukan Infanteri masuk ke TKP");
                    System.out.println("lalu Pasukan Infanteri Membumihanguskan TKP");
                  
              } catch(InterruptedException e) {
                  e.printStackTrace();
              }
              
              System.out.println("\nMisi Selesai....");
          }  
            
        };
        
          kopasus.start();
          try {
            kopasus.join(); 
          } catch(Exception e) {
              System.out.println(e);
          }
          marinir.start();
    }
    
    public static void main(String[] args) {
        Tentara result = new Tentara();
        
        result.proses();
    }
}
