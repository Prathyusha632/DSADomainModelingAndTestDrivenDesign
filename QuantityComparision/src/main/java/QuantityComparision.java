import static java.lang.Integer.parseInt;

public class QuantityComparision {
    public String quantityIsOneCM(String quantity) {
        String quantityUnit = "";
        int quantityValue = 0;
        for (int i = quantity.length()-1; i >= 0; i--) {
            if (quantity.charAt(i) >= '0' && quantity.charAt(i) <= '9') {
                quantityUnit = quantity.substring(i+1);
                quantityValue = parseInt(quantity.substring(0, i+1));
                break;
            } else {
                continue;
            }
        }
        if(!(quantityUnit.equalsIgnoreCase("cm")))
            return "Not Equal";
        else if(quantityValue!=1)
            return "Not Equal";
        else
            return "Equal";
    }
}

