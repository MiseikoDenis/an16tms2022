package model;

import lombok.Getter;

@Getter
public abstract class Air extends Transport {

    private final int wingspan;
    private final int minRunwayLength;

    public Air(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunwayLength) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunwayLength = minRunwayLength;
    }
}
