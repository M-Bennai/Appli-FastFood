package com.menu;

import java.util.Scanner;

public class CommandePoulet {

    public static void poulet() {

        Scanner acc = new Scanner(System.in);
        System.out.println("Choissisez votre accompagnement");
        System.out.println("Tapez 1 pour légumes frais, 2 pour du riz et 3 pour des frites");
        int légumesFrais = 1;
        int riz = 2;
        int frites = 3;
        int choixAccompagnement;
        choixAccompagnement = acc.nextInt();
        System.out.println("Choisissez maintenant votre boisson");
        System.out.println("Tapez 1 pour de l'eau plate, 2 pour l'eau gazeuse ou 6 pour un soda");
        int eauPlate = 4;
        int eauGazeuse = 5;
        int soda = 6;
        int choixBoisson;
        choixBoisson = acc.nextInt();
        System.out.println("Merci pour votre commande, il vous faudra régler 9 euros.");

    }
}

