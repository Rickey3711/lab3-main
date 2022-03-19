package com.lab3;

import java.util.Objects;

/**
 * Этот класс представляет конкретное место на 2D-карте.
 * Координаты - это целые числа.
 **/
public class Location
{
    /** X координата этого места. **/
    public int xCoord;

    /** Y координата этого места. **/
    public int yCoord;

    /** Создает новое местоположение с указанными целыми координатами. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Создает новое местоположение с координатами (0, 0). **/
    public Location()
    {
        this(0, 0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return xCoord == location.xCoord && yCoord == location.yCoord;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoord, yCoord);
    }
}