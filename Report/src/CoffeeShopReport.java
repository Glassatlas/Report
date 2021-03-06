
import java.awt.*;
import javax.swing.*;

public class CoffeeShopReport extends JFrame{

	private JFrame frame;
	private JLabel label;
	private JButton button;
	private JTable table;
	private JTextField totalRevenue;


	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public CoffeeShopReport() {
		JPanel reportPanel = new JPanel();
		
		this.setSize(600, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("End of Day Report");
		
		setLayout(new FlowLayout());
		String[] columnNames = {"Product name", "Category", "Unit Price", "Qty"};


		Object[][] data = {
				{"Martinee", "Drinks", "3.5", "2"},{"Brownie","Dessert","2.5","4"},{"Cheese Sandwich","Meal", "5.2", "10"},
				{"Burger Sanwich","Meal", "7.2", "8"}};
		
	
		
		table = new JTable(data, columnNames);
		table.setPreferredScrollableViewportSize(new Dimension(500,70));
		table.setFillsViewportHeight(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
		
		label = new JLabel ("Total Revenue");
		add(label);
		
		totalRevenue = new JTextField(10);
		add(totalRevenue);		
		
		reportPanel.add(totalRevenue);
		this.add(reportPanel);
		
		this.setVisible(true);
		
	}
	
	public int getTotalRevenue() {
		return Integer.parseInt(totalRevenue.getText());
	}
	
	public void setTotalRevenue(int revenue) {
		totalRevenue.setText(Integer.toString(revenue));
	}

	
		
}
			


