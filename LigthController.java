
/**
 * Write a description of class LightController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LigthController
{
   
   
   private Semaforo stopLight;
   
   public LigthController()
   {
 
    stopLight = new Semaforo();
    stopLight.draw();
    
    }
   public void nextLigth()
    {
        if (stopLight.getcurrentColor()==1)
        {
            stopLight.setCurrentColor(2);
            stopLight.luzVerde();
           
        }
        else{ if(stopLight.getcurrentColor() ==2)
            {
            stopLight.setCurrentColor(3);
            stopLight.luzAmarillo();
            
        }
            else{ if(stopLight.getcurrentColor()==2)
            {
                stopLight.setCurrentColor(1);
                stopLight.luzRojo();
               
            }
        }
    }
    }

}
    
   
    
    
    
    
    

