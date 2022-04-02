import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intVariblesRows = 0; intVariblesRows < 300; intVariblesRows+= 10){
      for(int intVariblesColumns = 0; intVariblesColumns < 300; intVariblesColumns+= 10){
        intX = 3 + intVariblesRows;  
        intY = 300 + 3 + intVariblesColumns;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    for(int intVariblesRows = 0; intVariblesRows < 300; intVariblesRows+= 10){
      
      for(int intVariblesColumns = 0; intVariblesColumns < 300; intVariblesColumns+= 10){
        
        intX = 303 + intVariblesRows;
        
        intY = 300 + 3 + intVariblesColumns; 
        
        if(intVariblesRows % 4 == 0){
          fill(0);
          noStroke();
          rect(intX, intY, 5, 5);
        }else{
         fill(255);
        noStroke(); 
        rect(intX, intY, 5, 5);
        }
      }
    }
  }
  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){

    int intX = 0;
    int intY = 0;

    for (int intVariblesRows = 0; intVariblesRows < 30; intVariblesRows++) {

      for(int intVariblesColumns = 0; intVariblesColumns < 30; intVariblesColumns++) {

        intX = 3 + 600 + intVariblesRows * 300 / 30;
        intY = 3 + 300 + intVariblesColumns * 300 / 30;

        if(intVariblesColumns % 2 == 0){
          fill(0);
          noStroke();
          rect(intX, intY, 5, 5);
        } 
        
        else {
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
        }
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){

    int intX = 0;
    int intY = 0;

    for(int intVariblesRows = 0; intVariblesRows < 300; intVariblesRows+= 10){
      for(int intVariblesColumns = 0; intVariblesColumns < 300; intVariblesColumns+= 10){
        intX = 903 + intVariblesRows;
        
        intY = 300 + 3 + intVariblesColumns; 
        
        if(intVariblesRows % 20 == 0 || intVariblesColumns % 20 == 0){
          fill(0);
          noStroke();
          rect(intX, intY, 5, 5);
        }else if (intVariblesRows % 20 != 0 || intVariblesColumns % 20 != 0){
         fill(255);
        noStroke(); 
        rect(intX, intY, 5, 5);
        }
      }
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    for(int intVariblesColumns = 0; intVariblesColumns < 297; intVariblesColumns += 10){
      for(int intVariblesRows = 300 - intVariblesColumns; intVariblesRows < 300; intVariblesRows += 10){ 
        intX = 0 + 3 + intVariblesRows;
        intY = 3 + intVariblesColumns;
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);         
      }
    }
  }

  public void draw_section6(){
    int intX = 0;
    int intY = 0;
    
      for(int intVariblesColumns = 0; intVariblesColumns <= 290; intVariblesColumns+= 10){
        for(int intVariblesRows = 0; intVariblesRows <= intVariblesColumns; intVariblesRows+= 10){
          intX = 303 + intVariblesRows;  
          intY = 3 + intVariblesColumns;
    
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section7(){
     int intX = 0;
    int intY = 0;

    for(int intVariblesColumns = 0; intVariblesColumns < 300; intVariblesColumns += 10){
      for(int intVariblesRows = 290 - intVariblesColumns ; intVariblesRows >= 0; intVariblesRows -= 10){
        intX = 600 + 3 + intVariblesRows;  
        intY = 3 + intVariblesColumns; 

        // Draw squares 
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
   } 

  }
  
  public void draw_section8(){
    int intX;
    int intY;
    
    for(int intVariblesRows = 0; intVariblesRows < 300; intVariblesRows += 10){
      for(int intVariblesColumns = 0; intVariblesColumns <= intVariblesRows; intVariblesColumns += 10){
        intX = intVariblesRows + 900 + 3;
        intY = intVariblesColumns + 3;
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);          
       }
     }
    }
}