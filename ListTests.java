import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;
import org.junit.*;

class Stinky implements StringChecker{
    String s;
    Stinky(String s){
        this.s = s;
    }
    public boolean checkString(String s){
        if (s.contains("toad")){
            return true;
        }
        return false;
    }
}

public class ListTests {
    
    @Test
    public void testFilter() {
        List<String> input1 = new ArrayList<>(){"toad", "toads", "toes", "frog", "toads on roads"};
        Stinky str1 = new Stinky("toad");
        String[] input2 = {};
        String[] input3 = {"toad"};
        List<String> output1 = ListExamples.filter(input1, str1);
        assertEquals(3, output1.size());
    }

    @Test 
    public void testMerge() {

    }
}
