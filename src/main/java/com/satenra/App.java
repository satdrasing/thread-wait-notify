package com.satenra;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {

        House house = new House("cleaning work");

        OrdinaryClean  ordinaryClean = new OrdinaryClean(house);
        Thread ordinaryCleanThread = new Thread(ordinaryClean, "th1");


        OrdinaryClean  ordinaryClean1 = new OrdinaryClean(house);
        Thread ordinaryCleanThread1 = new Thread(ordinaryClean1, "th2");

        ordinaryCleanThread.start();
        ordinaryCleanThread1.start();

        Thread.sleep(5000);

        SpecialClean  specialClean = new SpecialClean(house);
        Thread specialCleanThread = new Thread(specialClean,"th3");
        specialCleanThread.start();
    }
}
