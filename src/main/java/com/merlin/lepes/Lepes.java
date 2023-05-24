package com.merlin.lepes;

import java.util.Scanner;

public class Lepes 
{   
    double distance=0;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) // Ez a program megmondja mennyi időbe telik eljutni városba gyalog vonattal,kerékpár,autó, vonattal
    {
      city();
      
    }
    public static void city()
       {   
        System.out.println("Hova szeretnél menni?");
        String destination =scanner.nextLine();
        System.out.println("Hány km-re van a cél?");
        double distance = scanner.nextDouble();
        System.out.println("Milyen járművel szeretnél menni ?");
        String vehicle =scanner.next();
        
          if (vehicle.equals("walk"))
                   {
                       int speed=2;
                       double time=distance/speed;
                       int teljesora = (int) time; //itt le redukáljuk egész számra és 1-lesz belőle
                       int perc = (int) ((time- teljesora) * 60);  //itt a tört számot osztjuk az egésszel 1,77-ből 1 maradt a0,77 és szorozzok 60
                      
             
                       System.out.println("Ha gyalog mész "+ time+ " órába és "+perc+"  percbe fog telni az út"); 
                   }
          else if(vehicle.equals ("bike"))
                  {
                  int speed=25;
                       double time=distance/speed;
                       int teljesora = (int)time;
                       int perc = (int) ((time- teljesora) * 60);
                       
                       if(perc>0)
                       {
                       System.out.printf("%1.2f Ha biciklivel mész "+ time+ "órába és"+perc+" percbe telik az út!"); 
                       }
                       else
                       {
                       System.out.println("Ha biciklivel mész "+ time+ "órába telik az út"); 
                       }
                  }   
          else if (vehicle.equals ("car"))
                  {
                  int speed=90;
                       double time=distance/speed;
                        int teljesora = (int) time;
                        int perc = (int) ((time- teljesora) * 60);
                       
                       if(perc>0)
                       {
                       System.out.println("Ha autóval mész "+ time+ " órába és"+perc+" percbe telik az út"); 
                       }
                       else
                       {
                       System.out.println("Ha autóval mész "+ time+ "órába telik az út"); 
                       }
                       
                  }    
         else if(vehicle.equals ("train"))
                  {
                  int speed=100;
                       double time=distance/speed;
                       
                       int teljesora = (int) time;
                       int perc = (int) ((time- teljesora) * 60);
                       
                       if(perc>0)
                       {
                       System.out.println("Ha vonattal mész "+ time+ "órába és"+perc+" percbe telik az út"); 
                       }
                       else
                       {
                       System.out.println("Ha vonattal mész "+ time+ "órába telik az út"); 
                       }
                  }
        }
           
}
    

