package flower;

import lombok.Getter;
import lombok.Setter;

public class Flower {
    @Getter @Setter
    private double sepalLength;
    @Getter @Setter
    private double price;
    @Setter
    private FlowerColor color;
    @Getter @Setter
    private FlowerType type;

    public String getColor(){
        return this.color.toString();
    }
}
