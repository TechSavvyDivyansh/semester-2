import java.util.*;

class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, k, n;
        ArrayList<Integer> ar = new ArrayList<>();

        i = 1;
        while (i != 0) {
            ar.add(in.nextInt());
            System.out.println("Do you want to add more numbers?Enter 1 for yes and 0 for no");
            i = in.nextInt();
        }
        System.out.println("arraylist:" + ar);
        System.out.println("Do you want to delete any element?enter 1 for yes and 0 for no");
        k = in.nextInt();
        switch (k) {
            case 1: {
                System.out.println("Enter the index of element to be removed");
                n = in.nextInt();
                ar.remove(n);
                break;
            }
            case 0: {
                System.out.println("Okay no element deleted");
                break;
            }
            default: {
                System.out.println("Wrong choice");
            }

        }
        System.out.println("Final collection");
        System.out.println(ar);
        Collections.sort(ar);
        System.out.println(ar);

    }
}