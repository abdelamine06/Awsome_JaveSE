package com.amine;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print" );
        public static void main(String[] args)
        {
            /**
             * implementer l'interface qui est declaré comme une inner class de la class Button
             */

                  /*  class ClickListener implements Button.OnClickListener{
                        public ClickListener(){
                            System.out.println(" I've been atached!");
                        }
                        @Override
                        public void onClick(String title) {
                            System.out.println(title + " was clicked!");
                        }
                    }
            /***
             * instacier la class clicklistener qui est une class inner aussi
             */
                           // btnPrint.setOnClickListener(new ClickListener());

            /**
             * anonymous classes
             */
            btnPrint.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(String title) {
                    System.out.println(title + " was clicked! with anonymous class");
                }
            });
            listen();

        }
        private static void listen()
            {
                boolean quit = false;
                        while (!quit)
                        {
                            int choice = scanner.nextInt();
                            scanner.nextLine();
                            switch (choice){
                                case 0:
                                    quit= true;
                                    break;
                                case 1:
                                    btnPrint.onClick();
                                    break;
                            }
                        }
            }
}
