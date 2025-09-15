import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelTemplate extends JPanel 
{
  private int w,h,count;
  private ImageIcon img, am1, af1, img2, chat1,chat2,afs,ams,afd,amd,img3;
  private ImageIcon player;
  private boolean click,click2,click3,click4,click5,click6,click7; 
  
  public PanelTemplate(int w,int h)
  {
    this.w=w;
    this.h=h;
    this.count=0;
    this.player=null;
    this.click=false;
    this.click2=false;
    this.click3=false;
    this.click4=false;
    this.click5=false;
    this.click6=false;
    this.click7=false;
  
    setPreferredSize(new Dimension(w,h));
    img=new ImageIcon("neutral.jpg");
    am1=new ImageIcon("avatar.png");
    af1=new ImageIcon("avatarf.png");
    img2=new ImageIcon("campfire.jpg");
    chat1=new ImageIcon("largebubble.png");
    chat2=new ImageIcon("smallbubble.png");
    ams=new ImageIcon("avatarmsurprised.png");
    afs=new ImageIcon("avatarfsurprised.png");
    afd=new ImageIcon("avatarfdead.png");
    amd=new ImageIcon("avatarmdead.png");
    img3=new ImageIcon("images.jpeg");
    
    Image copy=img.getImage();
    Image newImage = copy.getScaledInstance(800,500,1);
    
    img=new ImageIcon(newImage);

    copy=am1.getImage();
    newImage=copy.getScaledInstance(200,200,1);
    am1=new ImageIcon(newImage);

    copy=af1.getImage();
    newImage=copy.getScaledInstance(200,200,1);
    af1=new ImageIcon(newImage);

    copy=afs.getImage();
newImage=copy.getScaledInstance(200,200,1);
    afs=new ImageIcon(newImage);

    copy=ams.getImage();
  newImage=copy.getScaledInstance(200,200,1);
     ams=new ImageIcon(newImage);

    copy=amd.getImage();
newImage=copy.getScaledInstance(200,200,1);
       amd=new ImageIcon(newImage);

    copy=afd.getImage();
newImage=copy.getScaledInstance(200,200,1);
       afd=new ImageIcon(newImage);

    copy=img2.getImage();
    newImage = copy.getScaledInstance(800,500,1);
    img2=new ImageIcon(newImage);

    copy=img3.getImage();
    newImage = copy.getScaledInstance(800,500,1);
    img3=new ImageIcon(newImage);
    
    copy=chat1.getImage();
    newImage = copy.getScaledInstance(150,150,1);
    chat1=new ImageIcon(newImage);

    copy=chat2.getImage();
    newImage = copy.getScaledInstance(200,200,1);
    chat2=new ImageIcon(newImage);

    MouseControl mouseControl = new MouseControl();
    this.addMouseListener(mouseControl);
    this.addMouseMotionListener(mouseControl);


  }

  public void paintComponent(Graphics g)
  {
      super.paintComponent(g);

    img.paintIcon(this,g,0,0);
    am1.paintIcon(this,g,200,150);
    af1.paintIcon(this,g,400,150);
    g.drawString("Male", 290, 150);
    g.drawString("or",400,150);
    g.drawString("Female",480,150);
    
    if (click) 
    {
      img2.paintIcon(this, g, 0, 0);
      if(player.equals(am1))
      {
        am1.paintIcon(this,g,200,170);
      }
      if(player.equals(af1))
      {
        af1.paintIcon(this,g,200,170);
      }

      chat1.paintIcon(this,g,350,50);
      g.drawString("Thanks for", 393,95);
      g.drawString("choosing me.",387,115);
      g.drawString("Click to play!",388,135);

      if(click2)
      {
        chat1.paintIcon(this,g,350,50);
        g.drawString("You will make",384,85);
        g.drawString("decisions to",386,105);
        g.drawString("keep me alive",384,125);
        g.drawString("through the night",373,145);
        g.setColor(Color.WHITE);
        g.drawString("Click to continue",360,30);
        if(click3)
        {
          chat1.paintIcon(this,g,350,50);
          g.setColor(Color.BLACK);
          g.drawString("Let's begin by",382,85);
          g.drawString("making dinner.",382,105);
          g.drawString("What should I",382,125);
          g.drawString("have?",405,145);
          g.setColor(Color.WHITE);
          g.drawString("Pick berries from",150,100);
          g.drawString("nearby trees",155,120);
          g.drawString("Cook old meat from",597,100);
          g.drawString("your bag",620,120);
          
          if(click4)
          {
            img2.paintIcon(this, g, 0, 0);
            chat1.paintIcon(this,g,350,50);
    
            if(player.equals(afs)||player.equals(ams))
            {
            player.paintIcon(this,g,200,170);
              g.setColor(Color.BLACK);
              g.drawString("The berries were",376,95);
              g.drawString("poisonous!",393,115);
              g.drawString("I died.",405,135);
              g.setColor(Color.WHITE);
              g.drawString("Click to continue",360,30);
              if(click7)
              {
                if(player.equals(am1)||player.equals(ams))
                  {
                    player=amd;
                  }
                  if(player.equals(af1)||player.equals(afs))
                  {
                    player=afd;
                  }
                
                img3.paintIcon(this,g,0,0);
                player.paintIcon(this,g,300,190);
                g.setColor(Color.WHITE);
                g.drawString("Restart the code to try again.",330,30);
                
              }
              else if (click5)
              {
                
              }
            }
        else
          {
            player.paintIcon(this,g,200,170);
              g.setColor(Color.BLACK);
              g.drawString("Phew, the",395,95);
                g.drawString("meat was still",385,115);
                g.drawString("fresh. Good job!",380,135);
              if(click5)
              {
                chat1.paintIcon(this,g,350,50);
                g.drawString("It looks like",390,95);
                g.drawString("we're able to",388,115);
                g.drawString("go home now!",385,135);
                if(click6)
                {
                  img.paintIcon(this,g,0,0);
            player.paintIcon(this,g,300,150);
                  g.drawString("You survived!",365,150);
                  g.drawString("Restart the code to play again",315,400);
                  
                }
              }
            else if(click7)
            {
              
            }
            }
          }
        }
      }
    }
  }
  
  private class MouseControl implements MouseListener, MouseMotionListener
  {
    public void mouseDragged(MouseEvent e)
    {

    }

    public void mouseMoved(MouseEvent e)
    {
      
    }

    public void mouseClicked(MouseEvent e)
    { 
      int x=e.getX();
      int y=e.getY();

      
      if(count==0)
      {
        if(x>200 && x<400 && y>150 && y<350)
        {
          player=am1;
          click=true;
        }

      else if(x>400 && x<600 && y>150 && y<350) 
       {
          player=af1;
          click=true;
        }
        count++;
      }

      else if(count==1)
      {
        click2=true;
        count++;
      }

      else if(count==2)
      {
        click3=true;
        count++;
      }

      else if(count==3)
      {
        if(x<300&&x>100&&y<140&&y>70)
        {
          if(player.equals(am1))
             player=ams;
          if(player.equals(af1))
            player=afs;
          count++;
          click4=true;
          
        }
        if(x<700&&x>400&&y<140&&y>70)
          {
            count++;
            click4=true;
          }
      }

      else if(count==4)
      {
        click5=true;
        click7=true;
        count++;
      }

      else if(count==5)
      {
        click6=true;
        count++;
      }

      repaint();
    }

    public void mousePressed(MouseEvent e)
    {
      
    }

    public void mouseReleased(MouseEvent e)
    {

    }

    public void mouseEntered(MouseEvent e)
    {

    }

    public void mouseExited(MouseEvent e)
    {

    }
  }
}