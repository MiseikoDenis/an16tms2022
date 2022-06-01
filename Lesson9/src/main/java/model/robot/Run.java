package model.robot;

import model.robot.hands.SamsungHand;
import model.robot.hands.SonyHand;
import model.robot.hands.ToshibaHand;
import model.robot.heads.SamsungHead;
import model.robot.heads.SonyHead;
import model.robot.heads.ToshibaHead;
import model.robot.legs.SamsungLeg;
import model.robot.legs.SonyLeg;
import model.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        int maxCost = 0;
        Robot robotMax = new Robot();

        Robot robot1 = new Robot(new SonyHead(50), new SamsungHand(25), new SamsungLeg(30));
        Robot robot2 = new Robot(new SamsungHead(40), new SonyHand(70), new ToshibaLeg(25));
        Robot robot3 = new Robot(new ToshibaHead(30), new ToshibaHand(40), new SonyLeg(40));

        Robot[] robots = new Robot[]{robot1, robot2, robot3};

        for (Robot robot : robots) {
            robot.action();
            if (maxCost <= robot.getPrice()) {
                maxCost = robot.getPrice();
                robotMax = robot;
            }
        }

        System.out.println("Робот " + robotMax + " самый дорогой с общей стоимостью " + maxCost);
    }
}
