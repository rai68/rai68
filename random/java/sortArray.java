    public class Main {    
      public static void main(String[] args) {        
        //define original array     
        int [] intArray = new int [] {52,45,32,64,12,87,78,98,23,7};     

        int [] newArray = Sort(intArray);

        //print sorted array    
        System.out.println("\nArray sorted in ascending order: ");    
        for (int i = 0; i <newArray.length; i++) {     
            System.out.print(newArray[i] + " ");    
        }    
    }  
    //Sort the array in ascending order using two for loops    
    static int [] Sort(int [] intArray) {
        int bigTemp = 0;
        for (int i = 0; i <intArray.length; i++) {     
          for (int j = i+1; j <intArray.length; j++) {     
              if(intArray[i] >intArray[j]) {      //swap elements if not in order
                 bigTemp = intArray[i];    
                 intArray[i] = intArray[j];    
                 intArray[j] = bigTemp;    
               }     
            }     
        }  
        return intArray;
    }
} 
