package by.tms.model.seasons;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Season {

    WINTER(-10),
    SPRING(5),
    SUMMER(23) {
        @Override
        public String getDescription() {
            return "It's warm season";
        }
    },
    AUTUMN(8);

    private final double temperature;

    public String getDescription() {
        return "It's cold season";
    }

    public void love(Season season) {
        switch (season) {
            case SUMMER -> System.out.println("I love summer");
            case WINTER -> System.out.println("I love winter");
            case AUTUMN -> System.out.println("I love autumn");
            case SPRING -> System.out.println("I love spring");
        }
    }


}
