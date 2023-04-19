class Main {
  public static void main(String[] args) {
    String[] tab = { "A", "a", "b", "c", "D", "f", "C" ,"s","z"};
        int iloscZmian = 0;

        System.out.println("Oryginalna tablica znaków: ");
        for (int j = 0; j < tab.length; j++) {
            System.out.print(tab[j] + " ");
        }

        System.out.println("\nTablica po zamianie: ");
        for (int j = 0; j < tab.length; j++) {
            if (tab[j].length() == 1 && Character.isLowerCase(tab[j].charAt(0))) {
                tab[j] = tab[j].toUpperCase();
                iloscZmian++;
            }
            System.out.print(tab[j] + " ");
        }

        System.out.println("\nIlość dokonanych zmian: " + iloscZmian);  
    
  }
}   
