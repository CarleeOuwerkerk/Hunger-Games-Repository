/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class PresentationExamples {
    
        public void main(String[] args){
            
            double albertaGST = 0.05;
            
            double vehiclePrice = 20000.50;
            
            Balance balance = new Balance();
            
            double totalBalance = balance.getTotalBalance(vehiclePrice, 10, albertaGST);
        }

    public class Balance {

        public double getTotalBalance(double price, long quantity, double GSTRate) {
            
            double subtotal = price * quantity;
            double tax = subtotal * GSTRate;
            double totalCost = subtotal + tax;
            
            return totalCost;
        }
    }

}


