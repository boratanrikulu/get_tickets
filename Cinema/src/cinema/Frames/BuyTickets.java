/**
 * @author boratanrikulu
 * If you have any question about the project, you can contact me at http://boratanrikulu.me/contact
 */

package cinema.Frames;

import cinema.Objects.Movie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BuyTickets extends javax.swing.JFrame {

	private int xMouse;
	private int yMouse;
	private int movieID;
	private int customerID;
	private Movie movie;
	private Connection connection;
	private ImageIcon imageIcon;
	private JLabel[] seats;
	private ArrayList<Integer> selectedSeats;
	private ArrayList<Integer> takenSeats;
	private ImageIcon selectedSeatIcon;
	private ImageIcon takenSeatIcon;
	private String message;
	private PreparedStatement preparedStatement;
	
	public BuyTickets(Connection connection, ImageIcon imageIcon, ArrayList<Integer> selectedSeats, ArrayList<Integer> takenSeats, ImageIcon selectedSeatIcon, ImageIcon takenSeatIcon, String message, int movieID, int customerID, Movie movie) {
		initComponents();
		
		this.connection = connection;
		this.imageIcon = imageIcon;
		this.movieID = movieID;
		this.customerID = customerID;
		this.selectedSeats = selectedSeats;
		this.takenSeats = takenSeats;
		this.selectedSeatIcon = selectedSeatIcon;
		this.takenSeatIcon = takenSeatIcon;
		this.message = message;
		this.movie = movie;
		
		selectedSeatsLabel.setText(message);
		theMovieLabel.setText(movie.getTitle()+" ["+movie.getDate()+", "+movie.getTime()+"]");
		
		setSeatsArray();
		setSelectedSeats();
		setTakenSeats();
	}
	
	public void setSeatsArray() {
		seats = new JLabel[60];
		seats[0] = seat0;
		//<editor-fold defaultstate="collapsed" desc="and other 59s">
		seats[1] = seat1; seats[2] = seat2; seats[3] = seat3; seats[4] = seat4; seats[5] = seat5;
		seats[6] = seat6; seats[7] = seat7; seats[8] = seat8; seats[9] = seat9; seats[10] = seat10;
		seats[11] = seat11; seats[12] = seat12; seats[13] = seat13; seats[14] = seat14; seats[15] = seat15;
		seats[16] = seat16; seats[17] = seat17; seats[18] = seat18; seats[19] = seat19; seats[20] = seat20;
		seats[21] = seat21; seats[22] = seat22; seats[23] = seat23; seats[24] = seat24; seats[25] = seat25;
		seats[26] = seat26; seats[27] = seat27; seats[28] = seat28; seats[29] = seat29; seats[30] = seat30;
		seats[31] = seat31; seats[32] = seat32; seats[33] = seat33; seats[34] = seat34; seats[35] = seat35;
		seats[36] = seat36; seats[37] = seat37; seats[38] = seat38; seats[39] = seat39; seats[40] = seat40;
		seats[41] = seat41; seats[42] = seat42; seats[43] = seat43; seats[44] = seat44; seats[45] = seat45;
		seats[46] = seat46; seats[47] = seat47; seats[48] = seat48; seats[49] = seat49; seats[50] = seat50;
		seats[51] = seat51; seats[52] = seat52; seats[53] = seat53; seats[54] = seat54; seats[55] = seat55;
		seats[56] = seat56; seats[57] = seat57; seats[58] = seat58; seats[59] = seat59;
		//</editor-fold>
	}
	
	public void setSelectedSeats() {
		for(int counter : selectedSeats) {
			seats[counter].setIcon(selectedSeatIcon);
		}
	}
	
	public void setTakenSeats() {
		for(int counter : takenSeats) {
			seats[counter].setIcon(takenSeatIcon);
		}
	}
	
	public void buyTickets(java.awt.event.ActionEvent evt) {
		int flag = 0;
		for(int seatNumber : selectedSeats) {
			String query = "INSERT INTO sold_tickets(movieID, customerID, seatNumber) VALUES(?, ?, ?)" ;

			try {
				preparedStatement = connection.prepareStatement(query);

				preparedStatement.setInt(1, movieID);
				preparedStatement.setInt(2, customerID);
				preparedStatement.setInt(3, seatNumber+1);

				preparedStatement.execute();
				flag++;
			} catch (SQLException ex) {
				Logger.getLogger(BuyTickets.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
		if(flag != 0){
			JOptionPane.showMessageDialog(this, "The ticket was bought by you.\nYou will be directed to the previous page.");
			backButtonActionPerformed(evt);
		}
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        seatsPanel = new javax.swing.JPanel();
        seat0 = new javax.swing.JLabel();
        seat1 = new javax.swing.JLabel();
        seat2 = new javax.swing.JLabel();
        seat3 = new javax.swing.JLabel();
        seat4 = new javax.swing.JLabel();
        seat5 = new javax.swing.JLabel();
        seat6 = new javax.swing.JLabel();
        seat7 = new javax.swing.JLabel();
        seat8 = new javax.swing.JLabel();
        seat9 = new javax.swing.JLabel();
        seat10 = new javax.swing.JLabel();
        seat11 = new javax.swing.JLabel();
        seat12 = new javax.swing.JLabel();
        seat13 = new javax.swing.JLabel();
        seat14 = new javax.swing.JLabel();
        seat15 = new javax.swing.JLabel();
        seat16 = new javax.swing.JLabel();
        seat17 = new javax.swing.JLabel();
        seat18 = new javax.swing.JLabel();
        seat19 = new javax.swing.JLabel();
        seat20 = new javax.swing.JLabel();
        seat21 = new javax.swing.JLabel();
        seat22 = new javax.swing.JLabel();
        seat23 = new javax.swing.JLabel();
        seat24 = new javax.swing.JLabel();
        seat25 = new javax.swing.JLabel();
        seat26 = new javax.swing.JLabel();
        seat27 = new javax.swing.JLabel();
        seat28 = new javax.swing.JLabel();
        seat29 = new javax.swing.JLabel();
        seat30 = new javax.swing.JLabel();
        seat31 = new javax.swing.JLabel();
        seat32 = new javax.swing.JLabel();
        seat33 = new javax.swing.JLabel();
        seat34 = new javax.swing.JLabel();
        seat35 = new javax.swing.JLabel();
        seat36 = new javax.swing.JLabel();
        seat37 = new javax.swing.JLabel();
        seat38 = new javax.swing.JLabel();
        seat39 = new javax.swing.JLabel();
        seat40 = new javax.swing.JLabel();
        seat41 = new javax.swing.JLabel();
        seat42 = new javax.swing.JLabel();
        seat43 = new javax.swing.JLabel();
        seat44 = new javax.swing.JLabel();
        seat45 = new javax.swing.JLabel();
        seat46 = new javax.swing.JLabel();
        seat47 = new javax.swing.JLabel();
        seat48 = new javax.swing.JLabel();
        seat49 = new javax.swing.JLabel();
        seat50 = new javax.swing.JLabel();
        seat51 = new javax.swing.JLabel();
        seat52 = new javax.swing.JLabel();
        seat53 = new javax.swing.JLabel();
        seat54 = new javax.swing.JLabel();
        seat55 = new javax.swing.JLabel();
        seat56 = new javax.swing.JLabel();
        seat57 = new javax.swing.JLabel();
        seat58 = new javax.swing.JLabel();
        seat59 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        payTheTickets = new javax.swing.JButton();
        selectedSeatsLabel = new javax.swing.JLabel();
        posterPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cardNumberArea = new javax.swing.JTextField();
        expireDateArea1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        expireDateArea2 = new javax.swing.JTextField();
        cvc2Area = new javax.swing.JTextField();
        vacantImageLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vacantImageLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        vacantImageLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        theMovieLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinema - Buy The Tickets");

        MainPanel.setBackground(new java.awt.Color(231, 232, 235));
        MainPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MainPanelMouseDragged(evt);
            }
        });
        MainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MainPanelMousePressed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        seatsPanel.setBackground(new java.awt.Color(217, 193, 183));

        seat0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        seat59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/screen.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(122, 24, 26));
        jLabel2.setText("A");

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(122, 24, 26));
        jLabel6.setText("SCREEN");

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(122, 24, 26));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("12");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(122, 24, 26));
        jLabel8.setText("B");

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(122, 24, 26));
        jLabel10.setText("C");

        jLabel12.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(122, 24, 26));
        jLabel12.setText("D");

        jLabel14.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(122, 24, 26));
        jLabel14.setText("E");

        jLabel16.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(122, 24, 26));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("11");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel21.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(122, 24, 26));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("10");
        jLabel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel22.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(122, 24, 26));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("9");
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel23.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(122, 24, 26));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("8");
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel24.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(122, 24, 26));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("7");
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel25.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(122, 24, 26));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("6");
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel26.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(122, 24, 26));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("5");
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel27.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(122, 24, 26));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("4");
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel28.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(122, 24, 26));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("3");
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel29.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(122, 24, 26));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("2");
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel30.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(122, 24, 26));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("1");
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout seatsPanelLayout = new javax.swing.GroupLayout(seatsPanel);
        seatsPanel.setLayout(seatsPanelLayout);
        seatsPanelLayout.setHorizontalGroup(
            seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatsPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(25, 25, 25))
            .addGroup(seatsPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatsPanelLayout.createSequentialGroup()
                        .addComponent(seat24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat35))
                    .addGroup(seatsPanelLayout.createSequentialGroup()
                        .addComponent(seat12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat23))
                    .addGroup(seatsPanelLayout.createSequentialGroup()
                        .addComponent(seat36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat47))
                    .addGroup(seatsPanelLayout.createSequentialGroup()
                        .addComponent(seat48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat55)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat57)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seat59))
                    .addGroup(seatsPanelLayout.createSequentialGroup()
                        .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat0))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seat1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seat2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seat3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seat4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seat5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seat6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seat7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seat8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seat9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seat10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seat11))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatsPanelLayout.createSequentialGroup()
                    .addContainerGap(260, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(236, 236, 236)))
        );
        seatsPanelLayout.setVerticalGroup(
            seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatsPanelLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel16)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seat5)
                    .addComponent(seat4)
                    .addComponent(seat3)
                    .addComponent(seat2)
                    .addComponent(seat1)
                    .addComponent(seat0)
                    .addComponent(seat6)
                    .addComponent(seat7)
                    .addComponent(seat8)
                    .addComponent(seat10)
                    .addComponent(seat11)
                    .addComponent(seat9)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seat12)
                    .addComponent(seat13)
                    .addComponent(seat14)
                    .addComponent(seat15)
                    .addComponent(seat16)
                    .addComponent(seat17)
                    .addComponent(seat18)
                    .addComponent(seat19)
                    .addComponent(seat20)
                    .addComponent(seat21)
                    .addComponent(seat22)
                    .addComponent(seat23)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seat24)
                    .addComponent(seat25)
                    .addComponent(seat26)
                    .addComponent(seat27)
                    .addComponent(seat28)
                    .addComponent(seat29)
                    .addComponent(seat30)
                    .addComponent(seat31)
                    .addComponent(seat32)
                    .addComponent(seat33)
                    .addComponent(seat34)
                    .addComponent(seat35)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seat36)
                    .addComponent(seat37)
                    .addComponent(seat38)
                    .addComponent(seat39)
                    .addComponent(seat40)
                    .addComponent(seat41)
                    .addComponent(seat42)
                    .addComponent(seat43)
                    .addComponent(seat44)
                    .addComponent(seat45)
                    .addComponent(seat46)
                    .addComponent(seat47)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seat48)
                    .addComponent(seat49)
                    .addComponent(seat50)
                    .addComponent(seat51)
                    .addComponent(seat52)
                    .addComponent(seat53)
                    .addComponent(seat54)
                    .addComponent(seat55)
                    .addComponent(seat56)
                    .addComponent(seat57)
                    .addComponent(seat58)
                    .addComponent(seat59)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
            .addGroup(seatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatsPanelLayout.createSequentialGroup()
                    .addContainerGap(308, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(58, 58, 58)))
        );

        payTheTickets.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        payTheTickets.setText("Pay The Tickets");
        payTheTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payTheTicketsActionPerformed(evt);
            }
        });

        selectedSeatsLabel.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        selectedSeatsLabel.setForeground(new java.awt.Color(122, 24, 26));

        jLabel17.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(122, 24, 26));
        jLabel17.setText("Card Number :");

        jLabel19.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(122, 24, 26));
        jLabel19.setText("Expire Date    :");

        jLabel20.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(122, 24, 26));
        jLabel20.setText("CVC2               :");

        cardNumberArea.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N

        expireDateArea1.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(122, 24, 26));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("/");

        expireDateArea2.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N

        cvc2Area.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N

        javax.swing.GroupLayout posterPanelLayout = new javax.swing.GroupLayout(posterPanel);
        posterPanel.setLayout(posterPanelLayout);
        posterPanelLayout.setHorizontalGroup(
            posterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, posterPanelLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(posterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(posterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(posterPanelLayout.createSequentialGroup()
                        .addComponent(expireDateArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(expireDateArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cardNumberArea, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cvc2Area, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        posterPanelLayout.setVerticalGroup(
            posterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, posterPanelLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(posterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardNumberArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(posterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expireDateArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expireDateArea1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(posterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cvc2Area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        vacantImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/vacant-seat.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(122, 24, 26));
        jLabel3.setText("Vacant");

        vacantImageLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/selected-seat.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(122, 24, 26));
        jLabel4.setText("Selected");

        vacantImageLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/taken-seat.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(122, 24, 26));
        jLabel5.setText("Taken");

        theMovieLabel.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        theMovieLabel.setForeground(new java.awt.Color(122, 24, 26));
        theMovieLabel.setText("The Movie [TIME]");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MainPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(selectedSeatsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(payTheTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(vacantImageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(vacantImageLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(vacantImageLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(theMovieLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(seatsPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(posterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backButton)))
                .addGap(40, 40, 40))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(backButton)
                .addGap(48, 48, 48)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vacantImageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vacantImageLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(vacantImageLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(posterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seatsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(theMovieLabel)
                .addGap(12, 12, 12)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectedSeatsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payTheTickets, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
		ShowSeats showSeats = new ShowSeats(connection, imageIcon, movieID, customerID, movie);

		showSeats.setLocation(this.getLocation());
		this.dispose();
		showSeats.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void MainPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMouseDragged
		int x = evt.getXOnScreen();
		int y = evt.getYOnScreen();

		this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MainPanelMouseDragged

    private void MainPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainPanelMousePressed
		this.xMouse = evt.getX();
		this.yMouse = evt.getY() + 30; // 30 is for the top panel of the system.
    }//GEN-LAST:event_MainPanelMousePressed

    private void payTheTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payTheTicketsActionPerformed
		String cardNumber = this.cardNumberArea.getText();
		String expireDate1 = this.expireDateArea1.getText();
		String expireDate2 = this.expireDateArea2.getText();
		String cvc2 = this.cvc2Area.getText();
		
		if(cardNumber.equals("") || expireDate1.equals("") || expireDate2.equals("") || cvc2.equals("")){
			JOptionPane.showMessageDialog(this, "Please fill out all information."); // show an error if informations is not completed.
		}
		else {
			buyTickets(evt);	
		}
    }//GEN-LAST:event_payTheTicketsActionPerformed

	public static void main(String args[]) {
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(BuyTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(BuyTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(BuyTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(BuyTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/*java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new BuyTickets().setVisible(true);
			}
		});*/
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cardNumberArea;
    private javax.swing.JTextField cvc2Area;
    private javax.swing.JTextField expireDateArea1;
    private javax.swing.JTextField expireDateArea2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton payTheTickets;
    private javax.swing.JPanel posterPanel;
    private javax.swing.JLabel seat0;
    private javax.swing.JLabel seat1;
    private javax.swing.JLabel seat10;
    private javax.swing.JLabel seat11;
    private javax.swing.JLabel seat12;
    private javax.swing.JLabel seat13;
    private javax.swing.JLabel seat14;
    private javax.swing.JLabel seat15;
    private javax.swing.JLabel seat16;
    private javax.swing.JLabel seat17;
    private javax.swing.JLabel seat18;
    private javax.swing.JLabel seat19;
    private javax.swing.JLabel seat2;
    private javax.swing.JLabel seat20;
    private javax.swing.JLabel seat21;
    private javax.swing.JLabel seat22;
    private javax.swing.JLabel seat23;
    private javax.swing.JLabel seat24;
    private javax.swing.JLabel seat25;
    private javax.swing.JLabel seat26;
    private javax.swing.JLabel seat27;
    private javax.swing.JLabel seat28;
    private javax.swing.JLabel seat29;
    private javax.swing.JLabel seat3;
    private javax.swing.JLabel seat30;
    private javax.swing.JLabel seat31;
    private javax.swing.JLabel seat32;
    private javax.swing.JLabel seat33;
    private javax.swing.JLabel seat34;
    private javax.swing.JLabel seat35;
    private javax.swing.JLabel seat36;
    private javax.swing.JLabel seat37;
    private javax.swing.JLabel seat38;
    private javax.swing.JLabel seat39;
    private javax.swing.JLabel seat4;
    private javax.swing.JLabel seat40;
    private javax.swing.JLabel seat41;
    private javax.swing.JLabel seat42;
    private javax.swing.JLabel seat43;
    private javax.swing.JLabel seat44;
    private javax.swing.JLabel seat45;
    private javax.swing.JLabel seat46;
    private javax.swing.JLabel seat47;
    private javax.swing.JLabel seat48;
    private javax.swing.JLabel seat49;
    private javax.swing.JLabel seat5;
    private javax.swing.JLabel seat50;
    private javax.swing.JLabel seat51;
    private javax.swing.JLabel seat52;
    private javax.swing.JLabel seat53;
    private javax.swing.JLabel seat54;
    private javax.swing.JLabel seat55;
    private javax.swing.JLabel seat56;
    private javax.swing.JLabel seat57;
    private javax.swing.JLabel seat58;
    private javax.swing.JLabel seat59;
    private javax.swing.JLabel seat6;
    private javax.swing.JLabel seat7;
    private javax.swing.JLabel seat8;
    private javax.swing.JLabel seat9;
    private javax.swing.JPanel seatsPanel;
    private javax.swing.JLabel selectedSeatsLabel;
    private javax.swing.JLabel theMovieLabel;
    private javax.swing.JLabel vacantImageLabel;
    private javax.swing.JLabel vacantImageLabel1;
    private javax.swing.JLabel vacantImageLabel2;
    // End of variables declaration//GEN-END:variables
}