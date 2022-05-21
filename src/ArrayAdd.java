import java.util.Random;

public class ArrayAdd {
    public static void main(String[] args) {
        int[] pierwszaTablica = new int[5];
        int[] drugaTablica = new int[5];
        int[] trzeciaTablica = new int[pierwszaTablica.length + drugaTablica.length];
        Random random = new Random();

        for (int i = 0; i < pierwszaTablica.length; i++) {
            pierwszaTablica[i] = random.nextInt(50);
            System.out.print(" " + pierwszaTablica[i]);
        }
        System.out.println();
        for (int i = 0; i < drugaTablica.length; i++) {
            drugaTablica[i] = random.nextInt(50);
            System.out.print(" " + drugaTablica[i]);
        }
        System.out.println();
        for (int i = 0; i < pierwszaTablica.length; i++) {
            trzeciaTablica[i]=pierwszaTablica[i];

        }
//        for (int i = drugaTablica.length; i > 0; i++) {
//            trzeciaTablica[i]=drugaTablica[i];
//
//        }
        for(int x : trzeciaTablica){
            System.out.print(" " + x);
        }

    }
}
