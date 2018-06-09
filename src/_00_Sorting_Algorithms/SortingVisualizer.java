package _00_Sorting_Algorithms;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SortingVisualizer extends JLabel{
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	
	private static final int ARRAY_SIZE = 250;
	private static final int MAX = 500;
	
	private int cellWidth;
	
	private JFrame window;
	private JPanel displayPanel;
	
	private Random randGen;
	
	private int[] array;
	
	private BufferedImage display;
	
	private Sorter currentSorter;
	
	public SortingVisualizer(Sorter sorter) {
		currentSorter = sorter;
		display = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		setIcon(new ImageIcon(display));
		randGen = new Random();
		
		array = new int[ARRAY_SIZE];
		cellWidth = WIDTH / ARRAY_SIZE;
		randomizeArray();
		
		window = new JFrame(currentSorter.type + " Sort");
		displayPanel = new JPanel();
		displayPanel.add(this);
		displayPanel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		window.add(displayPanel);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		
		currentSorter.sort(array, this);
		updateDisplay();
	}
	
	public void updateDisplay() {
		Color bk = Color.BLACK;
		Color gr = Color.LIGHT_GRAY;
		Color c = bk;
		for(int i = 0; i < WIDTH; i++) {
			for(int j = 0; j < HEIGHT; j++) {
				if(array[i / cellWidth] > HEIGHT - j) {
					c = bk;
				}else {
					c = gr;
				}
				display.setRGB(i, j, c.getRGB());
			}
		}
		
		setIcon(new ImageIcon(display));
	}
	
	private void randomizeArray() {
		for(int i = 0; i < array.length; i++) {
			array[i] = randGen.nextInt(MAX);
		}
		updateDisplay();
	}
}
