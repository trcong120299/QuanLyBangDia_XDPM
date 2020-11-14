package layout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class CapNhatTieuDe extends JFrame implements ActionListener{
	
	private JLabel lblThongTin, lblTenTieuDe, lblSoLuongDia, lblNhaSanXuat, lblDaoDien, lblDienVienChinh, lblNgayPhatHanh, lblTrangThai;
	private JTextField txtThongTin, txtTenTieuDe, txtSoLuongDia, txtNhaSanXuat, txtDaoDien;
	private UtilDateModel dateModel;
	private JDatePickerImpl txtNgayPhatHanh;
	private JRadioButton radDuocGiuCho, radConTrong;
	private JTextArea txaDienVienChinh;
	private JButton btnCapNhat, btnHuy;
	
	public CapNhatTieuDe() {
		// TODO Auto-generated constructor stub
		Buider();
		setTitle("Cập nhật tiêu đề");
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\img\\logo.jpg"));
		setSize(500, 400);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	private void Buider() {
		// TODO Auto-generated method stub
		
		Box box;
		add(box = Box.createVerticalBox());
		
		Box b0;
		box.add(Box.createVerticalStrut(10));
		box.add(b0 = Box.createHorizontalBox());
		b0.add(lblThongTin = new JLabel("Thông tin tiêu đề"));
		lblThongTin.setFont(new Font("Arial", Font.BOLD, 25));
		lblThongTin.setForeground(Color.ORANGE);
		
		Box b1;
		box.add(Box.createVerticalStrut(10));
		box.add(b1 = Box.createHorizontalBox());
		b1.setMaximumSize(new Dimension(500, 30));
		b1.add(Box.createHorizontalStrut(10));
		b1.add(lblTenTieuDe = new JLabel("Tên tiêu đề: "));
		b1.add(txtTenTieuDe = new JTextField());
		b1.add(Box.createHorizontalStrut(10));
		
		Box b2;
		box.add(Box.createVerticalStrut(10));
		box.add(b2 = Box.createHorizontalBox());
		b2.setMaximumSize(new Dimension(500, 30));
		b2.add(Box.createHorizontalStrut(10));
		b2.add(lblSoLuongDia = new JLabel("Số lượng đĩa: "));
		b2.add(txtSoLuongDia = new JTextField());
		b2.add(Box.createHorizontalStrut(10));
		
		Box b3;
		box.add(Box.createVerticalStrut(10));
		box.add(b3 = Box.createHorizontalBox());
		b3.setMaximumSize(new Dimension(500, 30));
		b3.add(Box.createHorizontalStrut(10));
		b3.add(lblNhaSanXuat = new JLabel("Nhà sản xuất: "));
		b3.add(txtNhaSanXuat = new JTextField());
		b3.add(Box.createHorizontalStrut(10));
		
		Box b4;
		box.add(Box.createVerticalStrut(10));
		box.add(b4 = Box.createHorizontalBox());
		b4.setMaximumSize(new Dimension(500, 30));
		b4.add(Box.createHorizontalStrut(10));
		b4.add(lblDaoDien = new JLabel("Đạo diễn: "));
		b4.add(txtDaoDien = new JTextField());
		b4.add(Box.createHorizontalStrut(10));
		
		Box b5;
		box.add(Box.createVerticalStrut(10));
		box.add(b5 = Box.createHorizontalBox());
		b5.setMaximumSize(new Dimension(500, 100));
		b5.add(Box.createHorizontalStrut(10));
		b5.add(lblDienVienChinh = new JLabel("Diễn viên chính: "));
		b5.add(new JScrollPane(txaDienVienChinh = new JTextArea(5, 80), JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
		txaDienVienChinh.setLineWrap(true);
		txaDienVienChinh.setWrapStyleWord(true);
		b5.add(Box.createHorizontalStrut(10));
		
		Box b6;
		box.add(Box.createVerticalStrut(10));
		box.add(b6 = Box.createHorizontalBox());
		b6.setMaximumSize(new Dimension(500, 30));
		b6.add(Box.createHorizontalStrut(10));
		b6.add(lblNgayPhatHanh = new JLabel("Ngày phát hành: "));
		dateModel = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(dateModel);
		b6.add(txtNgayPhatHanh = new JDatePickerImpl(datePanel, new DinhDangNgay()));
		b6.add(Box.createHorizontalStrut(10));
		
		Box b7;
		box.add(Box.createVerticalStrut(10));
		box.add(b7 = Box.createHorizontalBox());
		b7.setMaximumSize(new Dimension(500, 30));
		b7.add(Box.createHorizontalStrut(10));
		b7.add(lblTrangThai = new JLabel("Trạng thái: "));
		b7.add(Box.createHorizontalStrut(100));
		b7.add(radDuocGiuCho = new JRadioButton("Đang được giữ chỗ"));
		b7.add(Box.createHorizontalStrut(20));
		b7.add(radConTrong = new JRadioButton("Còn trống"));
		radConTrong.setSelected(true);
		ButtonGroup group = new ButtonGroup();
		group.add(radConTrong); group.add(radDuocGiuCho);
		
		Box b8;
		box.add(Box.createVerticalStrut(10));
		box.add(b8 = Box.createHorizontalBox());
		b8.add(btnCapNhat = new JButton("Cập nhật tiêu đề", new ImageIcon("img/icon_capnhattieude.png")));
		b8.add(Box.createHorizontalStrut(20));
		b8.add(btnHuy = new JButton("Hủy", new ImageIcon("img/icon_huy.png")));
		
		btnCapNhat.setMaximumSize(new Dimension(150, 30));
		btnCapNhat.setBackground(Color.darkGray);
		btnCapNhat.setForeground(Color.CYAN);
		btnHuy.setMaximumSize(new Dimension(150, 30));
		btnHuy.setBackground(Color.darkGray);
		btnHuy.setForeground(Color.CYAN);
		
		lblTenTieuDe.setPreferredSize(lblNgayPhatHanh.getPreferredSize());
		lblSoLuongDia.setPreferredSize(lblNgayPhatHanh.getPreferredSize());
		lblNhaSanXuat.setPreferredSize(lblNgayPhatHanh.getPreferredSize());
		lblDaoDien.setPreferredSize(lblNgayPhatHanh.getPreferredSize());
		lblDienVienChinh.setPreferredSize(lblNgayPhatHanh.getPreferredSize());
		lblTrangThai.setPreferredSize(lblNgayPhatHanh.getPreferredSize());
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
		new CapNhatTieuDe();
	}

}
