public class Pizza {

    private String size;

    private int price;
    private int cheese = 0;
    private int pepperoni = 0;
    private int ham = 0 ;

    public Pizza(String size, int cheese, int pepperoni, int ham) {
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.ham = ham;
    }
    public int calcPrice() {
        switch (getSize()) {
            case "small" -> price = 10;
            case "medium" -> price = 12;
            case "large" -> price = 14;
            default -> System.out.println("Invalid size");
        }
        if (getCheese() != 0)
            price = price + (2 * getCheese());
        if (getPepperoni() != 0)
            price = price + (2 * getPepperoni());
        if (getHam() != 0)
            price = price + (2 * getHam());
        return price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }

    public int getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(int pepperoni) {
        this.pepperoni = pepperoni;
    }

    public int getHam() {
        return ham;
    }

    public void setHam(int ham) {
        this.ham = ham;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pizza{");
        sb.append("size='").append(size).append('\'');
        sb.append(", cheese=").append(cheese);
        sb.append(", pepperoni=").append(pepperoni);
        sb.append(", ham=").append(ham);
        sb.append('}');
        return sb.toString();
    }
}
