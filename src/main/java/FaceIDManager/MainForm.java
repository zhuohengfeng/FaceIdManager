package FaceIDManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JButton mBtnInsert;
    private JPanel mMainJPanel;

    /**
     * 构造函数，初始化子控件
     */
    public MainForm() {
        initView();
    }

    /**
     * 初始化控件，绑定事件等
     */
    private void initView() {
        mBtnInsert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    System.out.println("addActionListener 开始写入数据库");
                } catch (Exception e1) {
                    System.out.println("[Error]addActionListener 发生错误, e1="+e1.getMessage());
                    e1.printStackTrace();
                }
            }
        });
    }

    /**
     * 创建并显示GUI。出于线程安全的考虑，
     * 这个方法在事件调用线程中调用。
     */
    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        // 创建及设置窗口
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().mMainJPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setLocationRelativeTo(null);//在屏幕中居中显示
        frame.setTitle("人脸特征库管理");
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // 显示应用 GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}

