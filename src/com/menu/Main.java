package com.menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner commande = new Scanner(System.in);
        System.out.println("Bonjour et bienvenue chez Simplon Food");
        System.out.println("Nous proposons 3 menus, poulet, boeuf ou veggie");
        System.out.println("Veuillez choisir entre nos 3 menus, tapez 1 pour poulet 2 pour boeuf et 3 pour veggie");
        int menu;
        menu = commande.nextInt();

        int menuPoulet = 1;
        int menuBoeuf = 2;
        int menuVeggie = 3;

        switch (menu) {
            case 1: {

                CommandePoulet.poulet();
                break;
            }
            case 2: {
                CommandeBoeuf.boeuf();
                break;
            }
            case 3: {
                CommandeVeggie.veggie();
                break;
            }
        }
    }
}
