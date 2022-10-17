package deno;
import java.awt.*;
public class Awt_example3 extends Frame {
	Awt_example3(){
		  Button b=new Button("click here ");
		  Label l=new Label(" employee id ");
		  TextField t= new TextField();
		   
		      b.setBounds(100,100,80,30);
		      l.setBounds(20,80,80,30);
		      t.setBounds(20,100,80,30);
		      add(b);
		      add(l);
		      add(t);
		     
		      
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	Awt_example3 f=  new Awt_example3();
	 	f.setSize(400,400);
	 	f.setVisible(true);
	    f.setTitle("yesh");
	    f.setLayout(null);
	}

}
