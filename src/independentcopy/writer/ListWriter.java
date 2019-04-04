/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package independentcopy.writer;

import java.util.ArrayList;
import java.util.List;


public class ListWriter implements Writer{

    List<String> stringList = new ArrayList<String>();
    
    
    @Override
    public void writeln(String line) {
        stringList.add(line);
        System.out.println("Successfully added " + stringList.get(stringList.size()-1) + " to Writer's List.");
    }

}
