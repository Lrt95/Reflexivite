package com.list.classObjet;

import java.lang.reflect.Method;

public class ListMethodClass {
  public static void getListMethod() {
    Class c = new String().getClass();
    Method[] m = c.getMethods();

    System.out.println("Il y a " + m.length + " méthodes dans cette classe");
    //On parcourt le tableau de méthodes
    for(int i = 0; i < m.length; i++){
      System.out.println(m[i]);

      Class[] p = m[i].getParameterTypes();

      for(int j = 0; j < p.length; j++)
        System.out.println(p[j].getName());

      System.out.println("-----------------------------------\n");
    }
  }
}
