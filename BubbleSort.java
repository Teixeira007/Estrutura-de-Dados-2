public class BubbleSort {

    public static int[] BubbleSortInteractive(int[] list){
        for(int i=0; i<list.length-1; i++){
            for(int j=0; j<list.length-1; j++){
                if(list[j+1] < list[j]){
                    int aux = list[j];
                    list[j] = list[j+1];
                    list[j+1] = aux;
                }
            }
        }
        return list;
    }


    public static void main(String[] args){
        int lista[] = {8,3,2,6,2,7,1,9};

        BubbleSortInteractive(lista);
        for(int i=0; i<lista.length; i++){
            System.out.print(lista[i]+" ");
        }
    }
    
}