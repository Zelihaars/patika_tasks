import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value){
        for(int i :arr){
            if(i==value){
                return true;
            }
        }
        return  false;
    }
    public static void main(String[] args) {
    int[] list={4,8,4,6,9,10,8,1,33,9,6};
    int[] duplicate=new int[list.length];
    int startIndex=0;

    for(int i = 0;i<list.length;i++){
        for(int j=0;j<list.length;j++){
                if((i!=j)&&(list[i]==list[j])){

                        if(!isFind(duplicate,list[i])){
                            duplicate[startIndex++]=list[i];
                        }
                        break;
                    }

        }

        }
    for (int value:duplicate){
        if ((value!=0)&&(value%2==0)){
            System.out.print(" "+ value);
        }
    }



    }
}