package baseline.functions;

import java.util.ArrayList;
import java.util.List;

public class Display {
    /* this is simply going to be a class to display all, incomplete, or complete items in a list.
    The default will be all shown, but the user can change it so it only shows complete, or incomplete, or all.
     */
    ArrayList<String[]> List;

    private void showAll(){
        //display all items in the List
    }

    private void showComplete(){
        //comb through each item, only showing if item[3].equals "complete"

    }
    
    private void showIncomplete(){
        //comb through each item, only showing if item[3].equals "incomplete"
    }

    private List<String[]> getArrayList(){
        //get the list
        return List;
    }
}
