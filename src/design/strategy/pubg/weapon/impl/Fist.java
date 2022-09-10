package design.strategy.pubg.weapon.impl;

import design.strategy.pubg.weapon.Weapon;

public class Fist implements Weapon {

    @Override
    public void farming() {
        System.out.println("무기를 파밍해주세요");
    }

    @Override
    public void fire() {
        System.out.println("허공을 가르는 주먹.");
    }
}
