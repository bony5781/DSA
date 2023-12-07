public class Floor {
    // write code here
    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getArea() {
        return width * length;
    }

}

class Carpet {
    private double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return cost;
    }
}

class Calculator {
    private Carpet carpet;
    private Floor floor;

    public Calculator(Floor floor) {
        this.floor = floor;
    }

    public double getTotalCost() {
        return carpet.getCost() * floor.getArea();
    }
}