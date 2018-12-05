package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTemplate {
    ArrayList<Integer> arrayList = new ArrayList<>();
    StreamTemplate(){
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
    }

    void filterDemo(){
        List<Integer> list = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list);
    }

    void mapDemo(){
        List<Integer> list = arrayList.stream().map(i -> i*2).collect(Collectors.toList());
        System.out.println(list);
    }

    void countDemo(){
        long count = arrayList.stream().map(i -> i*2).count();
        System.out.println(count);
    }

    void sortingDemo(){

    }

    void sorting(){

    }
    public static void main(String[] args) {
        StreamTemplate obj = new StreamTemplate();
        obj.filterDemo();
        obj.mapDemo();
        obj.countDemo();
    }
}
