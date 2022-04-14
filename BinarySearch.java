public class BinarySearch{

    //Busca Binaria Recursiva
    public static int BinarySearchRecursive(int key, int[] orderedList, int begin, int end){
        

        if(begin <= end){
            int mind = (begin + end)/2;
            if(orderedList[mind] == key){
                return mind;
            }else if(key < orderedList[mind]){
                return BinarySearchRecursive(key, orderedList, 0, mind-1);
            }else if(key > orderedList[mind]){
                return BinarySearchRecursive(key, orderedList, mind+1, end);
            }
        }

        return -1;

    }

    public static int BinarySearchRecursive(int key, int[] orderedList){
        return BinarySearchRecursive(key, orderedList, 0, (orderedList.length)-1);
    }


    //Busca Binaria Interativa
    public static int BinarySearchInteractive(int key, int[] orderedList){
        return BinarySearchInteractive(key, orderedList, 0, (orderedList.length)-1);
    }

    public static int BinarySearchInteractive(int key, int[] orderedList, int begin, int end){

        int mind = (begin+end)/2;
        
        while(begin <= end){
            if(key < orderedList[mind]){
                end = mind-1;
            }else if(key > orderedList[mind]){
                begin = mind+1;
            }else{
                return mind;
            }

            mind = (begin+end)/2;
        }

        return -1;
    }
    
    // Teztes main
    public static void main(String[] args){
        int lista[] = {4,7,9,11,22,33};//,35,38,40,43,48,49,55,59,60,79,88,93,200};
      
        System.out.println("Binary Search Recursive - index "+BinarySearchRecursive(33, lista));
        System.out.println("Binary Search Interactive - index "+BinarySearchInteractive(4, lista));


    }

}
