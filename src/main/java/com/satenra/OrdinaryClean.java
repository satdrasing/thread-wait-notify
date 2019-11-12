package com.satenra;

public class OrdinaryClean implements Runnable {

    House house;
    OrdinaryClean(House house){
        this.house =house;
    }
    @Override
    public  void run() {
        synchronized (house){
            System.out.println(Thread.currentThread().getName() +" cleaning start......OR");
            try {
                house.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         house.doCleaning();
            System.out.println(Thread.currentThread().getName() +" cleaning finish......OR");
        }
    }
}
