public class ArrEx {
    public static void main(String[] args) throws Exception {
        int[] ages = {3,9,23,64,2,8,28,93};

        System.out.println(subArr(ages));
        System.out.println(avgArr(ages));
    }

    public static int subArr(int[] ages){

        int ind = ages.length - 1;
        int lst = ages[ind];
        int frst = ages[0];

        int diff = lst - frst;
        return diff;
    }

    public static int avgArr(int[] ages){
        
        int avgSum = 0;

        for (int i = 0; i < ages.length; i++){
            avgSum += ages[i];
        }

        int res = avgSum / ages.length;

        return res;
    }

    public static void enlargeArr(int[] arr){
        int size = arr.length + 1;
        int[] newArr= new int[size];

        newArr = arr.clone();


    }
}
