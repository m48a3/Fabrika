package com.company;

public class Main {
    static int sklad_kuz = 0; //Склад кузовов
    static int sklad_dvig = 0; //Склад пыхлей
    static int sklad_acs = 0; //Склад пыхлей
    public static class Kuzov_thread extends Thread { //поток поставщика кузовов
        @Override
        public void run() {
            boolean sawException = false;
            System.out.println("Поставщик кузовов поставляет кузова.");
            while (sklad_kuz != 100)
            {
                try {
                    if(sklad_kuz < 101) {
                        sklad_kuz += 1;
                        Thread.sleep(300);
                    }

                }catch (InterruptedException e) {

                    sawException = true;
                }
            }System.out.println("Склад кузовов заполнен");
            if (sawException) Thread.currentThread().interrupt();




        }
    }
    public static class dvig_thread extends Thread { //поток поставщика кузовов
        @Override
        public void run() {
            boolean sawException = false;
            System.out.println("Поставщик двигателей поставляет двигатели.");
            while (sklad_dvig != 100)
            {
                try {
                    if(sklad_dvig < 101) {
                        sklad_dvig += 1;
                        Thread.sleep(300);
                    }

                }catch (InterruptedException e) {

                    sawException = true;
                }
            }System.out.println("Склад двигателей заполнен");
            if (sawException) Thread.currentThread().interrupt();




        }
    }

    public static class cringe_thread extends Thread { //поток поставщика аксессуаров
        @Override
        public void run() {
            boolean sawException = false;
            System.out.println("Поставщик аксессуаров поставляет детали.");
            while (sklad_acs != 100)
            {
                try {
                    if(sklad_acs < 101) {
                        sklad_acs += 1;
                        Thread.sleep(300);
                    }

                }catch (InterruptedException e) {

                    sawException = true;
                }
            }System.out.println("Склад аксессуаров заполнен");
            if (sawException) Thread.currentThread().interrupt();




        }
    }
    public static void main(String[] args) {
        Thread post_kuz = new Kuzov_thread();
        post_kuz.start();

        Thread post_dvig = new dvig_thread();
        post_dvig.start();

        Thread post_acs = new cringe_thread();
        post_acs.start();



    }
}
