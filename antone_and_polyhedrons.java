import java.util.Scanner;

public class antone_and_polyhedrons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_polyhedrons = scanner.nextInt();
        int total_number_of_faces = 0;

        for (int i = 0; i < number_of_polyhedrons; i++) {

            String name_of_polyhedron = scanner.next();

            if (name_of_polyhedron.equals("Tetrahedron")) {
                total_number_of_faces += 4;
            } else if (name_of_polyhedron.equals("Cube")) {
                total_number_of_faces += 6;
            } else if (name_of_polyhedron.equals("Octahedron")) {
                total_number_of_faces += 8;
            } else if (name_of_polyhedron.equals("Dodecahedron")) {
                total_number_of_faces += 12;
            } else if (name_of_polyhedron.equals("Icosahedron")) {
                total_number_of_faces += 20;
            }
        }

        System.out.println(total_number_of_faces);

        scanner.close();
    }
}
