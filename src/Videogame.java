/**

 Videojuego is a class that represents a video game with its name, synopsis, played hours and game code.
 The class contains two constructors to initialize the object's attributes, one with a score limit per hour
 and one without it. It also contains a static method to generate a user's score, based on played hours and
 the user's number of strikes in the game.
 */
import java.util.Scanner;

public class Videogame {
    /**
     * The number of played hours in the video game.
     */
    public static int hoursPlayed;
    /**
     * The score limit per hour of the video game.
     */
    public double hoursplayedLimit;
    /**
     * The name of the video game.
     */
    private final String name;
    /**
     * The synopsis of the video game.
     */
    private final String synopsis;

    /**
     * The code of the video game.
     */
    public static String gameCode;
    /**
     * Constructor that initializes the object's attributes of Videojuego.
     * @param hoursPlayed The number of played hours in the video game.
     * @param name The name of the video game.
     * @param synopsis The synopsis of the video game.
     * @param gameCode The code of the video game.
     */
    Videogame(int hoursPlayed, String name, String synopsis, String gameCode){
        this.hoursplayedLimit =2.1;
        this.name =name;
        this.synopsis =synopsis;
        Videogame.hoursPlayed =hoursPlayed;
        Videogame.gameCode =gameCode;
    }
    /**
     * Constructor that initializes the object's attributes of Videojuego with a score limit per hour.
     * @param hoursPlayed The number of played hours in the video game.
     * @param hoursplayedLimit The score limit per hour of the video game.
     * @param name The name of the video game.
     * @param synopsis The synopsis of the video game.
     * @param gameCode The code of the video game.
     */
    Videogame(int hoursPlayed, double hoursplayedLimit, String name, String synopsis, String gameCode){
        this.hoursplayedLimit =hoursplayedLimit;
        this.name =name;
        this.synopsis =synopsis;
        Videogame.hoursPlayed =hoursPlayed;
        Videogame.gameCode =gameCode;
    }

    /**
     * Generate the score of the user based on played hours and the user's number of strikes in the game.
     * @param u1 The user to generate the score for.
     * @return The user's score or 0 if the user has 3 or more strikes.
     */
    public static double generarPuntuacionUsuario(Usuario u1){
        Scanner in=new Scanner(System.in);
        double score=0;
        Videogame.hoursPlayed = in.nextInt();
        for (int i = 0; i < hoursPlayed; i++) {
            switch (u1.numeroStrikes){
                case 0 -> score+=1.0;
                case 1 -> score+=1.02312;
                case 2 -> score+=1.22312;
                default -> {return 0;}
            }
            score+=1.02312;
        }
        return score;
    }
}
