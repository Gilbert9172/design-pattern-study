package design.strategy.pubg;

import design.strategy.pubg.weapon.impl.AK47;
import design.strategy.pubg.weapon.impl.M4;

public class pubgSimulator {

    public static void main(String[] args) {

        Player player1 = new Player1();

        player1.openDoor();
        player1.attack();
        player1.weapon.farming();
        System.out.println("===");
        player1.setWeapon(new AK47());
        player1.weapon.farming();
        player1.attack();
        System.out.println("===");
        player1.noMoreBullets();
        System.out.println("===");
        player1.setWeapon(new M4());
        player1.weapon.farming();
        player1.attack();
        player1.closeDoor();
    }
}
