public class Mountain {
    public static boolean isIncreasing(int[] array, int stop) {
        // To be implemented.
        for(int j = 0; j<stop; j++){
            if(array[j] >= array[j+1]) return false;
        }
        return true;
    }

    public static boolean isDecreasing(int[] array, int start) {
        // To be implemented.
        for(int i = start; i < array.length - 1; i ++){
            if(array[i] <= array[i+1]) return false;
        }
        return true;
    }

    public static int getPeakIndex(int[] array) {
        // To be implemented.
        for(int i = 1; i < array.length - 1; i++){
            if(array[i] > array[i-1] && array[i] > array[i+1]) return i;
        }
        return -1;
    }

    public static boolean isMountain(int[] array) {
        // To be implemented.
        int peak = getPeakIndex(array);
        if(peak == -1) return false;
        return isIncreasing(array,peak) && isDecreasing(array,peak);
    }
}

