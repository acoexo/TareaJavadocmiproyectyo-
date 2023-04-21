/**
 * The SistemaAntiTrampa class checks for any cheating behavior from users in the system and takes appropriate actions.
 */
public class SistemaAntiTrampa {
    private final double puntuacionTiempo;

    /**
     * Constructs a new SistemaAntiTrampa object and calculates the threshold for a user's score to be considered suspicious.
     */
    SistemaAntiTrampa(){
        // The threshold for a user's score to be considered suspicious is double their hours played.
        this.puntuacionTiempo= Videogame.hoursPlayed *2;
    }

    /**
     * Checks a user's score against the suspicious score threshold and increases their strike count if necessary.
     *
     * @param u1 the user to check
     */
    public void comprobarPuntuacionUsuaro(Usuario u1){
        if(Videogame.generarPuntuacionUsuario(u1)>puntuacionTiempo){
            u1.numeroStrikes++;
        }
    }

    /**
     * Checks the reports made on a user and takes appropriate actions if necessary.
     *
     * @param u1 the user to check
     */
    public void comprobarReportes(Usuario u1){
        // Not implemented yet
    }

    /**
     * Suspends a user's account if necessary.
     *
     * @param u1 the user to suspend
     */
    public void suspenderUsuario(Usuario u1){
        // Not implemented yet
    }

    /**
     * Checks the user's registration code and displays their strike count if it matches the expected code.
     * Additional checks or actions can be added as necessary.
     *
     * @param u1 the user to check
     */
    public void comprobarInformacionUsuario(Usuario u1){
        String databaseRegisterCode = "ABCDEFG";
        if(Usuario.codigoRegistro.equals(databaseRegisterCode)){
            System.out.println("Número de Strikes: "+u1.getNumeroStrikes());
        }
    }
}