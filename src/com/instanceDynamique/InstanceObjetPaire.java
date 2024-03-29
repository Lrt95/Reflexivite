package com.instanceDynamique;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InstanceObjetPaire {
  public static void instance() {
    String nom = Paire.class.getName();
    try {
      //On crée un objet Class
      Class cl = Class.forName(nom);
      //Nouvelle instance de la classe Paire
      Object o = cl.newInstance();

      //On crée les paramètres du constructeur
      Class[] types = new Class[]{String.class, String.class};
      //On récupère le constructeur avec les deux paramètres
      Constructor ct = cl.getConstructor(types);

      //On instancie l'objet avec le constructeur surchargé !
      Object o2 = ct.newInstance(new String[]{"valeur 1 ", "valeur 2"} );

      //On va chercher la méthode toString, elle n'a aucun paramètre
      Method m = cl.getMethod("toString", null);
      //La méthode invoke exécute la méthode sur l'objet passé en paramètre
      //Pas de paramètre, donc null en deuxième paramètre de la méthode invoke !

      System.out.println("----------------------------------------");
      System.out.println("Méthode " + m.getName() + " sur o2: " +m.invoke(o2, null));
      System.out.println("Méthode " + m.getName() + " sur o: " +m.invoke(o, null));

    } catch (SecurityException |
        ClassNotFoundException |
        InstantiationException |
        IllegalAccessException |
        NoSuchMethodException |
        InvocationTargetException |
        IllegalArgumentException e) {
      e.printStackTrace();
    }
  }
}
