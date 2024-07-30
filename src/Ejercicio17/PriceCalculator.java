package Ejercicio17;

public class PriceCalculator {
   private int quantity;

   public int getQuantity() {
       return quantity;
   }

   public void setQuantity(int quantity) {
       this.quantity = quantity;
   }

   public int calculatePrice() {
       if (quantity > 0 && quantity <= 499) {
           return quantity * 120;
       } else if (quantity >= 500 && quantity <= 749) {
           return quantity * 100;
       } else if (quantity >= 750 && quantity <= 999) {
           return quantity * 80;
       } else if (quantity >= 1000) {
           return quantity * 50;
            }
       return -1;
        }
}


