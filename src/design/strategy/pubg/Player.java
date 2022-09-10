package design.strategy.pubg;

import design.strategy.pubg.weapon.Weapon;

public abstract class Player {

    Weapon weapon;

    public Player() {};

    public void openDoor() {
        System.out.println("문을 열었습니다.");
    }

    public void closeDoor() {
        System.out.println("문을 닫았습니다.");
    }

    public void noMoreBullets() {
        System.out.println("총알이 없다. 총 또는 총알을 파밍하세요." );
    }

    public void setWeapon(Weapon wp) {
        this.weapon = wp;
    }

    public void attack() {
        weapon.fire();
    }
}
