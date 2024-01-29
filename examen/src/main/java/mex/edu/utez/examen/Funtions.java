package mex.edu.utez.examen;

public class Funtions {
    public static void main(String[] args) {
        // Test generateFolio
        System.out.println(generateFolio("El principito",
                "Antoine de Saint-Exupéry",
                "978-3-16-148410-0",
                "1943-04-06"));
    }

    public static String generateFolio(String title, String author, String ISBN, String date) {
        String folio = "";
        folio += title.charAt(0);
        folio += author.charAt(0);
        folio += author.substring(1, 3);
        folio += date;
        folio += ISBN.substring(0, 4);
        folio += (int) (Math.random() * 10);
        folio += (int) (Math.random() * 10);
        return folio.toUpperCase();
    }

}
