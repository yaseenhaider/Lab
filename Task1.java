
class Package {
    private String senderName;
    private String senderAddress;
    private String recipientName;
    private String recipientAddress;
    private double weight; // in ounces
    private double costPerOunce;

    public Package(String senderName, String senderAddress, String recipientName, String recipientAddress,
                   double weight, double costPerOunce)
    {
        if (weight <= 0 || costPerOunce <= 0) {
            throw new IllegalArgumentException("Weight and cost per ounce must be positive values.");
        }
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.weight = weight;
        this.costPerOunce = costPerOunce;
    }

    public double calculateCost() {
        return weight * costPerOunce;
    }
}

class TwoDayPackage extends Package {

    private double flatFee;

    public TwoDayPackage(String senderName, String senderAddress, String recipientName, String recipientAddress,
                         double weight, double costPerOunce, double flatFee) {
        super(senderName, senderAddress, recipientName, recipientAddress, weight, costPerOunce);
        this.flatFee = flatFee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }
}

class OvernightPackage extends Package {
    private double additionalFee;

    public OvernightPackage(String senderName, String senderAddress, String recipientName, String recipientAddress,
                            double weight, double costPerOunce, double additionalFee)
    {
        super(senderName, senderAddress, recipientName, recipientAddress, weight, costPerOunce);

        this.additionalFee = additionalFee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + additionalFee;
    }
}


public class Task1 {
    public static void main(String[] args) {

        Package p1 = new Package("Yaseen Haider", "123 Main St", "bilal", "456 Elm St", 10, 0.5);
        Package p2 = new TwoDayPackage("minahil", "789 Maple St", "Danish", "321 Oak St", 5, 0.75, 10);
        Package p3 = new OvernightPackage("jassie", "654 Pine St", "shadab", "987 Cedar St", 8, 0.6, 20);

        // Arry
        Package[] packages = {p1, p2, p3};


        for (Package pkg : packages) {
            System.out.printf("Shipping cost for %s: $%.2f%n", pkg.getClass().getSimpleName(), pkg.calculateCost());
        }
    }
}