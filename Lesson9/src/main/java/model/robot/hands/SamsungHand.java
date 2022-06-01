package model.robot.hands;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class SamsungHand implements IHand {
    private int price;

    @Override
    public void upHand() {
        System.out.println("Поднял руку Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
