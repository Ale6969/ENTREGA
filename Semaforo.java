 /**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Semaforo
{
    private Circle circulo_rojo;
    private Circle circulo_amarillo;
    private Circle circulo_verde;
    private Square black_one;
    private Square black_two;
    private Square black_three;
    private int currentColor; 
    private boolean drawn; 
    
    /**
     * Constructor for objects of class Picture
     */
    public Semaforo()
    {
      
        circulo_rojo = new Circle();
        circulo_amarillo = new Circle();
        circulo_verde = new Circle();
        black_one = new Square();
        black_two = new Square();
        black_three = new Square();
        currentColor = 0;
        drawn = false;
        
       
        
        
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
                      
          black_one.changeColor("black");
          black_one.moveHorizontal(-220);
          black_one.makeVisible();
          black_one.changeSize(80);
          black_one.moveVertical(-15);
           
          black_two.changeColor("black");
          black_two.moveHorizontal(-220);
          black_two.makeVisible();
          black_two.changeSize(80);
          black_two.moveVertical(-100);
           
          black_three.changeColor("black");
          black_three.moveHorizontal(-220);
          black_three.makeVisible();
          black_three.changeSize(80);
          black_three.moveVertical(70);
          
        circulo_rojo.moveHorizontal(-125);
        circulo_rojo.changeSize(50);
        circulo_rojo.moveVertical(-50);
        
        circulo_verde.moveHorizontal(-125);
        circulo_verde.changeSize(50);
        circulo_verde.moveVertical(120);
       
        circulo_amarillo.moveHorizontal(-125);
        circulo_amarillo.changeSize(50);
        circulo_amarillo.moveVertical(28);
       
         }
    
         if(currentColor==1)
        {
            luzRojo();
        }
        if (currentColor==2)
        {
            luzAmarillo();
        }
        if(currentColor==3)
        {
            luzVerde();
        }
        drawn = true;
    }
    
    public void luzRojo()
    {
         //currentColor = 1;
         circulo_rojo.changeColor("red");
         circulo_verde.makeInvisible(); 
         circulo_rojo.makeVisible();
         circulo_amarillo.makeInvisible();
         drawn = true;
    }
        
    
        
    public void luzVerde()
    {
       //currentColor = 2;
       circulo_verde.changeColor("green");
       circulo_verde.makeVisible();
       circulo_amarillo.makeInvisible();
       circulo_rojo.makeInvisible();
          
       drawn = false;   
    }

    public void luzAmarillo()
   {
      circulo_amarillo.changeColor("yellow");
      circulo_amarillo.makeVisible();
      circulo_verde.makeInvisible();
      circulo_rojo.makeInvisible();
      drawn = false;
    }
   
    public int getcurrentColor()
        {
        return currentColor;
        
        }
        
        public void setCurrentColor (int newColor)
        {
        currentColor = newColor;
         if (currentColor==1)
        { 
            luzRojo();
        }
        else if (currentColor==3)
        { 
            luzAmarillo();
        }
        else if (currentColor==2)
        {
         luzVerde();
    }
    
    }
}    
    

   

        

    

