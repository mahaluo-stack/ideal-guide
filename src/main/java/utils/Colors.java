/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package utils;

// java util
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author maxhaggkvist
 */
public enum Colors {
    GREEN(112, 178, 152),
    YELLOW(236, 190, 122),
    RED(229, 139, 136),
    BLUE(157, 171, 221),
    TEXT(243, 239, 245);

    private final int red;
    private final int blue;
    private final int green;

    private static final List<Colors> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    private Colors(int r, int g, int b) {
        this.red = r;
        this.green = g;
        this.blue = b;
    }

    public int getRedValue() {
        return red;
    }

    public int getBlueValue() {
        return blue;
    }

    public int getGreenValue() {
        return green;
    }

    public static Colors getRandom() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    @Override
    public String toString() {
        return red + "," + green + "," + blue;
    }
}
