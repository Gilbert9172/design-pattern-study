package design.strategy.pubg.weapon.impl;

import design.strategy.pubg.weapon.Weapon;

public class M4 implements Weapon {

    @Override
    public void farming() {
        System.out.println("M4 파밍완료.");
    }

    @Override
    public void fire() {
        System.out.println("M4 발사! 팅팅팅!");
    }
}
