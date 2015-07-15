/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungergames;

//import byui.cit260.hungerGames.model.Inventory;
import byui.cit260.hungerGames.exceptions.ProgramControlException;
import byui.cit260.hungerGames.model.Player;
import byui.cit260.hungerGames.model.Game;
import byui.cit260.hungerGames.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class HungerGames {

    private static Game currentGame = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        HungerGames.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        HungerGames.player = player;
    }
    private static Player player = null;

    public static void main(String[] args) throws ProgramControlException {

        try {

            HungerGames.inFile = new BufferedReader(new InputStreamReader(System.in));
            HungerGames.outFile = new PrintWriter(System.out, true);

            String filePath = "log.txt";
            HungerGames.logFile = new PrintWriter(filePath);

            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            try {
                startProgramView.startProgram();
            } catch (Throwable te) {
                System.out.println(te.getMessage());
                te.printStackTrace();
                startProgramView.startProgram();
            }
        } catch (Throwable e) {

            System.out.println("Exception: " + e.toString() + "\nCause: " + e.getCause() + "\nMessage: " + e.getMessage());

            e.printStackTrace();;
        } finally {
            try {
                if (HungerGames.inFile != null) {
                    HungerGames.inFile.close();
                }

                if (HungerGames.outFile != null) {
                    HungerGames.outFile.close();
                }
                if (HungerGames.logFile != null) {
                    HungerGames.logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing files.");
                return;
            }
        }
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        HungerGames.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        HungerGames.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        HungerGames.logFile = logFile;
    }

}
