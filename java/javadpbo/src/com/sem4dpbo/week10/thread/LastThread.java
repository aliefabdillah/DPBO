package com.sem4dpbo.week10.thread;

public class LastThread extends Thread{
    LastThread(){
        
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("proses LastThread");
            try {
                sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
