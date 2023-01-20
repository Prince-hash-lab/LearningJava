package SOLID.java;

// S : Single Responsibility Principle (SRP)----->implemented in this program

// O : Open closed Principle (OSP)----->implemented in this program

// L : Liskov substitution Principle (LSP)

// I : Interface Segregation Principle (ISP)

// D : Dependency Inversion Principle (DIP)----->implemented in this program

// public class Debitcard {
//     public void doTransaction(int amount) {
//         System.out.println("tx done with DebitCard");
//     }
// }


// public class CreditCard{
//     public void doTransaction(int amount){
//             System.out.println("tx done with CreditCard");
//         }
//     }
public class shoppingmall {
    private Debitcard debitCard;

public shoppingmall(Debitcard debitCard) {
        this.debitCard = debitCard;
   }

    public void doPayment(Object order, int amount) {
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        Debitcard debitCard = new Debitcard();
        shoppingmall shoppingMall = new shoppingmall(debitCard);
        shoppingMall.doPayment("some order", 5000);
    }
}
