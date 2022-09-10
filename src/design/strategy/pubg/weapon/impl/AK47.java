package design.strategy.pubg.weapon.impl;

import design.strategy.pubg.weapon.Weapon;

public class AK47 implements Weapon {

    @Override
    public void farming() {
        System.out.println("AK47 파밍완료");
    }

    @Override
    public void fire() {
        System.out.println("AK47 발사! 탕탕탕!");
    }
}
