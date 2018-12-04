import java.util.Comparator;

class Comparador implements Comparator<Jugador> {

  @Override
  public int compare(Jugador j1, Jugador j2) {
    return Double.compare(j1.getHabilidad(), j2.getHabilidad());
  }
}
