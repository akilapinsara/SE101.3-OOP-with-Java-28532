
package com.mycompany.q1;


public class GreenLightThread {
      public void run(){
        try {
             System.out.println("Green Light");
             Thread.sleep(10000);
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
    }
}
