package Classworks.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class HiddenData implements Iterable<String> {
    private final List<String> months = Arrays.asList(
            "Jan", "Feb", "Mar", "Apr", "May");

    @Override
    public Iterator<String> iterator() {

        Iterator<String> iterator = new Iterator<String>() {
            Random random = new Random();

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < months.size();
            }

            @Override
            public String next() {
                index++;
                int i = random.nextInt(months.size());
                return months.get(i);


            }
        };

        return iterator;
    }
}
