package Stacks;

/**
 * Created by AntonioRang on 9/14/17.
 */
public class Main {
    public static void main(String[] args) {

        Object[] values = {3,2,1,2,3};
        Stack<Integer> istack = new Stack<Integer>();
        Stack<Integer> hs1 = new Stack<Integer>();
        Stack<Integer> hs2 = new Stack<Integer>();
        Stack<Integer> ostack = new Stack<Integer>();

        for(int i =0; i< values.length; i++){
            istack.push(i);
        }



        while(!istack.empty()) {
            Integer j = new Integer(istack.peek());
            switch (j) {
                case 1:
                    ostack.push(j);
                    istack.pop();
                    break;
                case 2:
                    hs1.push(j);
                    istack.pop();
                    break;
                case 3:
                    hs2.push(j);
                    istack.pop();
                    break;
            }
        }

        while(hs2.empty()){

        }

        System.out.println(istack.toArray());


    }
}
