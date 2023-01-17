public class LoopsExample {
    // create three separate loops that count the numbers 1-100 in the console


    public static void main(String args[]){
        int count = 500;
        for (int i = 0; i <= count; i++){
            System.out.println(i+1);
        }

        int x = 100;
        while(x <= 99){
            System.out.println(x+1);
            x += 1;
        }

        do{
            System.out.println(x);
        }while(x <= 99);

        int a = 2;
        int b = 4;
        int[][] arr = new int[a][b];
        for (int row=0; row < a ; row++){

            for(int col=0; col<b; col++){

                multiDimensional(); 
        }
 }

}

static void multiDimensional(int x, int y){
    // Save integers as strings
    // concatenate strings
    // convert string back to integer
}


    // These loops are known as blocking loops



}