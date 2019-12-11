package com.list.classObjet;

import java.lang.reflect.Constructor;

public class ListConstructorClass {
  public static void getListConstructor() {
    Class c = new String().getClass();
    Constructor[] construc = c.getConstructors();
    System.out.println("Il y a " + construc.length + " constructeurs dans cette classe");
    //On parcourt le tableau des constructeurs
    for(int i = 0; i < construc.length; i++){
      System.out.println(construc[i].getName());

      Class[] param = construc[i].getParameterTypes();
      for(int j = 0; j < param.length; j++)
        System.out.println(param[j]);

      System.out.println("-----------------------------\n");
    }
  }
}
