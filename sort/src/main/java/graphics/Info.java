package graphics;

public class Info {
    public static void info(int[] sortArray) {
        int len = 30; // максимальная длина
        int maxValue = sortArray[sortArray.length - 1]; // максимальное значение
        for(int i = 0; i < sortArray.length; i++) {
            int currLen = (sortArray[i] * len) / maxValue;
            if (currLen != 0) {
                for(int j = 0; j < currLen; j++) {
                    System.out.print("#");
                }
            } else {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
