package opgave02;

public class Opgave02 {
    public static void main(String[] args) {
        String[] names = {"Erna", "Elly", "Laurits", "Bertha", "Christian",
                "August", "Marius", "John", "Tove", "Poul", "Torkild"};

        printArray(names);
        bubbleSort(names);
        printArray(names);
    }


    private static void bubbleSort(String[] names) {

    }

    private static void printArray(String[] names) {
        System.out.printf("[" + String.join(", ", names) + "]\n");
    }
}
