package com.exercise;

import com.sun.tools.javac.util.Assert;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String output = "GOD";
        StringPremutations test = new StringPremutations();
        ArrayList<String> value;
        value = test.strPremutations(output, "");

        Assert.check(value.size() == 6);
        Assert.check(value.contains("GOD"));
        Assert.check(value.contains("GDO"));
        Assert.check(value.contains("OGD"));
        Assert.check(value.contains("ODG"));
        Assert.check(value.contains("DOG"));
    }
}