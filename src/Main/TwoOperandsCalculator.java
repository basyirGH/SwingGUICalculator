/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author basyir
 */
public class TwoOperandsCalculator {
    
    private String input, x, y;
    private char op;
 
    
    public TwoOperandsCalculator(String input, String x, String y, char op)
    {

        setX(x);
        setY(y);
        setInput(input);
        readInput(input); 
        getOutput(); 
        setOp(op);
        getOp();
        
    }

    public void readInput(String input)
    {
        String x=" ", y=" ";
        
        for (int i=0; i<input.length(); i++)
        {
            if (input.charAt(i) == '-' && i == 0)
            {
                x = x.concat(String.valueOf(input.charAt(i)));
            }
            
            else if (Integer.valueOf(input.charAt(i)) >= 48 &&
                     Integer.valueOf(input.charAt(i)) <= 57 ||
                     input.charAt(i) == '.')
            {
                x = x.concat(String.valueOf(input.charAt(i)));
            }
            
            else if (input.charAt(i) == '+' ||
                     input.charAt(i) == '-' ||
                     input.charAt(i) == '*' ||
                     input.charAt(i) == '/')
            {
                setOp(input.charAt(i));
                i++;
                
                while (i<input.length())
                {
                    y = y.concat(String.valueOf(input.charAt(i)));
                    i++;
                }
                break;
            }
        }
        
        setX(x);
        setY(y);
    }
    
    public double getOutput()
    {
        if ( getOp() == '+')
        {
            return Double.valueOf(getX()) + Double.valueOf(getY());
        }
        
        else if (getOp() == '-')
        {
            return Double.valueOf(getX()) - Double.valueOf(getY());
        }
        
        else if (getOp() == '*')
        {
            return Double.valueOf(getX()) * Double.valueOf(getY());
        }
        
        else if (getOp() == '/')
        {
            return Double.valueOf(getX()) / Double.valueOf(getY());
        }
        
        else
            return 0;
        
            
    }
    
    public void setInput(String input)
    {
        this.input = input;
    }
    
    public String getInput()
    {
       return input;
    }
    
    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public char getOp() {
        return op;
    }

    public void setOp(char op) {
        
        switch (op)
        {
            case ('+') : this.op = op;
            
            case ('-') : this.op = op;
            
            case ('*') : this.op = op;
            
            case ('/') : this.op = op;
            
        }
    }
    
    
    
    
    
}
