public class InsertionSort {
    public static void main(String[] args) {
        double[] list = {2, 6, 5, 3, 1, 9, 4.5, 6.6, 5.7, -4.5, -2, 12, 10};
        printList(list);
        insertionSort(list);
    }

    private static void printList(double[] list) {
        for (double v : list) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static void insertionSort(double[] list) {
        System.out.println("bắt đầu với phần tử thứ hai của mảng vì phần tử đầu tiên " +
                "trong mảng được coi là đã được sắp xếp.");
        double currentElement;
        int currentIndex;
        for (int i = 1; i < list.length; i++) {
            currentElement = list[i];
            currentIndex = i;
            System.out.println("Current element: " + list[i]);

            while (currentIndex > 0 && currentElement < list[currentIndex - 1]) {
                System.out.println("Move " + list[currentIndex - 1] + " to index " + currentIndex);
                list[currentIndex] = list[currentIndex - 1];
                currentIndex--;
                printList(list);
            }

            if (currentElement != list[currentIndex]) {
                System.out.println("Put " + currentElement + " to index " + currentIndex);
                list[currentIndex] = currentElement;
            }

            System.out.print("List after the '" + i + "' sort: ");
            printList(list);
        }
    }
}
