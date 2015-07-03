package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.MapControl;
import byui.cit260.hungerGames.exceptions.MapControlException;
import byui.cit260.hungerGames.model.Player;
import java.awt.Point;
import java.util.Scanner;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class MapView{
    
    Player player = null;
    Point coordinates = null;
    
    private final String MAP = "\n"
            +"\n----------------------------------------------"
            +"\nPlease enter the coordinates of a location on "
            +"\nthe map. (row(no space)column)"
            +"\n----------------------------------------------";
    
    
    
    public void display(){
        
        String selection = " ";
        do {
            System.out.println(MAP);
            
            int coordinates = this.getInput();
//            selection = input.StringAt(0);
            
            this.doAction(selection);
        }
        
        while(selection != "B" || selection != "b");
            
    }
    
    private int getInput(){
        int input = -1;
//        Scanner keyboard = new Scanner(System.in);
//        String coordinates = "";
        
        while(input == -1){
            int coordinates = this.getInput();
//            coordinates = coordinates.trim().toUpperCase();
//                if (coordinates.equals("B"))
                break;
                
//            int coordinates = input.parseInt(input);
            
        try{
//            coordinates = Double.parseDouble(value);
        }catch (NumberFormatException nf){
            System.out.println("\n You must enter a valid coordinate.");
        }
        
        return coordinates;
        }
        return coordinates;
    }
    
//    Range r = new Range(0,255);
//Point<int,int> aPoint = new Point<int,int>(50,60,r);
// 
////Here we map the point to an int
//int mappedPoint = aPoint.x + aPoint.y * (r.Upper + 1);
// 
////Here we map the int back to a point
//int x = mappedPoint % (r.Upper + 1);
//int y = mappedPoint / (r.Upper + 1);
//Point<int,int> mappedPointFromInt = new Point<int,int>(x, y); 
    
    
    public void doAction(String choice) {
        try{
                    MapControl.movePlayerToLocation(player, coordinates);
                } catch (MapControlException me){
                    System.out.println(me.getMessage());
                }
        
//        switch(choice){
//            case "0, 0":
//                try{
//                    MapControl.movePlayerToLocation(player, coordinates);
//                } catch (MapControlException me){
//                    System.out.println(me.getMessage());
//                }
//                break;
//            case "0, 1":
//                
//                break;
//            case "0, 2":
//                
//                break;
//            case "0, 3":
//                
//                break;
//            case "0, 4":
//                
//                break;
//            case "0, 5":
//                
//                break;
//            case "1, 0":
//                
//                break;
//            case "1, 1":
//                
//                break;
//            case "1, 2":
//                
//                break;
//            case "1, 3":
//                
//                break;
//            case "1, 4":
//                
//                break;
//            case "1, 5":
//                
//                break;
//            case "2, 0":
//                
//                break;
//            case "2, 1":
//                
//                break;
//            case "2, 2":
//                
//                break;
//            case "2, 3":
//                
//                break;
//            case "2, 4":
//               
//                break;
//            case "2, 5":
//                
//                break;
//            case "3, 0":
//                
//                break;
//            case "3, 1":
//                
//                break;
//            case "3, 2":
//                
//                break;
//            case "3, 3":
//                
//                break;
//            case "3, 4":
//                
//                break;
//            case "3, 5":
//                
//                break;
//            case "4, 0":
//                
//                break;
//            case "4, 1":
//                
//                break;
//            case "4, 2":
//                
//                break;
//            case "4, 3":
//                
//                break;
//            case "4, 4":
//                
//                break;
//            case "4, 5":
//                
//                break;
//            case "5, 0":
//                
//                break;
//            case "5, 1":
//                
//                break;
//            case "5, 2":
//                
//                break;
//            case "5, 3":
//                
//                break;
//            case "5, 4":
//                
//                break;
//            case "5, 5":
//                
//                break;
//            case "B":
//                return;
//            default:
//                System.out.println("\n*** Invalid selection, try again. ***");
//                break;
//        }
    }
    
}

//        double value = Double.parseDouble(text);
            
//            System.out.println("SOMETHINE ABOUT ENTERING COORDINATES.");
            
//            coordinates = keyboard.nextLine();
//            coordinates = coordinates.trim();
//            
//            if(coordinates.length() < 2){
//                System.out.println("Invalid selection, please try again.");
//                continue;
//            }
//            break;