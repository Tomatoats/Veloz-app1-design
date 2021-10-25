package baseline.functions;

import java.util.ArrayList;
import java.util.List;

public class Edit {
    /*This class is going to take in whatever text field is going to be edited, whether list name, title, due date, or
    or description. Depending on the item, some of them might have checks (due date has to be YYYY-MM-DD, title needs
    to be 3 characters long minimum, etc). Then return the new strings.
     */
    String ToEdit;
    ArrayList<String[]> List;
    String[] item;

    private void editListName(){
        //take the Arraylist and look at it's first element
        //take the item[0] of the element and equal it to ToEdit
    }

    private void editItemName(){
        //take the item[0] and equal it to ToEdit
    }

    private  void editDueDate(){
        //take the item[1] and equal it instead to ToEdit
        //if it isn't in the right format, go to Error
    }

    private  void editDescription(){
        //take the item[2] and equal it instead to ToEdit
    }

    private List<String[]> getArrayList(){
        //get the arrayList
        return List;
    }

    private String[] getItem(){
        //get the Item
        return item;
    }
    private void setToEdit(String input){
        //Set the string to whatever the user enters
        ToEdit = input;
    }
}
