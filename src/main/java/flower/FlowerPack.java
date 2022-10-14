/// FlowerPack class implementation

package flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/// Some comment
@AllArgsConstructor @Setter @Getter
public class FlowerPack {
    /// Some comment
    private Flower flower;
    /// Some comment
    private int quantity;

    /// getPrice method
    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
