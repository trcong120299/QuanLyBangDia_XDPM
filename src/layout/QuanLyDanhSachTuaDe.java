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
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class QuanLyDanhSachTuaDe  extends JFrame implements ActionListener{
	
	private JButton btnQLThueTraDia, btnQLDSKhachHang, btnQLDSTuaDe, btnQLCacKhoangPhi, btnDatCho, btnQLKhoDia, btnBaoCao;
	
	private JTable tblDSTieuDe;
	private DefaultTableModel tblModel;
	private JButton btnThemTieuDe, btnXoaTieuDe, btnCapNhatTieuDe, btnTrangThaiTieuDe;
	private JLabel lblDanhSach;
	
	public QuanLyDanhSachTuaDe() throws IOException {
		// TODO Auto-generated constructor stub
		
		Buider();
		setTitle("Quản lý danh sách tựa đề");
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\img\\logo.jpg"));
		setSize((int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
		setExtendedState(MAXIMIZED_BOTH); 
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		new QuanLyDanhSachTuaDe().setVisible(true);
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
		
		Box b1, b2, b3;
		boxRight.add(Box.createVerticalStrut(10));
		boxRight.add(b1 = Box.createHorizontalBox());
		b1.add(lblDanhSach = new JLabel("DANH SÁCH TIÊU ĐỀ"));
		lblDanhSach.setFont(new Font("Arial", Font.BOLD, 25));
		lblDanhSach.setForeground(Color.ORANGE);
		
		boxRight.add(Box.createVerticalStrut(10));
		boxRight.add(b2 = Box.createHorizontalBox());
		String [] header = {"ID", "Tên tiêu đề", "Số lượng đĩa", "Nhà sản xuất", "Đạo diễn", "Diễn viên chính", "Ngày phát hành", "Trạng thái"};
		tblModel = new DefaultTableModel(header, 0) {
			public boolean isCellEditable(int row, int column) {
				return false;
			};
		};
		b2.add(new JScrollPane(tblDSTieuDe = new JTable(tblModel), JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
		tblDSTieuDe.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tblDSTieuDe.getTableHeader().setEnabled(false);
		
		boxRight.add(Box.createVerticalStrut(10));
		boxRight.add(b3 = Box.createHorizontalBox());
		b3.add(btnThemTieuDe = new JButton("Thêm tiêu đề", new ImageIcon("img/icon_themtieude.png")));
		b3.add(Box.createHorizontalStrut(10));
		b3.add(btnXoaTieuDe = new JButton("Xóa tiêu đề", new ImageIcon("img/icon_xoatieude.png")));
		b3.add(Box.createHorizontalStrut(10));
		b3.add(btnCapNhatTieuDe = new JButton("Cập nhật tiêu đề", new ImageIcon("img/icon_capnhattieude.png")));
		b3.add(Box.createHorizontalStrut(10));
		b3.add(btnTrangThaiTieuDe = new JButton("Báo cáo trạng thái", new ImageIcon("img/icon_trangthaitieude.png")));
		
		btnThemTieuDe.setMaximumSize(new Dimension(150, 30));
		btnThemTieuDe.setBackground(Color.darkGray);
		btnThemTieuDe.setForeground(Color.CYAN);
		
		btnXoaTieuDe.setMaximumSize(new Dimension(150, 30));
		btnXoaTieuDe.setBackground(Color.darkGray);
		btnXoaTieuDe.setForeground(Color.CYAN);
		
		btnCapNhatTieuDe.setMaximumSize(new Dimension(150, 30));
		btnCapNhatTieuDe.setBackground(Color.darkGray);
		btnCapNhatTieuDe.setForeground(Color.CYAN);
		
		btnTrangThaiTieuDe.setMaximumSize(new Dimension(150, 30));
		btnTrangThaiTieuDe.setBackground(Color.darkGray);
		btnTrangThaiTieuDe.setForeground(Color.CYAN);
		
		boxRight.add(Box.createVerticalStrut(10));
		
		btnThemTieuDe.addActionListener(this);
		btnXoaTieuDe.addActionListener(this);
		btnCapNhatTieuDe.addActionListener(this);
		btnTrangThaiTieuDe.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object o = e.getSource();
		if(o.equals(btnThemTieuDe)) {
			ThemTieuDe frame = new ThemTieuDe();
		} else if(o.equals(btnXoaTieuDe)) {
			
		} else if(o.equals(btnCapNhatTieuDe)) {
			CapNhatTieuDe frame = new CapNhatTieuDe();
		} else if(o.equals(btnTrangThaiTieuDe)) {
			TrangThaiTieuDe frame = new TrangThaiTieuDe();
		}
		
	}

}
