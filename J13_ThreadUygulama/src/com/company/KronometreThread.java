package com.company;

public class KronometreThread  implements Runnable{

        private Thread thread;
        private String  threadName;

        public KronometreThread(String threadname)
        {
            this.threadName = threadname;
            System.out.println("olusturuluyor "+ threadname);
        }
        // run blogunda calıstırma islemleri gercekleştirilir. diger bloklarda mantık hep aynıdır.
        @Override
        public void run() {
            System.out.println(threadName+" calıstırılıyor");

            try{
                for (int i = 1; i <=10 ; i++) {
                    System.out.println("adi: "+threadName+ "deger: "+i);
                    Thread.sleep(1000);
                }
            }
            catch (Exception e)
            {
                System.out.println(threadName+" bozuldu.");
            }
            System.out.println(threadName+" thread islemi bitti.");

        }

        public void baslat()
        {
            System.out.println("thread nesnesi olusturuluyor..");
            if(thread == null)
            {
                thread = new Thread(this,threadName);
                thread.start();
            }

        }
    }
