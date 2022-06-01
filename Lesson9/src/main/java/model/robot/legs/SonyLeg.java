package model.robot.legs;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class SonyLeg implements ILeg {
    private int price;

    @Override
    public void step() {
        System.out.println("Нога Sony сделала шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
