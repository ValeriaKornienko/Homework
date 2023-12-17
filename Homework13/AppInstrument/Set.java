package AppInstrument;

public class Set {
    String item1;
    String item2;

    public Set(String item1, String item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return "Набор. Состав: " +
                  item1 + '\'' +
                  item2 +
                '}';
    }
}