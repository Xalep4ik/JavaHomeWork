package com.pb.kh.hw6;

import java.util.concurrent.Callable;

public class Veterinarian  {

      void treatAnimal(Animal animal){
          System.out.println(animal.getFood() + animal.getLocation());
    }

}
