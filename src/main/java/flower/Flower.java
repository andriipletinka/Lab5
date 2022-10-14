/// Flower class implementation

package flower;

import lombok.Getter;
import lombok.Setter;

/// Some comment
public class Flower {
    /// Some comment
    @Getter @Setter
    private double sepalLength;
    /// Some comment
    @Getter @Setter
    private double price;
    /// Some comment
    @Setter
    private FlowerColor color;
    /// Some comment
    @Getter @Setter
    private FlowerType type;

    /// getColor method
    public String getColor() {
        return this.color.toString();
    }
}
