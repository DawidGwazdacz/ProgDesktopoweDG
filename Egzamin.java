public class Egzamin {

     // Funkcja do wypełnienia sita Eratostenesa
     public static void wypelnijSito(boolean[] liczbyPierwsze) {
        
        int n = liczbyPierwsze.length;
        
        // Inicjalizacja, wszystkie liczby są uznane za pierwsze na początku
        for (int i = 2; i < n; i++) {
            liczbyPierwsze[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (liczbyPierwsze[i]) {
                for (int j = i * 2; j < n; j += i) {
                    liczbyPierwsze[j] = false;
                }
            }
        }
    }

    // Funkcja do wyświetlenia znalezionych liczb pierwszych
    public static void wyswietlLiczbyPierwsze(boolean[] liczbyPierwsze) {
        System.out.println("Liczby pierwsze w przedziale 2..100:");
        for (int i = 2; i < liczbyPierwsze.length; i++) {
            if (liczbyPierwsze[i]) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 100;
        
        // tablica na liczby pierwsze
        boolean[] liczbyPierwsze = new boolean[n + 1];
        wypelnijSito(liczbyPierwsze);
        wyswietlLiczbyPierwsze(liczbyPierwsze);
    }

   
}