package deno;
import java.awt.*;
// closing frame method in event handling
import java.awt.event.*;


public class Awt_example4 extends Frame  {
	 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Awt_example4 s=new Awt_example4();
        s.setSize(400,500);
        s.setVisible(true);
        s.setTitle("frame work");
     
       s.addWindowListener(new  WindowAdapter()
       
         		{
    	   
     
			public void WindowClosing(WindowEvent e) {
              System.exit(0);
        		}

						}
	);
        
	}
}
	