    public class MaxMin {
    int[] array;
    int max, min;

    public MaxMin(int n) {
        //create array with size n
        array = new int[n];
        //assign random value into the array
        for (int i = 0; i < n; i++) {
            array[i] = (int) Math.round(Math.random() * 12 + 26);
        }
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void dacMaxMini() {
        dacMaxMin(0, array.length - 1);
    }

    public void dacMaxMin(int i, int j) {
        int max1, min1, mid;
        // Let a[0:n-1] be a global array.
        if (i == j) {
            max = min = array[i];
            // Small problem
        } else if (i == j - 1) {
            // Another case of small problem
            if (array[i] < array[j]) {
                max = array[j];
                min = array[i];
            } else {
                max = array[i];
                min = array[j];
            }
        } else {
            //If the problem is not small, divide it into subproblems.
            //Find where to split the set.
            mid = (i + j) / 2;
            // Solve the subproblems.
            dacMaxMin(i, mid);
            max1 = max;
            min1 = min;
            dacMaxMin(mid + 1, j);
            // Combine the solutions.
            if (max < max1) {
                max = max1;
            }
            if (min > min1) {
                min = min1;

            }
        }
    }

    public static void main(String[] a) {
        MaxMin m = new MaxMin(20);
        System.out.println("Contents of the Array");
        m.print();
        m.dacMaxMini();
        System.out.println("In this array maximum element : " + m.getMax());
        System.out.println("In this array minimum element : " + m.getMin());
    }
}
