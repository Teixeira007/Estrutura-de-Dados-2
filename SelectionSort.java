public class SelectionSort{

    public static int[] SelectionSortInteractive(int[] list){
        for(int j = 0; j< list.length-1; j++){
            int min_index = j;
            for(int i=j; i<list.length; i++){
                if(list[i] < list[min_index]){
                    min_index = i;
                }
            }
            if(list[j] > list[min_index] ){
                int aux = list[min_index];
                list[min_index] = list[j];
                list[j] = aux;
            }
        }
        return list;
    }



    public static void main(String[] args){
        int lista[] = {5,3,1,2,4};
        SelectionSortInteractive(lista);

        for(int i=0; i<lista.length; i++){
            if(lista[i] != lista[lista.length-1]){
                System.out.print(lista[i]+ ", ");
            }else{
                System.out.println(lista[i]);
            }
        }
        
    }
}