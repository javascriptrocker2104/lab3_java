/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }
    //@Override - родительский метод переопределён в наследнике.
    @Override
    public boolean equals(Object o)
    {
        if (o==null) return false;
        Location loc = (Location) o;
        return((xCoord==loc.xCoord)&&(yCoord==loc.yCoord));
    }
    @Override
    public int hashCode()
    {
        int result=31;//стартовое число, необходимое для расчета hash-кода объекта
        result=31*result+xCoord;
        result=31*result+yCoord;
        return result;
    }
}