package layout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class BaoCaoPhiTreHan extends JFrame implements ActionListener{
	
	private JButton btnQLThueTraDia, btnQLDSKhachHang, btnQLDSTuaDe, btnQLCacKhoangPhi, btnDatCho, btnQLKhoDia, btnBaoCao;
	
	private JButton btnDiaQuaHan, btnPhiTreHan, btnTongSoBanSao, btnDatGiuCho;
	private JTable tblPhiTreHan;
	private DefaultTableModel tblModelPhiTreHan;
	private Box boxTbl;
	private JLabel lblTongPhiTreHan, lblKhachHangNoNhieuNhat;
	private JTextField txtTongPhiTreHan, txtKhachHangNoNhieuNhat;
	private JButton btnInBaoCao;
	
	public BaoCaoPhiTreHan() throws IOException {
		// TODO Auto-generated constructor stub
		Buider();
		setTitle("Báo cáo về các phí trễ hạn");
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\img\\logo.jpg"));
		setSize((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
		setExtendedState(MAXIMIZED_BOTH); 
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, IOException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		new BaoCaoPhiTreHan().setVisible(true);
	}
	
	private void Buider() throws IOException {
		// TODO Auto-generated method stub
		Border raisedBevel = BorderFactory.createRaisedBevelBorder();
		Border loweredBevel = BorderFactory.createLoweredBevelBorder();
		
		Box box = Box.createVerticalBox();
		add(box);
		
		Box boxTop = Box.createHorizontalBox();
		box.add(Box.createVerticalStrut(5));
		box.add(boxTop);
		boxTop.setBorder(BorderFactory.createCompoundBorder(raisedBevel, loweredBevel));
		BufferedImage imageNorth = ImageIO.read(new File("img/banner.png"));
		ImageIcon imgNorth = new ImageIcon(imageNorth.getScaledInstance(1330, 200, imageNorth.SCALE_SMOOTH));
		JLabel showImage = new JLabel();
		showImage.setIcon(imgNorth);
		boxTop.add(showImage);
		
		Box boxCenter = Box.createHorizontalBox();
		box.add(boxCenter);
		
		Box boxLeft = Box.createVerticalBox();
		boxCenter.add(boxLeft);
		boxLeft.setBorder(BorderFactory.createCompoundBorder(raisedBevel, loweredBevel));
		boxLeft.setMaximumSize(new Dimension(225, 520));
		
		boxLeft.add(Box.createVerticalStrut(20));
		boxLeft.add(btnQLThueTraDia = new JButton("Quản Lý Thuê Trả Đĩa"));
		btnQLThueTraDia.setMaximumSize(new Dimension(225, 50));
		btnQLThueTraDia.setBackground(Color.darkGray);
		btnQLThueTraDia.setForeground(Color.CYAN);
		btnQLThueTraDia.setFont(new Font("Arial", Font.BOLD, 16));
		
		boxLeft.add(Box.createVerticalStrut(10));
		boxLeft.add(btnQLDSKhachHang = new JButton("Quản Lý DS Khách Hàng"));
		btnQLDSKhachHang.setMaximumSize(new Dimension(225, 50));
		btnQLDSKhachHang.setBackground(Color.darkGray);
		btnQLDSKhachHang.setForeground(Color.CYAN);
		btnQLDSKhachHang.setFont(new Font("Arial", Font.BOLD, 16));
		
		boxLeft.add(Box.createVerticalStrut(10));
		boxLeft.add(btnQLCacKhoangPhi = new JButton("Quản Lý Các Khoản Phí"));
		btnQLCacKhoangPhi.setMaximumSize(new Dimension(225, 50));
		btnQLCacKhoangPhi.setBackground(Color.darkGray);
		btnQLCacKhoangPhi.setForeground(Color.CYAN);
		btnQLCacKhoangPhi.setFont(new Font("Arial", Font.BOLD, 16));
		
		boxLeft.add(Box.createVerticalStrut(10));
		boxLeft.add(btnQLDSTuaDe = new JButton("Quản Lý DS Tựa Đề"));
		btnQLDSTuaDe.setMaximumSize(new Dimension(225, 50));
		btnQLDSTuaDe.setBackground(Color.darkGray);
		btnQLDSTuaDe.setForeground(Color.CYAN);
		btnQLDSTuaDe.setFont(new Font("Arial", Font.BOLD, 16));
		
		boxLeft.add(Box.createVerticalStrut(10));
		boxLeft.add(btnDatCho = new JButton("Quản Lý Đặt Chỗ"));
		btnDatCho.setMaximumSize(new Dimension(225, 50));
		btnDatCho.setBackground(Color.darkGray);
		btnDatCho.setForeground(Color.CYAN);
		btnDatCho.setFont(new Font("Arial", Font.BOLD, 16));
		
		boxLeft.add(Box.createVerticalStrut(10));
		boxLeft.add(btnQLKhoDia = new JButton("Quản Lý Kho Đĩa"));
		btnQLKhoDia.setMaximumSize(new Dimension(225, 50));
		btnQLKhoDia.setBackground(Color.darkGray);
		btnQLKhoDia.setForeground(Color.CYAN);
		btnQLKhoDia.setFont(new Font("Arial", Font.BOLD, 16));
		
		boxLeft.add(Box.createVerticalStrut(10));
		boxLeft.add(btnBaoCao = new JButton("Báo cáo"));
		btnBaoCao.setMaximumSize(new Dimension(225, 50));
		btnBaoCao.setBackground(Color.darkGray);
		btnBaoCao.setForeground(Color.CYAN);
		btnBaoCao.setFont(new Font("Arial", Font.BOLD, 16));		
		
		Box boxRight = Box.createVerticalBox();
		boxCenter.add(boxRight);
		boxRight.setBorder(BorderFactory.createCompoundBorder(raisedBevel, loweredBevel));
		boxRight.setMaximumSize(new Dimension(1115, 520));
		
		Box b0;
		boxRight.add(Box.createVerticalStrut(10));
		boxRight.add(b0 = Box.createHorizontalBox());
//		b0.setMaximumSize(new Dimension(1115, 40));
		b0.add(btnDiaQuaHan = new JButton("Về các đĩa quá hạn"));
		btnDiaQuaHan.setMaximumSize(new Dimension(200, 30));
		btnDiaQuaHan.setBackground(Color.darkGray);
		btnDiaQuaHan.setForeground(Color.CYAN);
		b0.add(Box.createHorizontalStrut(20));
		b0.add(btnPhiTreHan = new JButton("Về các khoản phí trễ hạn"));
		btnPhiTreHan.setMaximumSize(new Dimension(200, 30));
		btnPhiTreHan.setBackground(Color.darkGray);
		btnPhiTreHan.setForeground(Color.CYAN);
		b0.add(Box.createHorizontalStrut(20));
		b0.add(btnTongSoBanSao = new JButton("Về tổng số các bản sao đang có"));
		btnTongSoBanSao.setMaximumSize(new Dimension(200, 30));
		btnTongSoBanSao.setBackground(Color.darkGray);
		btnTongSoBanSao.setForeground(Color.CYAN);
		b0.add(Box.createHorizontalStrut(20));
		b0.add(btnDatGiuCho = new JButton("Về số lượng đặt giữ chỗ"));
		btnDatGiuCho.setMaximumSize(new Dimension(200, 30));
		btnDatGiuCho.setBackground(Color.darkGray);
		btnDatGiuCho.setForeground(Color.CYAN);
		
		boxRight.add(Box.createVerticalStrut(10));
		boxRight.add(boxTbl = Box.createHorizontalBox());
		boxTbl.setBorder(BorderFactory.createTitledBorder("Báo cáo"));
		boxTbl.setMaximumSize(new Dimension(1115, 480));
		String [] header = {"Mã đĩa", "Tiêu đề", "Phí trễ hạn", "Số ngày quá hạn", "Khách hàng thuê"};
		tblModelPhiTreHan = new DefaultTableModel(header, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		tblPhiTreHan = new JTable(tblModelPhiTreHan);
		tblPhiTreHan.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tblPhiTreHan.getTableHeader().setEnabled(false);
		
		boxTbl.add(new JScrollPane(tblPhiTreHan, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		
		Box boxTT;
		boxRight.add(Box.createVerticalStrut(10));
		boxRight.add(boxTT = Box.createHorizontalBox());
		boxTT.add(lblTongPhiTreHan = new JLabel("Tổng số phí trễ hạn: "));
		boxTT.add(txtTongPhiTreHan = new JTextField(30));
		boxTT.add(Box.createHorizontalStrut(10));
		boxTT.add(lblKhachHangNoNhieuNhat = new JLabel("Khách hàng nợ nhiều nhất: "));
		boxTT.add(txtKhachHangNoNhieuNhat = new JTextField(30));
		boxTT.add(Box.createHorizontalStrut(10));
		boxTT.add(btnInBaoCao = new JButton("In báo cáo", new ImageIcon("img/icon_in.png")));
		btnInBaoCao.setBackground(Color.darkGray);
		btnInBaoCao.setForeground(Color.CYAN);
		btnInBaoCao.setFont(new Font("Arial", Font.BOLD, 13));
		
		boxRight.add(Box.createVerticalStrut(10));
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
