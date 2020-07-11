
package practice_19;

class A
{
    private int data; //Data hiding

    public int getData() 
    {
        return data;
    }

    public void setData(int data) 
    {
        this.data = data;
    }
       
}
public class Encapsulation 
{
   
    public static void main(String[] args) 
    {
        A obj1 = new A();
        obj1.setData(20);
        System.out.println("Data = " + obj1.getData());
    }
    
}
