public class array {

    public static void main(String[] args) {
        int[] numbersArray = new int[10];
        numbersArray[0] = 17;
        numbersArray[1] = 34;
        numbersArray[2] = 98;
        numbersArray[3] = 78;
        numbersArray[4] = 65;

        for (int i = numbersArray.length-1; i >=0; i--) {
            //System.out.println(numbersArray[0]);
            if(numbersArray[i]== 65){
                System.out.println("Found"+numbersArray[i]);
            }
        }
    }
} 