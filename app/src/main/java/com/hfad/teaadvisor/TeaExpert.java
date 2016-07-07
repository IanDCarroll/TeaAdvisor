package com.hfad.teaadvisor;
import java.util.ArrayList;
import java.util.List;

public class TeaExpert {
    List<String> getTypes(String color) {
        List<String> types = new ArrayList<String>();
        if (color.equals("White")) {
            types.add("Silver Needle");
            types.add("Bai MuDan");
        } else if (color.equals("Green")) {
            types.add("Dragon Well");
            types.add("Yellow Mountain");
            types.add("Gyokuro");
            types.add("Sencha");
            types.add("Matcha");
        } else if (color.equals("Oolong")) {
            types.add("Tie Guan Yin");
            types.add("Ali Shan");
            types.add("Oriental Beauty");
        } else if (color.equals("Black")) {
            types.add("Darjeeling");
            types.add("Assam");
            types.add("Nilgiri");
            types.add("Ceylon");
            types.add("Keemun");
            types.add("Lapsang Souchong");
        } else if (color.equals("Pu-erh")) {
            types.add("Cave Fermented");
            types.add("Factory Fermented");
        }
        return types;
    }
}