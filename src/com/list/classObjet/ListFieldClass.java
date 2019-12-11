package com.list.classObjet;

import java.lang.reflect.Field;

public class ListFieldClass {
  public static void getListField() {
    Class c = new String().getClass();
    Field[] m = c.getDeclaredFields();

    System.out.println("Il y a " + m.length + " champs dans cette classe");
    //On parcourt le tableau de méthodes
    for(int i = 0; i < m.length; i++)
      System.out.println(m[i].getName());
  }
}
