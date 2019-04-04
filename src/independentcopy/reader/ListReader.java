/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package independentcopy.reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListReader implements Reader {

    
    @Override
    public String readln() {
        
        Scanner input = new Scanner(System.in);
        int selection = 0;
        do
        {
                
            System.out.println("Enter a item number to return (1-5)");
        
            String inputString = input.nextLine();
            try
            {
                selection = Integer.parseInt(inputString);
            }
            catch(Exception e)
            {
                selection = -1;
            }
            
            if(selection > 5 || selection < 1)
            {
                System.out.println("Invalid Selection");
            }
            
        }while(selection > 5 || selection < 1);
        
        
        List<String> stringList = new ArrayList<String>();
        stringList.add("Line 1 from Reader's List");
        stringList.add("Line 2 from Reader's List");
        stringList.add("Line 3 from Reader's List");
        stringList.add("Line 4 from Reader's List");
        stringList.add("Line 5 from Reader's List");
        
        return stringList.get(selection-1);
        
    }

}
