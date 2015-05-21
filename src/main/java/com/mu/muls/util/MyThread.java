package com.mu.muls.util;

/**
 * Created by bolinluo on 2015/5/7 15:35
 */
public class MyThread {


    public  static  void main(String[] args){
        Thread1 one1 = new Thread1();
        Thread1 one2 = new Thread1();

        Thread th1 = new Thread(one1,"th11");
        th1.setName("th1");
        Thread th2 = new Thread(one1,"th22");
        th1.start();
        try {
            System.out.println("wait..");
            synchronized (th1){
                Thread.sleep(300);
                th1.wait();


            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println(th1.getContextClassLoader());
       // th2.start();
        for(int k=0; k<0;k++){
            new Thread(one1,"th"+k).start();
        }


    }


















}


class Thread1 implements Runnable{
   int count=0;
   String name="name";

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName()+": thread1 run:"+i+" count="+getCount());

            try {
                Thread.sleep(100L);
                if(i==3){
                    synchronized (this){
                        notify();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public synchronized int  getCount() {
        count ++;
        return count;
    }

}
