package com.list.classObjet;

public class ListSuperClass {
  public static void getSuperClass() {
    Class c = String.class;
    Class c2 = new String().getClass();
    //La fameuse méthode finale dont je vous parlais dans le chapitre sur l'héritage
    //Cette méthode vient de la classe Object
    System.out.println("La superclasse de la classe " + String.class.getName() + " est : " + String.class.getSuperclass());
  }
}
