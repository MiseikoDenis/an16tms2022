package shop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;


@AllArgsConstructor
@Getter
@ToString
public class Product {
    private int id;
    private String name;
    private int price;
    private LocalDateTime date;

}
