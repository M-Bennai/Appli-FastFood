package com.menu;

import java.util.Scanner;

public class CommandeBoeuf {

    public static void boeuf() {

        Scanner acc = new Scanner(System.in);
        System.out.println("Choissisez votre accompagnement");
        System.out.println("Tapez 1 pour légumes frais, 2 pour du riz et 3 pour des frites");
        int légumesFrais = 1;
        int riz = 2;
        int frites = 3;
        int choixAccompagnement;
        choixAccompagnement = acc.nextInt();
        System.out.println("La boisson n'est pas comprise dans le menu");
        System.out.println("Merci pour votre commande, il vous faudra régler 9 euros.");

    }
}
