/// FlowerBucket class implementation

package flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            FlowerPack flowerPack = flowerPacks.get(i);
            price += flowerPack.getPrice();
        }
        return price;
    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }
}
