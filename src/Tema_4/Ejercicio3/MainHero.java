package Tema_4.Ejercicio3;

import java.util.Scanner;

public class MainHero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int level;
        int health;
        int maxHealth;
        int experience = 0;
        int attack;
        int defense;


        System.out.print("Nombre: ");
        name = sc.nextLine();

        System.out.print("Nivle del PJ:  ");
        level = sc.nextInt();

        System.out.print("Vida maxima del PJ: ");
        maxHealth = sc.nextInt();

        System.out.print("Ataque del PJ: ");
        attack = sc.nextInt();

        System.out.print("Defensa del PJ: ");
        defense = sc.nextInt();

        health = maxHealth;

        Hero hero1 = new Hero(name, level, health, maxHealth, experience, attack, defense);
        hero1.toString();
        hero1.drinkPotion(health, maxHealth);
        hero1.rest(health, maxHealth);
        hero1.attack(hero1);
        hero1.levelUp(attack, defense, maxHealth, level, experience);
    }
}
