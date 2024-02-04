public class App {


    static boolean isPalindromic(String str){
      
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(isPalindromic("kabak"));
    }
}

