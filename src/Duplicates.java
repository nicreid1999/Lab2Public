public class Duplicates {
    public static void main(String [] args){
        /*
        // test statements

        int [] test1 = {};
        int [] test2 = {-1, 1};
        int [] test3 = {4,22,100,99,1,5,7};
        int [] test4 = {4,22,100,99,22,5,7};
        System.out.println(noDuplicates(test1));
        System.out.println(noDuplicates(test2));
        System.out.println(noDuplicates(test3));
        System.out.println(noDuplicates(test4));
        */
    }
    public static boolean noDuplicates(int [] arg){
        for (int i = 0; i < arg.length-2; i++){
            for (int j = i+1; j < arg.length-1; j++){
                if (arg[i] == arg[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
