package com.company.mypackage;

public class Counter extends Thread {
    @Override
    public void run() {
        counter();
    }
    private void counter(){
        for (int i=5; i>0; i--){
            try{
                Thread.sleep(500);
                System.out.println(i+1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Test");
    }
}
