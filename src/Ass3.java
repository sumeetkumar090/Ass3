import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ass3 {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		// System.out.println("Please enter the filename: ");
		// String filename = userinput.next();

		Scanner fileinput = null;
		try {
			fileinput = new Scanner(new File("test.txt"));
			int nVertices = fileinput.nextInt();
			int nEdges = fileinput.nextInt();
			System.out.println(nVertices + "\t" + nEdges);
			System.out.println("-----------------------------------------------------------");
			for (int i = 0; i < nVertices; i++) {
				String label = fileinput.nextLine().trim();
				int xCoordinate = fileinput.nextInt();
				int yCoordinate = fileinput.nextInt();
				System.out.print(label + "\t" + xCoordinate + "\t" + yCoordinate + "\n");
			}
//			while (fileinput.hasNextLine()) {
//				System.out.print(label + "\t" + xCoordinate + "\t" + yCoordinate + "\n");
//				continue;
//			}

			while (fileinput.hasNext()) {
				String startLabel = fileinput.next().trim();
				String endLabel = fileinput.next().trim();
				int weight = fileinput.nextInt();
				System.out.print(startLabel + "\t" + endLabel + "\t" + weight + "\n");
				break;
			}
			while (fileinput.hasNext()) {
				int startVertex = fileinput.nextInt();
				int endVertex = fileinput.nextInt();
				System.out.println(startVertex + "\t" + endVertex);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Unable to open the file");
		}
	}

}
