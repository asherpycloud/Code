package CCL1.C202109;

public class C010SequentialSearch2 {
    public static void main(String[] args){
        int[] hi = {3, 5, 7, 9, 10, 10};
        int index = seqSearch(hi, 10);
        System.out.println(index);
        int[] hi2 = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int index2 = seqSearch(hi2, 11);
        System.out.println(index2);
    }

    public static int seqSearch(int[] list, int item){
        int location = -1;
        boolean found = false;
        for(int i = 0; i<list.length && !found; i++){
            if(list[i] == item){
                location = i;
                found = true;
            }
        }
        return location;
    }
}
