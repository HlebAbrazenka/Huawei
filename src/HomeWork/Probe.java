
package HomeWork;

import java.util.Arrays;
        import java.util.Arrays;

    public class Probe {
        public static void main(String[] args) {
            int [] array = new int[5];

            for (int i = 0; i < array.length; i++) {
                array[i] = (int)(Math.random()*90)+10;
            }
            System.out.println(Arrays.toString(array));

            boolean number = true;
            for (int i = 1; i < array.length; i++) {
                if(array[i]<=array[i-1]){
                    number = false;
                    break;
                }
            }
            if(number){
                System.out.println("Array is the return sequence");
            } else {
                System.out.println("Array is not the return sequence");
            }
        }
    }

