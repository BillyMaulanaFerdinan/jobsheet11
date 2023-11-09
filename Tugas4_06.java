public class Tugas4_06 {
  public static void main(String[] args) {

    String dataAtlet[][] = {
        { "Gilang", "Badminton" },
        { "Fajar", "Badminton" },
        { "Erik", "Badminton" },
        { "Hikmah", "Badminton" },
        { "Diaz", "Badminton" },
        { "Heru", "Tenis Meja" },
        { "Tora", "Tenis Meja" },
        { "Adit", "Tenis Meja" },
        { "Aziz", "Tenis Meja" },
        { "Rocky", "Tenis Meja" },
        { "Wahib", "Basket" },
        { "Adib", "Basket" },
        { "Farel", "Basket" },
        { "Dedy", "Basket" },
        { "Brian", "Basket" },
        { "Billy", "Bola Voly" },
        { "Alex", "Bola Voly" },
        { "Gopal", "Bola Voly" },
        { "Yaya", "Bola Voly" },
        { "Upin", "Bola Voly" }

    };

    for (int i = 0; i < dataAtlet.length - 1; i++) {
      for (int j = 0; j < dataAtlet.length - i - 1; j++) {
        if (dataAtlet[j][0].compareTo(dataAtlet[j + 1][0]) > 0) {
          String[] temp = dataAtlet[j];
          dataAtlet[j] = dataAtlet[j + 1];
          dataAtlet[j + 1] = temp;
        }
      }
    }

    System.out.println("\nInformasi Atlet Porseni 2024:");
    for (String[] atlet : dataAtlet) {
      System.out.println("Nama: " + atlet[0] + ", Cabang: " + atlet[1]);
    }

  }
}