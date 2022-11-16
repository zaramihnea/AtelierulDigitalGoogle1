package Basics.ch2;

public class Main {

    public static void main(String[] args) {
        int[] myArray = new int[]{3, 2, -2, -2, 3, 0};
        for (int i = 1; i <= myArray.length; i++) {
            System.out.println(myArray[i] + " ");
        }

        int[] newArray = new int[myArray.length];
        int nr = 0, contor = 0;

        for (int i = 0; i < myArray.length; i++) {
            boolean ok = false;
            for (int j = 0; j < myArray.length; j++) {
                if (myArray[i] == newArray[j]) {
                    ok = true;
                }
            }
            if (ok = false) {
                newArray[nr++] = myArray[i];
            }
        }
        System.out.println(" ");
        for (int i = 0; i < nr; ++i) {
            System.out.println(newArray[i] + " ");
        }
        for (int i = 0; i < nr; i++) {
            for (int j = i + 1; j < nr; j++) {
                if (newArray[i] + newArray[j] == 0) {
                    contor++;
                }
            }
        }
        System.out.println(contor + " ");
    }
}
