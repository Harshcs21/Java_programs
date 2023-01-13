import java.util.*;

class father extends Exception{
    
    int f_age;
    
    father(int x)
    {
        f_age = x;
    }
    
    public String toString()
    {
        return "father age is wrong";
    }
}



class son extends Exception{
    
    int s_age;
    
    son(int y)
    {
        s_age = y;
    }
    
    public String toString()
    {
        return "father age is less than or equal son age";
    }
}

class user_define_exception {
    
    static int x,y;
    
    static void fatherage(int x) throws father{
        
        if(x<0)
        {
            throw new father(x);
        }
        else{
            System.out.println("normal exit from the program");
            
            System.out.println("the father age is " + x);
        }
    }
    
        static void sonage(int y) throws son{
        
        if(y >= x)
        {
            throw new son(y);
        }
        else{
            System.out.println("normal exit from the program");
            
            System.out.println("the son age is " + y);
        }
    }
    
    public static void main(String arg[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter father age :");
        
        x = input.nextInt();
        
        System.out.println("enter son age :");
        
        y = input.nextInt();
        
        try{
            fatherage(x);
        }
        
        catch(father e){
            
            System.out.println(e);
        }
        
        try{
            sonage(y);
        }
        
        catch(son e)
        {
            System.out.println(e);
        }
        
        
    }
}
