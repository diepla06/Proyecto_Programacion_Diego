package Tema_4.Ejercicio3;

import javax.xml.namespace.QName;

public class Hero {

    private String name;
    private int level;
    private int health;
    private int maxHealth;
    private int experience;
    private int attack;
    private int defense;

    private final static String defName = "Pabit";
    private final static int defLevel = 1;
    private final static int defHealth = 100;
    private final static int defMaxHealth = 200;
    private final static int defExperience = 0;
    private final static int defAttack = 10;
    private final static int defDefense = 5;

    public Hero(){
        this.name = defName;
        this.level = defLevel;
        this.health = defHealth;
        this.maxHealth = defMaxHealth;
        this.experience = defExperience;
        this.attack = defAttack;
        this.defense = defDefense;
    }
    public Hero(String name, int level, int health, int maxHealth, int experience, int attack, int defense){
        this.name = name;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }


    public String getName() {return name;}

    public int getLevel() {return level;}
    public void setLevel(){
        this.level = level;
    }

    public int getHealth(){return health;}
    public void setHealth(int attack) {
        this.attack = attack;
    }

    public int getMaxHealth() {return maxHealth;}
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getExperience() {return experience;}
    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getAttack() {return attack;}
    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {this.defense = defense;}
    public int getDefense() {
        return defense;
    }

    public int drinkPotion(int health, int maxHealth){
        health = health + 10;

        if (health > maxHealth){
            health = maxHealth;
        }
        return health;
    }

    public int rest(int health, int maxHealth){
        health = health + 50;

        if (health > maxHealth){
            health = maxHealth;
        }
        return health;
    }


    public String toString() {
        return "Nombre: " + name + "\nNivel: " + level + "\nVida: " + health + "\n Vida Maxima: " + maxHealth + "\nExperiencia: " + experience + "\nAtaque: " + attack + "\nDefensa: " + defense;
    }

    public void attack(Hero hero1){
        System.out.println(hero1.name + " tiene " + this.health + " vida.");
        int damage = Math.max(1,(this.attack - hero1.defense)+10);
        hero1.setHealth(hero1.getHealth()- damage);
        System.out.println(this.name + " le ha dado una leche a " + hero1.name);
        this.experience += 10;
        System.out.println(this.name + " ha ganado 10 de xp.");
    }
    public void levelUp(int attack, int defense, int maxHeath, int level, int experience){
        if(experience > 50){
            level += 1;
            maxHeath += 5;
            attack += 1;
            defense += 1;
            experience -= 50;
            System.out.println("Has subido de nivel: \n +1 lvl: " + level + "\n +5 Vida maxima: " + maxHeath + "\n +1 dps: " + attack + "\n +1 de defensa: " + defense);
        }
    }
}
