import java.io.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class ColorChooser extends Frame{
	private Button black, white, blue, cyan, green, magenta, orange, pink, red, yellow, check, about, exit;
	private Panel p;
	private TextField t;
	private String s;
	private int res, sco, dis=0, show=0, idis=0;
	
	public int FileCreator(){
		try{
			RandomAccessFile f=new RandomAccessFile("bite.dll", "rw");
			s=f.readLine();
		}
		catch(IOException e){
			JOptionPane.showMessageDialog(null, "can't read");
		}
		int i=Integer.parseInt(s);
		return i;
	}
	
	public ColorChooser(){
		super("Zakir's Color Choosing Game");
		
		res=FileCreator();
		
		black=new Button("Black");
		white=new Button("White");
		blue=new Button("Blue");
		cyan=new Button("Cyan");
		green=new Button("Green");
		magenta=new Button("Magenta");
		orange=new Button("Orange");
		pink=new Button("Pink");
		red=new Button("Red");
		yellow=new Button("Yellow");
		
		check=new Button("Check");
		about=new Button("About");
		exit=new Button("Exit");
		
		t=new TextField(10);
		
		p=new Panel();
		p.setLayout(new FlowLayout());
		add(p);
		
		black.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sco=1;
				dis++;
			}
		});
		
		white.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sco=2;
				dis++;
			}
		});
		
		blue.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sco=3;
				dis++;
			}
		});
		
		cyan.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sco=4;
				dis++;
			}
		});
		
		green.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sco=5;
				dis++;
			}
		});
		
		magenta.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sco=6;
				dis++;
			}
		});
		
		orange.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sco=7;
				dis++;
			}
		});
		
		pink.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sco=8;
				dis++;
			}
		});
		
		red.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sco=9;
				dis++;
			}
		});
		
		yellow.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sco=10;
				dis++;
			}
		});
		
		check.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(dis<5){
					if(sco==res){
						JOptionPane.showMessageDialog(null, "You get the answer, check out the score");
						show=1;
						idis=12-(dis*2);
						t.setText(""+idis);
					}
					else{
						JOptionPane.showMessageDialog(null, "Loser!!");
					}
				}
				else{
					black.setEnabled(false);
					white.setEnabled(false);
					blue.setEnabled(false);
					cyan.setEnabled(false);
					green.setEnabled(false);
					magenta.setEnabled(false);
					orange.setEnabled(false);
					pink.setEnabled(false);
					red.setEnabled(false);
					yellow.setEnabled(false);
					check.setEnabled(false);
				}
			}
		});
		
		about.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null, "This is a gaming program by Zakir");
			}
		});
		
		exit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		p.add(black);
		p.add(white);
		p.add(blue);
		p.add(cyan);
		p.add(green);
		p.add(magenta);
		p.add(orange);
		p.add(pink);
		p.add(red);
		p.add(yellow);
		p.add(t);
		p.add(check);
		p.add(about);
		p.add(exit);
		
//		setBackground(Color.DARK_GRAY);
		setSize(550, 300);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		if(res==1)
			g.setColor(Color.BLACK);
		if(res==2)
			g.setColor(Color.WHITE);
		if(res==3)
			g.setColor(Color.BLUE);
		if(res==4)
			g.setColor(Color.CYAN);
		if(res==5)
			g.setColor(Color.GREEN);
		if(res==6)
			g.setColor(Color.MAGENTA);
		if(res==7)
			g.setColor(Color.ORANGE);
		if(res==8)
			g.setColor(Color.PINK);
		if(res==9)
			g.setColor(Color.RED);
		if(res==10)
			g.setColor(Color.YELLOW);
		
		if(show==1){
			g.fillOval(150, 150, 100, 100);
		}
		repaint();
	}
	
	public static void main(String args[]){
		ColorChooser c=new ColorChooser();
		c.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent ev){
				System.exit(0);
			}
		});
	}
}