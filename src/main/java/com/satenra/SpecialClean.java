package com.satenra;

public class SpecialClean implements Runnable {

    House house;

    SpecialClean(House house){
        this.house = house;
    }
    @Override
    public  void run() {
        synchronized (house){
            System.out.println(Thread.currentThread().getName() +" cleaing start...SP");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            house.doCleaning();
            System.out.println(Thread.currentThread().getName() +" cleaning finish...SP");
            house.notifyAll();
            System.out.println("notified");
        }

    }
}
