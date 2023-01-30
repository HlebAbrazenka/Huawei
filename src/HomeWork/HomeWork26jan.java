package HomeWork;

import java.util.Arrays;

public class HomeWork26jan {

    public static void main(String[] args) {
        int[] massif = new int[8];
        for (int i = 0; i < massif.length; i++) {
            massif[i] = (int) (Math.random() * 50) + 1;
        }
        System.out.println(Arrays.toString(massif));

        for (int i = 0; i < massif.length; i++) {
            if (i % 2 == 1) {
                massif[i] = 0;
            }
        }

        System.out.println(Arrays.toString(massif));


//----------------------------------------------------//


        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 90) + 10;
        }
        System.out.println(Arrays.toString(array));

        boolean num = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                num = false;
                break;
            }
        }
        if (num) {
            System.out.println("Array is the return sequence");
        } else {
            System.out.println("Array is not the return sequence");
        }

        //--------------------------------------------------------------------//
        }


    }
