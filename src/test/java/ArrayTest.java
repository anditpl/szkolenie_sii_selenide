import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Lukasz Krause
 * Date: 13.03.2021
 */
public class ArrayTest {

    String[]strings = {"a","b","c"};

    @Test
    public void test(){
        System.out.println(Arrays.asList(strings));
        strings[0]="a1";
        System.out.println(Arrays.asList(strings));

        List<String> arr = new ArrayList<String>();
        arr.add("a");
        System.out.println(arr);
        arr.add("b");
        System.out.println(arr.contains("a"));
        System.out.println(arr.contains("c"));


    }


}
