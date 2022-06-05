package model.robot.legs;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class SamsungLeg implements ILeg {
    private int price;

    @Override
    public void step() {
        System.out.println("Нога Samsung сделала шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
