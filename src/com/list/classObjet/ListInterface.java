package com.list.classObjet;

public class ListInterface {
  public static void getListStatic() {
    Class c = String.class;
    Class c2 = new String().getClass();

    Class[] faces = c.getInterfaces();
    System.out.println("Il y a " + faces.length + " interfaces implémentées");
    for(int i = 0; i < faces.length; i++)
      System.out.println(faces[i]);
  }
}
