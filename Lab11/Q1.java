
package com.mycompany.q1;


public class Q1 {

    public static void main(String[] args) {
        while(true){
              RedLightThread rt = new RedLightThread();
              rt.run();
              
              YellowLightThread yt = new YellowLightThread();
             yt.run();
              
              GreenLightThread gt = new GreenLightThread();
              gt.run();
            }
        }
    }

