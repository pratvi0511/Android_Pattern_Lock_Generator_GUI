  //package Assignment5; 
	import java.awt.Color;
	import java.awt.FlowLayout;
	import java.awt.Graphics;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.Random;
	import java.util.stream.IntStream;
	import java.io.*;
	import javax.swing.JFrame;
	import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;
	import java.awt.geom.Line2D;
	import java.awt.AlphaComposite;
	import java.awt.BasicStroke;
	import java.util.*;
	
	
	public class AndroidPatternLock extends JFrame implements ActionListener{
	
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		/**
		 * 
		 */
		
		private static Graphics ge;
		private int array[]=new int[10];
		private int j=0;
		private int p = 0;
		private int startx,starty,endx,endy;
		private int x1[] = new int[10];
		private int y1[] = new int[10];
		private int x2[] = new int[10];
		private int y2[] = new int[10];
		
    public AndroidPatternLock()
		{
		    JFrame p1 = new JFrame();
		    setTitle("Android Patter Lock Generator");
			setLayout(new FlowLayout());
			
			JMenuBar menu_bar = new JMenuBar();
			setJMenuBar(menu_bar);
			JMenu file = new JMenu("File");
			JMenuItem l1 = new JMenuItem("GET PATTERN");
			
			menu_bar.add(file);
			file.add(l1);
			l1.addActionListener(this);
		   
			setSize(1000,1000);
			menu_bar.setVisible(true);
			
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
						
			//l2.addActionListener(null);
		}
	
	public void getpattern() 
		{
			Random r = new Random();
			int k = r.nextInt(7)+3;
			int i=0;
			if(k>=3)
				{
				while(i!=k)
				{
					int a = r.nextInt(3);
					boolean contains = IntStream.of(array).anyMatch(x->x==a);
		            if(contains==false)
					{
						array[i]=a;
						i=i+1;
		            }
					int b = r.nextInt(3)+3;
					boolean contain = IntStream.of(array).anyMatch(x->x==b);
		            if(contain==false && i<k )
					{
						array[i]=b;
						i=i+1;
		            }
		            int c = r.nextInt(4)+6;
					boolean contained = IntStream.of(array).anyMatch(x->x==c);
		            if(contained==false && i<k)
					{
						array[i]=c;
		                i+=1;
					}
		             if(i==k)
		               break;
				}
		        for(int d1:array)
		          {
					 if(d1==0)
		        	   {break;}
					 else
					   {System.out.println(d1);
					     j++;
					     
					}
				
				}System.out.println("Number:"+j);}
	    }
	
		@Override
		public void actionPerformed(ActionEvent e) {
			getpattern();
	        
			while(p!=j)
			{
				//get the starting x-coordinate
				if(array[p]==1 || array[p]==4 || array[p]==7)
					{startx = 260;}
				else if(array[p]==2 || array[p]==5 || array[p]==8)
					{startx = 360;}
				else if(array[p]==3 || array[p]==6 || array[p]==9)
					{startx = 460;}
				// get the starting y-coordinate
				if(array[p]==1 || array[p]==2 || array[p]==3)
					{starty = 90;}
				else if(array[p]==4 || array[p]==5 || array[p]==6)
					{starty = 190;}
				else if(array[p]==7 || array[p]==8 || array[p]==9)
					{starty = 290;}
				// get the ending x-coordinate
				if(array[p+1]==1 || array[p+1]==4 || array[p+1]==7)
					{endx = 260;}
				else if(array[p+1]==2 || array[p+1]==5 || array[p+1]==8)
					{endx = 360;}
				else if(array[p+1]==3 || array[p+1]==6 || array[p+1]==9)
					{endx = 460;}
				// get the ending y-coordinate
				if(array[p+1]==1 || array[p+1]==2 || array[p+1]==3)
					{endy = 90;}
				else if(array[p+1]==4 || array[p+1]==5 || array[p+1]==6)
					{endy = 190;}
				else if(array[p+1]==7 || array[p+1]==8 || array[p+1]==9)
					{endy = 290;}
				
				System.out.println(startx+" "+starty+" "+endx+" "+endy);
				x1[p]=startx;
				y1[p]=starty;
				x2[p]=endx;
				y2[p]=endy;
				p++;
				}
			
		}
	
    public void paint(Graphics g)
		{
		   int q;
		   g.setColor(Color.RED);
			int index = 0;
			int x = 250;
			int y = 80;
			int i = 0;
			for(i=0;i<9;i++)
			{
				g.fillOval(x, y, 20, 20);
				x=x+100;
				index++;
				if(index%3==0)
				{
					y=y+100;
					x = 250;
				}
				
			}
			
			
			for(q=0;q<=j;q++)
		    {
			  g.setColor(Color.blue);
			  g.drawOval(x1[q]-20, y1[q]-20, 40, 40);
			  BasicStroke st = new BasicStroke(4f);
			  g.setColor(Color.DARK_GRAY);
		      g.drawLine(x1[q], y1[q], x2[q], y2[q]);
		      try {
				Thread.sleep(12*60);
			} catch (InterruptedException e) {
				
				System.out.println(e.getMessage());
			}
		    }
		}		
			
		public static void main(String args[])
		{
	        AndroidPatternLock alp = new AndroidPatternLock();
	        alp.setVisible(true);
	
			
		}
  }
