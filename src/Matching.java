public class Matching {
    public static void main(String [] args){

        /* test statements

        char [] test1a = "".toCharArray();
        char [] test1b = "".toCharArray();
        char [] test2a = "".toCharArray();
        char [] test2b = "a".toCharArray();
        char [] test3a = "Hello World".toCharArray();
        char [] test3b = "World".toCharArray();
        char [] test4a = "World".toCharArray();
        char [] test4b = "Hello World".toCharArray();
        char [] test5a = "Hello World".toCharArray();
        char [] test5b = "lo W".toCharArray();

        System.out.println(find(test1a, test1b));
        System.out.println(find(test2a, test2b));
        System.out.println(find(test3a, test3b));
        System.out.println(find(test4a, test4b));
        System.out.println(find(test5a, test5b));
        */

    }

    //project code
    public static int find(char [] arg1, char [] arg2){
        if (arg2.length == 0){
            return 0;
        }
        if (arg2.length > arg1.length){
            return -1;
        }
        for(int i = 0; i < arg1.length-1; i++){
            if (arg2[0] == arg1[i]){
                if (arg2.length == 1){
                    return i;
                }
                int counter = 1;
                for(int j = 1; j < arg2.length; j++){
                    if (arg2[j] == arg1[i+j]){
                        counter+=1;
                    }
                }
                if (counter == arg2.length){
                    return i;
                }
            }
        }
        return -1;
    }
}
