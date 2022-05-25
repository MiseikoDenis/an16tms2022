package by.tms.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Engine {
    private boolean on;
    private String model;

    public Engine(String model) {
        this.model = model;
    }
}
