package CCL1.C202109;

public class C010SequentialSearch {
    public static void main(String[] args){
        int[] hi = {3, 5, 7, 9, 11, 11};
        int index = seqSearch(hi, 11);
        System.out.println(index);
        int[] hi2 = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        int index2 = seqSearch(hi2, 11);
        System.out.println(index2);
    }

    public static int seqSearch(int[] list, int item){
        int location = -1;
        for(int i = 0; i<list.length; i++){
            if(list[i] == item)
                location = i;
        }
        return location;
    }
}

