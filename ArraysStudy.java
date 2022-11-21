//Arrays in Java
// Emmanuel Donkor
// 11/20/2022

import java.util.Arrays;

public class ArraysStudy {
    public static void main(String[] args) {
        char vowels[] = new char[5];
        char vowels2[] = {'a', 'e', 'i', 'o', 'u'};

        vowels[2] = 'a';
        vowels[3] = 'e';
        vowels[0] = 'i';
        vowels[1] = 'o';
        vowels[4] = 'u';

        System.out.println(vowels[2]);
        System.out.println(Arrays.toString(vowels));
        System.out.println(Arrays.toString(vowels2));

        // sorting and unsorting an array
        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));

        // searching for an element in a sorted array
        int foundItemIndex = Arrays.binarySearch(vowels2, 'o');
        System.out.println(foundItemIndex);

        // copying contents of an array
        char copyArray[] = Arrays.copyOf(vowels2, 5);
        System.out.println(Arrays.toString(copyArray));
            // copying a part of n array
        char copyArrayRange[] = Arrays.copyOfRange(vowels2, 1, 4);
        System.out.println(Arrays.toString(copyArrayRange));

        // comparing components of two arrays
        System.out.println(vowels2 == copyArray);
        System.out.println(Arrays.equals(vowels2, copyArray));
    }
}
