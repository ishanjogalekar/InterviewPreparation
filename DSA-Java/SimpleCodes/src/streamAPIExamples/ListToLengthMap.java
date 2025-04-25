package streamAPIExamples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//small program to demonstrate simple functionality of stream API via Collector.toMap function
public class ListToLengthMap {
    public Map<String,Integer> convertListToLengthMap(List<String> list) {
        /*
        1. Invoke stream api object
        2. Use .collect method and call Collectors inside it
        3. With Collector call .toMap static method and in it pass 2 lambda functions
        4. First one as data in list -> Key , second one as that data length -> value of map
         */
        Map<String,Integer> result =  list.stream()
                .collect(Collectors.
                        toMap(value -> value,value -> value.length()));

        return result; //return map
    }
    public static void main(String[] args) {
        ListToLengthMap obj = new ListToLengthMap();
        //Sample list and execution
        List<String> list = List.of("mango","grapes","banana");
        Map<String,Integer> map = obj.convertListToLengthMap(list);
        System.out.println(map);
    }
}