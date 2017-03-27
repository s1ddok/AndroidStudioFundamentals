package pl.pollub.androidprogrammingfundamentals;

import java.util.ArrayList;
import java.util.List;
public class Group {

    public String string;
    public final List<Item> children = new ArrayList<>();

    public Group(String string) {
        this.string = string;
    }
}