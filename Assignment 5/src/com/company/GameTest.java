/**
 * <h1>Printing Game Information via ArrayLists</h1>
 * <p>In this assignment we are asked to create a Game class
 * to demonstrate a Game object.
 * Then create a GameTest class to place the main method in,
 * which demonstrates the Game object. </p>
 * @author : Jana Batiya
 * @since : 11/28/2020
 * @version : 1.0*/

package com.company;

import java.util.ArrayList;
/**
 * This method is used to demonstrate the Game objects
 * @return nothing*/
public class GameTest {
    /**
     * This is the main method which makes use of the EmployeeTest method
     * @param args
     * @return args unused*/
    public static void main(String[] args) {
//      Creates 10 GameTest objects for each game and sets their values
        Game game1 = new Game(" Europa Universalis IV", " Grand Strategy", " Paradox Development Studio", 2013);
        Game game2 = new Game(" Mario", " Platform", " Nintendo", 1985);
        Game game3 = new Game(" Limbo", " Puzzle-Platform", " Playdead", 2010);
        Game game4 = new Game(" Inside", " Puzzle-Platform", " Playdead", 2016);
        Game game5 = new Game(" The Stanley Parable", " Adventure, Indie", " Galactic Cafe", 2011);
        Game game6 = new Game("Among Us", " Party, social-deduction", " InnerSloth", 2018);
        Game game7 = new Game(" The Legend of Zelda: Breath of the Wild", " action-adventure", " Nintendo", 2017);
        Game game8 = new Game(" Animal Crossing: New Horizons", " Life simulation", "Nintendo", 2020);
        Game game9 = new Game(" Hades", " action role-playing", " Supergiant Games", 2018);
        Game game10 = new Game(" Half-Life", " first-person shooter", " Valve", 1998);

//      Creates an Arraylist of type Game
        ArrayList<Game> list = new ArrayList<>();

//      Adds each object to the list
        list.add(game1);
        list.add(game2);
        list.add(game3);
        list.add(game4);
        list.add(game5);
        list.add(game6);
        list.add(game7);
        list.add(game8);
        list.add(game9);
        list.add(game10);


        int counter = 1; //counter starts from 1

//      while loop for specifying the order of which game's information to be displayed
        while(counter< list.size()) {
            // foreach loop for displaying each object on the list
            for (Game game : list) {
                System.out.println("\nGame " + counter);// Prints order of games
                System.out.printf("%nTitle:%s%nGenre:%s%nDeveloper:%s%nRelease:%d%n", game.getTitle(), game.getGenre(), game.getDeveloper(), game.getReleaseDate());
                System.out.println("\n");
                counter++;// increments by one each time an object is printed
            }


        }
    }
}
