import java.util.List;

public class BubbleSort implements Strategy {
    @Override
    public void sort(List<Integer> list) {
        System.out.print("Sort by Bubble Sort: ");
        int n = list.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {

                break;
            }
        }
    }

}
