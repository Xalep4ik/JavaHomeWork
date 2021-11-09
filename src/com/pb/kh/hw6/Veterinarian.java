package com.pb.kh.hw6;

import java.util.concurrent.Callable;

public class Veterinarian  {


      void treatAnimal(Animal animal){
          System.out.println("На приеме : " + animal.getName() + " питается : " + animal.getFood() + " живет в : " + animal.getLocation());
    }

}
