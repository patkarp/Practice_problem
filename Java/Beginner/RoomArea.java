import java.io.*;
import java.lang.*;
class Room
{
float length,breadth;

void getData(float a, float b)
{
	length=a;
	breadth=b;	
}
}

class RoomArea
{
public static void main(String[] args)
{
Room room1= new Room();//Creates a Room Object
room1.getData(14,10);
float area=room1.length*room1.breadth;
System.out.println("Size of Room is= "+area);
}
}
