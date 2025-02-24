import java.awt.*;
import javax.swing.*;

class FlickeringLabel extends JLabel implements Runnable {
	private long delay;
	
	public FlickeringLabel(String text, long delay) {
		super(text);
		this.delay = delay;
		setOpaque(true);
		
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		int n=0;
		while(true) {
			if(n==0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n==0) n= 1;
			else n = 0;
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class FlickeringLabelEx extends JFrame {
	public FlickeringLabelEx() {
		this.setTitle("FlickeringLabelEx ����");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		FlickeringLabel fLabel = new FlickeringLabel("����", 500);
		
		JLabel label = new JLabel("�ȱ���");
		
		FlickeringLabel fLabel2 = new FlickeringLabel("���⵵ ����", 300);
		
		c.add(fLabel);
		c.add(label);
		c.add(fLabel2);
		
		this.setSize(300,150);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new FlickeringLabelEx();

	}

}
