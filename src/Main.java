import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario(0, "ABCDEF", "Juan", "Pereira", "32659841G", "c/Don Domingo", LocalDate.of(1986, Month.APRIL, 12),LocalDate.of(2020, Month.NOVEMBER, 12));
        SistemaAntiTrampa s1 = new SistemaAntiTrampa();
        s1.comprobarPuntuacionUsuaro(u1);
        System.out.println(u1.numeroStrikes);
        s1.comprobarInformacionUsuario(u1);
        Productos p1 = new Productos("Game", 13.14, "Goat Simulator");
        System.out.println(p1.Codigo);
        u1.hacerCompra(p1);
    }
}