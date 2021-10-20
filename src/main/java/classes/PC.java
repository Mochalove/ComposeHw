package classes;

public class PC {
   protected Case pcCase;
   protected Monitor monitor;
   protected MotherBoard motherBoard;


    public PC(Case pcCase, Monitor monitor, MotherBoard motherBoard){
       this.pcCase = pcCase;
       this.monitor = monitor;
       this.motherBoard = motherBoard;
   }

 private void drawLogo(){
    monitor.drawPixel(8, 9, "Blue");
 }
 public void description(){
     System.out.println("Welcome to the worst buy below is the description of the " + "pc on sale today" + pcCase+motherBoard+monitor);
 }
 public void powerUp(){
    pcCase.pressPowerButton();
    drawLogo();

 }
}




