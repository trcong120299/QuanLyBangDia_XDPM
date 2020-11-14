package layout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;

public class TrangChu extends JFrame{
	
	private JButton btnQLThueTraDia, btnQLDSKhachHang, btnQLDSTuaDe, btnQLCacKhoangPhi, btnDatCho, btnQLKhoDia, btnBaoCao;
	
	public TrangChu() throws IOException {
		// TODO Auto-generated constructor stub
		
		Buider_TrangChu();
		setTitle("Trang chủ");
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\img\\logo.jpg"));
		setSize((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
		setExtendedState(MAXIMIZED_BOTH); 
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		new TrangChu().setVisible(true);
	}

	private void Buider_TrangChu() throws IOException {
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
		
	}

}
