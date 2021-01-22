/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NiruuGopa
 */
public class NumberHelper 
{
    private int number;

    public NumberHelper(int number) 
    {
        this.number = number;
    }
    
    public boolean isEven()
    {
        if(number == 0)
        {
            return false;
        }
        
        if(number % 2 == 0)
        {
            return true;
        }
    
        return false;
    }
    
    
    public boolean isOdd()
    {
        if(number == 0)
        {
           return false;
        }
        
        if(number % 2== 1)
        {
            return true;
        }
    
        return false;
    }
    
    
    public int sum(int num)
    {
    
        return num + number;
    }
    
    public boolean isPrime()
    {
        int conta = 0;
        
        if(number == 0)
        {
            return false;
        }
        
        for (int i = 1; i <= number; i++) 
        {
            if(number % i == 0)
            {
                conta++;
            }
        }
        
        if (conta == 2)
        {
            return true;
        }
     
        return false;
    }
    
    public boolean isDivisibleby(int num)
    {
        if(num == 0)
        {
            return false;
        }
     
        if(number % num == 0)
        {
            return true;
        }

        return false;
    }
}