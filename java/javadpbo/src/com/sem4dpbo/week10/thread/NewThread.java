package com.sem4dpbo.week10.thread;

class NewThread implements Runnable{
    Thread t;

    NewThread(){
        t = new Thread(this);
        t.start();
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("proses NewThread");
            try {
                t.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
