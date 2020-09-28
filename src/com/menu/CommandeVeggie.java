package com.menu;

import java.util.Scanner;

public class CommandeVeggie {

    public static void veggie() {

        Scanner acc = new Scanner(System.in);
        System.out.println("Choisissez votre accompagnement");
        System.out.println("avec le menu veggie, nous servons des légumes frais");
        System.out.println("Désirez vous du riz en plus ? Tapez 1 pour oui, et non pour 2");
        int oui = 1;
        int non = 2;
        int choixRiz;
        choixRiz = acc.nextInt();
        System.out.println("Choisissez maintenant votre boisson");
        System.out.println("Tapez 1 pour de l'eau plate, 2 pour l'eau gazeuse ou 6 pour un soda");
        int eauPlate = 4;
        int eauGazeuse = 5;
        int soda = 6;
        int choixBoisson;
        choixBoisson = acc.nextInt();
        System.out.println("Merci pour votre commande.");
        System.out.println("Il vous faudra régler 9 euros.");
    }
}

