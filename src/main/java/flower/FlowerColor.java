/// FlowerColor enum implementation

package flower;

/// Some comment
public enum FlowerColor {
    /// Some comment
    RED("#FF0000"), GREEN("#00FF00"), BLUE("#0000FF");

    /// Some comment
    private String stringRepresentation;

    /// Some comment
    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    /// Some comment
    @Override
    public String toString() {
        return stringRepresentation;
    }
}
