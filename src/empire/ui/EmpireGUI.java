package empire.ui;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.*;
import javax.swing.border.*;

import empire.util.Date;
import empire.util.JPanelWithBackground;
import empire.util.Time;

/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class EmpireGUI extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3695543491037888195L;

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	private JMenuBar menuBar;
	private JSpinner arrivalMinuteSpinner;
	private JLabel colonLabel2;
	private JSpinner travelTimeHourSpinner;
	private JPanel loadingTimeTravelTimePanel;
	private JLabel colonLabel1;
	private JSpinner arrivalHourSpinner;
	private JLabel hyphenLabel;
	private JComboBox<String> arrivalYearComboBox;
	private JLabel slashLabel2;
	private JPanel travelTimePanel;
	private JComboBox<String> arrivalMonthComboBox;
	private JLabel slashLabel1;
	private JComboBox<String> arrivalDayComboBox;
	private JPanel loadingDateAndTimeArrivalPanel;
	private JPanelWithBackground dateAndTimeStartPanel;
	private JPanel startPanel;
	private JPanel startButtonPanel;
	private JLabel startButtonLabel;
	private JLabel dateAndTimeStartLabel;
	private JPanel contentPanel;
	private JPanel rootPanel;
	private JSeparator attackMenuSeparator;
	private JMenuItem startMenuItem;
	private JLabel startLabel;
	private JLabel travelTimeLabel;
	private JLabel arrivalLabel;
	private JSpinner travelTimeMinuteSpinner;
	private JPanel timeTravelTimePanel;
	private JPanel dateAndTimeArrivalPanel;
	private JPanel arrivalPanel;
	private JMenuItem infoMenuItem;
	private JMenuItem quitMenuItem;
	private JMenu attackMenu;
	private JMenu infoMenu;
	private ImageIcon[] images;

	/**
	* Auto-generated main method to display this JFrame
	*/
	
	public EmpireGUI(ImageIcon[] images) {
		super();
		this.images = images;
		initGUI();
	}
	
	private void showExitMessage() {
		try {
			JOptionPane.showMessageDialog(null, "Grazie per aver utilizzato Empire Clock.", "Grazie", JOptionPane.INFORMATION_MESSAGE, images[11]);
		} catch (HeadlessException e) {
			e.printStackTrace();
		}
		dispose();
	}
	
	private void initGUI() {
		int tmp;
		GregorianCalendar calendar = new GregorianCalendar();
		String[] days = new String[31];
		for(int i = 0; i < 31; i++)
			if(i < 9)
				days[i] = "0" + (i + 1);
			else
				days[i] = "" + (i + 1);
		String[] months = new String[12];
		months[0] = "Gennaio";
		months[1] = "Febbraio";
		months[2] = "Marzo";
		months[3] = "Aprile";
		months[4] = "Maggio";
		months[5] = "Giugno";
		months[6] = "Luglio";
		months[7] = "Agosto";
		months[8] = "Settembre";
		months[9] = "Ottobre";
		months[10] = "Novembre";
		months[11] = "Dicembre";
		String[] years = new String[20];
		for(int i = 0; i < 20; i++)
			years[i] = "" + (calendar.get(Calendar.YEAR) + i);
		String[] hours = new String[24];
		for(int i = 0; i < 24; i++)
			if(i < 10)
				hours[i] = "0" + i;
			else
				hours[i] = "" + i;
		String[] minutes = new String[60];
		for(int i = 0; i < 60; i++)
			if(i < 10)
				minutes[i] = "0" + i;
			else
				minutes[i] = "" + i;
		String[] hours2 = new String[100];
		for(int i = 0; i < 100; i++)
			if(i < 10)
				hours2[i] = "0" + i;
			else
				hours2[i] = "" + i;
		try {
			setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			this.setTitle("Empire Clock");
			BorderLayout thisLayout = new BorderLayout();
			getContentPane().setLayout(thisLayout);
			this.setIconImage(images[1].getImage());
			this.setResizable(false);
			{
				rootPanel = new JPanelWithBackground(images[0].getImage());
				getContentPane().add(rootPanel, BorderLayout.CENTER);
				GridBagLayout rootPanelLayout = new GridBagLayout();
				rootPanelLayout.rowWeights = new double[] {0.1, 0.1, 0.0, 0.1, 0.1, 0.1, 0.1, 0.1};
				rootPanelLayout.rowHeights = new int[] {7, 7, 14, 7, 7, 7, 7, 7};
				rootPanelLayout.columnWeights = new double[] {0.0};
				rootPanelLayout.columnWidths = new int[] {-1};
				rootPanel.setLayout(rootPanelLayout);
				rootPanel.setBackground(new java.awt.Color(69,52,39));
				{
					arrivalPanel = new JPanel();
					rootPanel.add(arrivalPanel, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					FlowLayout arrivoPanelLayout = new FlowLayout();
					arrivalPanel.setLayout(arrivoPanelLayout);
					arrivalPanel.setOpaque(false);
					{
						arrivalLabel = new JLabel();
						arrivalPanel.add(arrivalLabel);
						arrivalLabel.setText("Arrivo");
						arrivalLabel.setFont(new java.awt.Font("Ebrima",1,28));
						arrivalLabel.setForeground(new java.awt.Color(240,221,199));
					}
				}
				{
					dateAndTimeArrivalPanel = new JPanel();
					rootPanel.add(dateAndTimeArrivalPanel, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					FlowLayout dateAndTimeArrivoPanelLayout = new FlowLayout();
					dateAndTimeArrivoPanelLayout.setVgap(0);
					dateAndTimeArrivalPanel.setLayout(dateAndTimeArrivoPanelLayout);
					dateAndTimeArrivalPanel.setOpaque(false);
					{
						loadingDateAndTimeArrivalPanel = new JPanel();
						dateAndTimeArrivalPanel.add(loadingDateAndTimeArrivalPanel);
						FlowLayout loadingDateAndTimePanelLayout = new FlowLayout();
						loadingDateAndTimePanelLayout.setVgap(0);
						loadingDateAndTimeArrivalPanel.setLayout(loadingDateAndTimePanelLayout);
						loadingDateAndTimeArrivalPanel.setBackground(new java.awt.Color(35,188,235));
						loadingDateAndTimeArrivalPanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
						{
							ComboBoxModel<String> dayComboBoxModel = new DefaultComboBoxModel<String>(days);
							dayComboBoxModel.setSelectedItem(days[calendar.get(Calendar.DAY_OF_MONTH) - 1]);
							arrivalDayComboBox = new JComboBox<String>();
							loadingDateAndTimeArrivalPanel.add(arrivalDayComboBox);
							arrivalDayComboBox.setModel(dayComboBoxModel);
							arrivalDayComboBox.setToolTipText("Seleziona il giorno di arrivo del tuo attacco");
						}
						{
							slashLabel1 = new JLabel();
							loadingDateAndTimeArrivalPanel.add(slashLabel1);
							slashLabel1.setText("/");
						}
						{
							ComboBoxModel<String> monthComboBoxModel = new DefaultComboBoxModel<String>(months);
							monthComboBoxModel.setSelectedItem(months[calendar.get(Calendar.MONTH)]);
							arrivalMonthComboBox = new JComboBox<String>();
							loadingDateAndTimeArrivalPanel.add(arrivalMonthComboBox);
							arrivalMonthComboBox.setModel(monthComboBoxModel);
							arrivalMonthComboBox.setToolTipText("Seleziona il mese di arrivo del tuo attacco");
						}
						{
							slashLabel2 = new JLabel();
							loadingDateAndTimeArrivalPanel.add(slashLabel2);
							slashLabel2.setText("/");
						}
						{
							ComboBoxModel<String> yearComboBoxModel = new DefaultComboBoxModel<String>(years);
							arrivalYearComboBox = new JComboBox<String>();
							loadingDateAndTimeArrivalPanel.add(arrivalYearComboBox);
							arrivalYearComboBox.setModel(yearComboBoxModel);
							arrivalYearComboBox.setToolTipText("Seleziona l'anno di arrivo del tuo attacco");
						}
						{
							hyphenLabel = new JLabel();
							loadingDateAndTimeArrivalPanel.add(hyphenLabel);
							hyphenLabel.setText("-");
						}
						{
							SpinnerListModel hourArrivoSpinnerModel = new SpinnerListModel(hours);
							tmp = calendar.get(Calendar.HOUR_OF_DAY);
							if(tmp < 10)
								hourArrivoSpinnerModel.setValue("0" + Integer.toString(tmp));
							else
								hourArrivoSpinnerModel.setValue(Integer.toString(tmp));
							arrivalHourSpinner = new JSpinner();
							loadingDateAndTimeArrivalPanel.add(arrivalHourSpinner);
							arrivalHourSpinner.setModel(hourArrivoSpinnerModel);
							arrivalHourSpinner.setToolTipText("Seleziona l'ora di arrivo del tuo attacco");
						}
						{
							colonLabel1 = new JLabel();
							loadingDateAndTimeArrivalPanel.add(colonLabel1);
							colonLabel1.setText(":");
						}
						{
							SpinnerListModel minuteArrivoSpinnerModel = new SpinnerListModel(minutes);
							tmp = calendar.get(Calendar.MINUTE);
							if(tmp < 10)
								minuteArrivoSpinnerModel.setValue("0" + Integer.toString(tmp));
							else
								minuteArrivoSpinnerModel.setValue(Integer.toString(tmp));
							arrivalMinuteSpinner = new JSpinner();
							loadingDateAndTimeArrivalPanel.add(arrivalMinuteSpinner);
							arrivalMinuteSpinner.setModel(minuteArrivoSpinnerModel);
							arrivalMinuteSpinner.setToolTipText("Seleziona il minuto di arrivo del tuo attacco");
						}
					}
				}
				{
					travelTimePanel = new JPanel();
					rootPanel.add(travelTimePanel, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					FlowLayout tempoDiViaggioPanelLayout = new FlowLayout();
					travelTimePanel.setLayout(tempoDiViaggioPanelLayout);
					travelTimePanel.setOpaque(false);
					{
						travelTimeLabel = new JLabel();
						travelTimePanel.add(travelTimeLabel);
						travelTimeLabel.setText("Tempo di viaggio");
						travelTimeLabel.setFont(new java.awt.Font("Ebrima",1,28));
						travelTimeLabel.setForeground(new java.awt.Color(240,221,199));
					}
				}
				{
					timeTravelTimePanel = new JPanel();
					rootPanel.add(timeTravelTimePanel, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					FlowLayout timeTempoDiViaggioPanelLayout = new FlowLayout();
					timeTempoDiViaggioPanelLayout.setVgap(0);
					timeTravelTimePanel.setLayout(timeTempoDiViaggioPanelLayout);
					timeTravelTimePanel.setOpaque(false);
					{
						loadingTimeTravelTimePanel = new JPanel();
						timeTravelTimePanel.add(loadingTimeTravelTimePanel);
						FlowLayout loadingTimeTempoDiViaggioPanelLayout = new FlowLayout();
						loadingTimeTempoDiViaggioPanelLayout.setVgap(0);
						loadingTimeTravelTimePanel.setLayout(loadingTimeTempoDiViaggioPanelLayout);
						loadingTimeTravelTimePanel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
						loadingTimeTravelTimePanel.setBackground(new java.awt.Color(35,188,235));
						{
							SpinnerListModel hourTempoDiViaggioSpinnerModel = new SpinnerListModel(hours2);
							travelTimeHourSpinner = new JSpinner();
							loadingTimeTravelTimePanel.add(travelTimeHourSpinner);
							travelTimeHourSpinner.setModel(hourTempoDiViaggioSpinnerModel);
							travelTimeHourSpinner.setToolTipText("Seleziona le ore di viaggio delle tue truppe");
						}
						{
							colonLabel2 = new JLabel();
							loadingTimeTravelTimePanel.add(colonLabel2);
							colonLabel2.setText(":");
						}
						{
							SpinnerListModel minuteTempoDiViaggioSpinnerModel = new SpinnerListModel(minutes);
							travelTimeMinuteSpinner = new JSpinner();
							loadingTimeTravelTimePanel.add(travelTimeMinuteSpinner);
							travelTimeMinuteSpinner.setModel(minuteTempoDiViaggioSpinnerModel);
							travelTimeMinuteSpinner.setToolTipText("Seleziona i minuti di viaggio delle tue truppe");
						}
					}
				}
				{
					startPanel = new JPanel();
					rootPanel.add(startPanel, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					FlowLayout partenzaPanelLayout = new FlowLayout();
					partenzaPanelLayout.setVgap(15);
					startPanel.setLayout(partenzaPanelLayout);
					startPanel.setOpaque(false);
					{
						startLabel = new JLabel();
						startPanel.add(startLabel);
						startLabel.setText("Partenza");
						startLabel.setFont(new java.awt.Font("Ebrima",1,28));
						startLabel.setForeground(new java.awt.Color(240,221,199));
					}
					{
						startButtonPanel = new JPanel();
						startButtonPanel.setOpaque(false);
						final FlowLayout startButtonPanelLayout = new FlowLayout();
						startButtonPanelLayout.setHgap(0);
						startButtonPanelLayout.setVgap(6);
						startButtonPanel.setLayout(startButtonPanelLayout);
						startPanel.add(startButtonPanel);
						startButtonPanel.setPreferredSize(new java.awt.Dimension(53, 55));
						{
							startButtonLabel = new JLabel();
							startButtonPanel.add(startButtonLabel);
							startButtonLabel.setIcon(images[2]);
							startButtonLabel.setToolTipText("Calcola l'orario di partenza");
							startButtonLabel.addMouseListener(new MouseListener() {
								public void mouseClicked(MouseEvent arg0) {
									Date arrivalDate;
									Time arrivalTime, travelTime;
									arrivalDate = new Date(arrivalDayComboBox.getSelectedIndex() + 1, arrivalMonthComboBox.getSelectedIndex() + 1, Integer.parseInt((String) arrivalYearComboBox.getSelectedItem()));
									if(arrivalDate.checkDate() == false)
										JOptionPane.showMessageDialog(null, "La data di arrivo selezionata non esiste!", "Errore nella data di arrivo", JOptionPane.WARNING_MESSAGE, images[12]);
									else {
										arrivalTime = new Time(Integer.parseInt((String) arrivalHourSpinner.getValue()), Integer.parseInt((String) arrivalMinuteSpinner.getValue()));
										travelTime = new Time(Integer.parseInt((String) travelTimeHourSpinner.getValue()), Integer.parseInt((String) travelTimeMinuteSpinner.getValue()));
										dateAndTimeStartLabel.setText(EmpireUI.start(arrivalDate, arrivalTime, travelTime));
										dateAndTimeStartPanel.setVisible(true);
									}
								}
								
								public void mouseEntered(MouseEvent arg0) {
									startButtonPanelLayout.setVgap(0);
									startButtonLabel.setIcon(images[3]);
								}
								
								public void mouseExited(MouseEvent arg0) {
									startButtonPanelLayout.setVgap(6);
									startButtonLabel.setIcon(images[2]);
								}
								
								public void mousePressed(MouseEvent arg0) {
									startButtonPanelLayout.setVgap(6);
									startButtonLabel.setIcon(images[2]);
								}
								
								public void mouseReleased(MouseEvent arg0) {
									startButtonPanelLayout.setVgap(0);
									startButtonLabel.setIcon(images[3]);
								}
							});
						}
					}
				}
				{
					contentPanel = new JPanel();
					FlowLayout contentPanelLayout = new FlowLayout();
					contentPanelLayout.setVgap(0);
					rootPanel.add(contentPanel, new GridBagConstraints(1, 6, 1, 2, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
					contentPanel.setLayout(contentPanelLayout);
					contentPanel.setOpaque(false);
					contentPanel.setPreferredSize(new java.awt.Dimension(556, 73));
					{
						dateAndTimeStartPanel = new JPanelWithBackground(images[6].getImage());
						contentPanel.add(dateAndTimeStartPanel);
						FlowLayout dateAndTimePartenzaPanelLayout = new FlowLayout();
						dateAndTimePartenzaPanelLayout.setVgap(15);
						dateAndTimeStartPanel.setLayout(dateAndTimePartenzaPanelLayout);
						dateAndTimeStartPanel.setOpaque(true);
						dateAndTimeStartPanel.setSize(254, 66);
						dateAndTimeStartPanel.setPreferredSize(new java.awt.Dimension(399, 66));
						dateAndTimeStartPanel.setVisible(false);
						{
							dateAndTimeStartLabel = new JLabel();
							dateAndTimeStartPanel.add(dateAndTimeStartLabel);
							dateAndTimeStartLabel.setText("");
							dateAndTimeStartLabel.setFont(new java.awt.Font("Ebrima",1,28));
							dateAndTimeStartLabel.setForeground(new java.awt.Color(128,64,64));
						}
					}
				}
			}
			this.setJMenuBar(menuBar);
			addWindowListener(new WindowListener() {
				public void windowClosed(WindowEvent evt) {
				}

				public void windowActivated(WindowEvent e) {
				}

				public void windowClosing(WindowEvent e) {
					showExitMessage();
				}

				public void windowDeactivated(WindowEvent e) {					
				}

				public void windowDeiconified(WindowEvent e) {
				}

				public void windowIconified(WindowEvent e) {
				}

				public void windowOpened(WindowEvent e) {					
				}
			});
			{
				menuBar = new JMenuBar();
				setJMenuBar(menuBar);
				{
					attackMenu = new JMenu();
					menuBar.add(attackMenu);
					attackMenu.setText("Attacco");
					attackMenu.setIcon(images[4]);
					attackMenu.setMnemonic('a');
					{
						startMenuItem = new JMenuItem();
						attackMenu.add(startMenuItem);
						startMenuItem.setText("Partenza");
						startMenuItem.setIcon(images[7]);
						startMenuItem.setToolTipText("Calcola l'orario di partenza");
						startMenuItem.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								Date arrivalDate;
								Time arrivalTime, travelTime;
								arrivalDate = new Date(arrivalDayComboBox.getSelectedIndex() + 1, arrivalMonthComboBox.getSelectedIndex() + 1, Integer.parseInt((String) arrivalYearComboBox.getSelectedItem()));
								if(arrivalDate.checkDate() == false)
									JOptionPane.showMessageDialog(null, "La data di arrivo selezionata non esiste!", "Errore nella data di arrivo", JOptionPane.WARNING_MESSAGE, images[12]);
								else {
									arrivalTime = new Time(Integer.parseInt((String) arrivalHourSpinner.getValue()), Integer.parseInt((String) arrivalMinuteSpinner.getValue()));
									travelTime = new Time(Integer.parseInt((String) travelTimeHourSpinner.getValue()), Integer.parseInt((String) travelTimeMinuteSpinner.getValue()));
									dateAndTimeStartLabel.setText(EmpireUI.start(arrivalDate, arrivalTime, travelTime));
									dateAndTimeStartPanel.setVisible(true);
								}
							}
						});
						startMenuItem.setMnemonic('p');
					}
					{
						attackMenuSeparator = new JSeparator();
						attackMenu.add(attackMenuSeparator);
					}
					{
						quitMenuItem = new JMenuItem();
						attackMenu.add(quitMenuItem);
						quitMenuItem.setText("Esci");
						quitMenuItem.setIcon(images[8]);
						quitMenuItem.setToolTipText("Esci dall'applicazione");
						quitMenuItem.setMnemonic('e');
						quitMenuItem.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								showExitMessage();
							}
						});
					}
				}
				{
					infoMenu = new JMenu();
					menuBar.add(infoMenu);
					infoMenu.setText("Info");
					infoMenu.setIcon(images[5]);
					infoMenu.setMnemonic('i');
					{
						infoMenuItem = new JMenuItem();
						infoMenu.add(infoMenuItem);
						infoMenuItem.setText("Informazioni su Empire Clock...");
						infoMenuItem.setToolTipText("Conoscerai chi ha lavorato a questa applicazione");
						infoMenuItem.setIcon(images[9]);
						infoMenuItem.setMnemonic('i');
						infoMenuItem.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								try {									
									JOptionPane.showMessageDialog(null, "<html><i><b>Empire Clock</b></i> è stata ideata e realizzata da <i>Andrea d'Argenio</i></html>\n" +
											"<html>con la collaborazione di <i>Alessia Capasso</i> per l'elaborazione</html>\n" +
											"della grafica.\n\n" +
											"<html><i><b>Segnalazione bug</b></i></html>\n" +
											"a.dargenio90@gmail.com\n\n" +
											"<html><i><b>Contatti e-mail</b></i></html>\n" +
											"<html><i>Andrea d'Argenio:</i> a.dargenio90@gmail.com</html>\n" +
											"<html><i>Alessia Capasso:</i> capassoalessia@gmail.com</html>", "Informazioni su Empire Clock", JOptionPane.INFORMATION_MESSAGE, images[10]);
								} catch (HeadlessException e) {
									e.printStackTrace();
								}
							}
						});
					}
				}
			}
			pack();
			this.setSize(562, 381);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}