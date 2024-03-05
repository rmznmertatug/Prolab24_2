
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener {

    JFrame frame;
    JButton buton1,buton2,buton3;
    JButton butongeri;
    JButton butonadmin;
    JButton butonfirma;
    JButton butonfirmaekle;
    JButton butonfirmasil;
    JButton butonhizmet;
    JButton butonaracekle;
    JButton butonaracsil;
    JButton butonkz;
    JButton butongetir;
    JLabel mainlabel;
    JLabel usernamelabel;
    JLabel passwordlabel;
    JLabel errorlabel;
    JLabel firmacblabel;
    JLabel hizmetlabel;
    JLabel yenifirmauslabel;
    JLabel yenifirmapwlabel;
    JLabel yeniuserror;
    JLabel araccblabel;
    JLabel yeniaraclabel;
    JLabel yeniseferlabel;
    JLabel firmaseclabel;
    JLabel gunseclabel;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JPanel panelgeri;
    JComboBox firmacb;
    JComboBox araccb;
    JComboBox yeniaraccb;
    JComboBox yenisefercb;
    JComboBox firmaseccb;
    JComboBox gunseccb;
    Admin admin;
    ArrayList<Company> firmalist;
    ArrayList <Trip> triplist;
    ArrayList <Vehicle> vhlist;
    JTextField username;
    JTextField yenius;
    JTextField yenipw;
    JPasswordField password;
    Random rand = new Random();
    int firma = -1;
    int upper = 7;
    int hizmet=1000;
    
    ArrayList <String> route1;
    ArrayList <String> route2;
    ArrayList <String> route3;
    ArrayList <String> route4;
    ArrayList <String> route5;
    ArrayList <String> route6;
    ArrayList <Route> routelist;
    
    MainFrame() {
        
        frame = new JFrame();
        frame.setTitle("Rezervasyon Sitesi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(175, 219, 245));

        ImageIcon icon = new ImageIcon("src/main/415898_airport_icon.png");
        frame.setIconImage(icon.getImage());

        buton1 = new JButton();
        buton2 = new JButton();
        buton3 = new JButton();
        butongeri = new JButton();
        butonadmin = new JButton();
        butonfirma = new JButton();
        butonfirmaekle = new JButton();
        butonfirmasil = new JButton();
        butonhizmet = new JButton();
        butonaracekle = new JButton();
        butonaracsil = new JButton();
        butonkz = new JButton();
        butongetir = new JButton();

        buton1.setHorizontalAlignment(JButton.CENTER);
        buton1.setVerticalAlignment(JButton.CENTER);
        buton1.setBounds(10, 10, 120, 40);
        buton1.setText("Admin Girişi");
        buton1.addActionListener(this);
        buton2.setHorizontalAlignment(JButton.CENTER);
        buton2.setVerticalAlignment(JButton.CENTER);
        buton2.setBounds(10, 10, 120, 40);
        buton2.setText("Firma Girişi");
        buton2.addActionListener(this);
        buton3.setHorizontalAlignment(JButton.CENTER);
        buton3.setVerticalAlignment(JButton.CENTER);
        buton3.setBounds(10, 10, 120, 40);
        buton3.setText("Kullanıcı Girişi");
        buton3.addActionListener(this);
        butongeri.setHorizontalAlignment(JButton.CENTER);
        butongeri.setVerticalAlignment(JButton.CENTER);
        butongeri.setBounds(10, 10, 120, 40);
        butongeri.setText("Geri Dön");
        butongeri.addActionListener(this);
        butonadmin.setHorizontalAlignment(JButton.CENTER);
        butonadmin.setVerticalAlignment(JButton.CENTER);
        butonadmin.setBounds(365, 222, 70, 25);
        butonadmin.setText("Giriş");
        butonadmin.addActionListener(this);
        butonfirma.setHorizontalAlignment(JButton.CENTER);
        butonfirma.setVerticalAlignment(JButton.CENTER);
        butonfirma.setBounds(365, 222, 70, 25);
        butonfirma.setText("Giriş");
        butonfirma.addActionListener(this);
        butonfirmaekle.setHorizontalAlignment(JButton.CENTER);
        butonfirmaekle.setVerticalAlignment(JButton.CENTER);
        butonfirmaekle.setBounds(275, 370, 100, 30);
        butonfirmaekle.setText("Firma Ekle");
        butonfirmaekle.addActionListener(this);
        butonfirmasil.setHorizontalAlignment(JButton.CENTER);
        butonfirmasil.setVerticalAlignment(JButton.CENTER);
        butonfirmasil.setBounds(425, 370, 100, 30);
        butonfirmasil.setText("Firma Sil");
        butonfirmasil.addActionListener(this);
        butonhizmet.setHorizontalAlignment(JButton.CENTER);
        butonhizmet.setVerticalAlignment(JButton.CENTER);
        butonhizmet.setBounds(475, 180, 100, 20);
        butonhizmet.setText("Değiştir");
        butonhizmet.addActionListener(this);
        butonaracekle.setHorizontalAlignment(JButton.CENTER);
        butonaracekle.setVerticalAlignment(JButton.CENTER);
        butonaracekle.setBounds(275, 370, 100, 30);
        butonaracekle.setText("Araç Ekle");
        butonaracekle.addActionListener(this);
        butonaracsil.setHorizontalAlignment(JButton.CENTER);
        butonaracsil.setVerticalAlignment(JButton.CENTER);
        butonaracsil.setBounds(425, 370, 100, 30);
        butonaracsil.setText("Araç Sil");
        butonaracsil.addActionListener(this);
        butonkz.setHorizontalAlignment(JButton.CENTER);
        butonkz.setVerticalAlignment(JButton.CENTER);
        butonkz.setBounds(425, 180, 150, 20);
        butonkz.setText("K-Z Durumu");
        butonkz.addActionListener(this);
        butongetir.setHorizontalAlignment(JButton.CENTER);
        butongetir.setVerticalAlignment(JButton.CENTER);
        butongetir.setBounds(425, 210, 150, 20);
        butongetir.setText("Seferleri Getir");
        butongetir.addActionListener(this);
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panelgeri = new JPanel();

        username = new JTextField(25);
        username.setHorizontalAlignment(JTextField.LEFT);
        username.setBounds(325, 150, 150, 20);
        password = new JPasswordField(25);
        password.setHorizontalAlignment(JTextField.LEFT);
        password.setBounds(325, 180, 150, 20);
        yenius = new JTextField(25);
        yenius.setHorizontalAlignment(JTextField.LEFT);
        yenius.setBounds(425, 240, 150, 20);
        yenipw = new JTextField(25);
        yenipw.setHorizontalAlignment(JTextField.LEFT);
        yenipw.setBounds(425, 270, 150, 20);

        panel1.setBackground(new Color(247, 159, 121));
        panel1.setBounds(100, 450, 140, 60);
        panel1.setLayout(null);
        panel2.setBackground(new Color(186, 146, 221));
        panel2.setBounds(330, 450, 140, 60);
        panel2.setLayout(null);
        panel3.setBackground(new Color(155, 253, 197));
        panel3.setBounds(560, 450, 140, 60);
        panel3.setLayout(null);
        panelgeri.setBackground(new Color(175, 219, 245));
        panelgeri.setBounds(330, 450, 140, 60);
        panelgeri.setLayout(null);

        mainlabel = new JLabel();
        mainlabel.setText("Rezervasyon Sitesine Hoşgeldiniz");
        mainlabel.setVerticalTextPosition(JLabel.TOP);
        mainlabel.setHorizontalTextPosition(JLabel.CENTER);
        mainlabel.setForeground(Color.black);
        mainlabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 20));
        mainlabel.setBackground(new Color(170, 170, 170));
        mainlabel.setOpaque(true);
        mainlabel.setVerticalAlignment(JLabel.CENTER);
        mainlabel.setHorizontalAlignment(JLabel.CENTER);
        mainlabel.setBounds(170, 50, 460, 50);

        usernamelabel = new JLabel();
        usernamelabel.setText("Kullanıcı Adı");
        usernamelabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        usernamelabel.setBounds(225, 150, 100, 20);
        passwordlabel = new JLabel();
        passwordlabel.setText("Şifre");
        passwordlabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        passwordlabel.setBounds(225, 180, 100, 20);
        errorlabel = new JLabel();
        errorlabel.setText("Kullanıcı adı veya şifre yanlış");
        errorlabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        errorlabel.setBounds(320, 260, 200, 20);
        firmacblabel = new JLabel();
        firmacblabel.setText("Firmalar");
        firmacblabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        firmacblabel.setBounds(225, 150, 100, 20);
        hizmetlabel = new JLabel();
        hizmetlabel.setText("Hizmet Bedeli : "+hizmet+" TL");
        hizmetlabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        hizmetlabel.setBounds(225, 180, 200, 20);
        yenifirmauslabel = new JLabel();
        yenifirmauslabel.setText("Yeni Firma Adı");
        yenifirmauslabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        yenifirmauslabel.setBounds(225, 240, 200, 20);
        yenifirmapwlabel = new JLabel();
        yenifirmapwlabel.setText("Yeni Firma Şifresi");
        yenifirmapwlabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        yenifirmapwlabel.setBounds(225, 270, 200, 20);
        yeniuserror = new JLabel();
        yeniuserror.setText("Firma adını kontrol ediniz");
        yeniuserror.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        yeniuserror.setBounds(365, 300, 210, 20);
        araccblabel = new JLabel();
        araccblabel.setText("Araçlar");
        araccblabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        araccblabel.setBounds(225, 150, 100, 20);
        yeniaraclabel = new JLabel();
        yeniaraclabel.setText("Araç Türü");
        yeniaraclabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        yeniaraclabel.setBounds(225, 240, 200, 20);
        yeniseferlabel = new JLabel();
        yeniseferlabel.setText("Sefer");
        yeniseferlabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        yeniseferlabel.setBounds(425, 240, 200, 20);
        firmaseclabel = new JLabel();
        firmaseclabel.setText("Firma Seçimi");
        firmaseclabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        firmaseclabel.setBounds(225, 150, 100, 20);
        gunseclabel = new JLabel();
        gunseclabel.setText("Gün Seçimi");
        gunseclabel.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
        gunseclabel.setBounds(225, 180, 200, 20);
        
        
        route1 = new ArrayList<>();
        route1.add("İstanbul");
        route1.add("Kocaeli");
        route1.add("Bilecik");
        route1.add("Eskişehir");
        route1.add("Ankara");
        route1.add("Eskişehir");
        route1.add("Bilecik");
        route1.add("Kocaeli");
        route1.add("İstanbul");
        route2 = new ArrayList<>();
        route2.add("İstanbul");
        route2.add("Kocaeli");
        route2.add("Bilecik");
        route2.add("Eskişehir");
        route2.add("Konya");
        route2.add("Eskişehir");
        route2.add("Bilecik");
        route2.add("Kocaeli");
        route2.add("İstanbul");
        route3 = new ArrayList<>();
        route3.add("İstanbul");
        route3.add("Kocaeli");
        route3.add("Ankara");
        route3.add("Kocaeli");
        route3.add("İstanbul");
        route3.add("Kocaeli");
        route3.add("Ankara");
        route3.add("Kocaeli");
        route3.add("İstanbul");
        route4 = new ArrayList<>();
        route4.add("İstanbul");
        route4.add("Kocaeli");
        route4.add("Eskişehir");
        route4.add("Konya");
        route4.add("Eskişehir");
        route4.add("Kocaeli");
        route4.add("İstanbul");
        route5 = new ArrayList<>();
        route5.add("İstanbul");
        route5.add("Konya");
        route5.add("İstanbul");
        route6 = new ArrayList<>();
        route6.add("İstanbul");
        route6.add("Ankara");
        route6.add("İstanbul");
        
        routelist = new ArrayList<>();
        routelist.add(new Route(route1));
        routelist.add(new Route(route2));
        routelist.add(new Route(route3));
        routelist.add(new Route(route4));
        routelist.add(new Route(route5));
        routelist.add(new Route(route6));
        
        admin = new Admin("admin", "admin123");
        firmalist = new ArrayList<>();
        triplist = new ArrayList<>();
        vhlist = new ArrayList<>();
        
        triplist.add(new Trip("train",routelist.get(0),(rand.nextInt(upper)+4)));
        triplist.add(new Trip("train",routelist.get(1),(rand.nextInt(upper)+4)));
        triplist.add(new Trip("bus",routelist.get(2),(rand.nextInt(upper)+4)));
        triplist.add(new Trip("bus",routelist.get(3),(rand.nextInt(upper)+4)));
        triplist.add(new Trip("airplane",routelist.get(4),(rand.nextInt(upper)+4)));
        triplist.add(new Trip("airplane",routelist.get(5),(rand.nextInt(upper)+4)));
        
        vhlist.add(new Bus("BA1",20,"benzin",2));
        vhlist.add(new Bus("BA2",15,"benzin",2));
        vhlist.add(new Bus("BB1",15,"motorin",2));
        vhlist.add(new Bus("BB2",20,"motorin",3));
        vhlist.add(new Bus("BC1",20,"motorin",3));
        vhlist.add(new Airplane("AC1",30,"gaz",4));
        vhlist.add(new Airplane("AC2",30,"gaz",4));
        vhlist.add(new Train("TD1",25,"elektrik",0));
        vhlist.add(new Train("TD2",25,"elektrik",1));
        vhlist.add(new Train("TD3",25,"elektrik",1));
        vhlist.add(new Airplane("AF1",30,"gaz",5));
        vhlist.add(new Airplane("AF2",30,"gaz",5));
        
        for (int i = 0; i < vhlist.size(); i++) {
            vhlist.get(i).setTrip(triplist.get(vhlist.get(i).tr));
        }
        
        firmalist.add(new Company("A", "a123"));
        firmalist.add(new Company("B", "b123"));
        firmalist.add(new Company("C", "c123"));
        firmalist.add(new Company("D", "d123"));
        firmalist.add(new Company("F", "f123"));
        
        firmalist.get(0).AracEkle(vhlist.get(0));
        firmalist.get(0).AracEkle(vhlist.get(1));
        firmalist.get(1).AracEkle(vhlist.get(2));
        firmalist.get(1).AracEkle(vhlist.get(3));
        firmalist.get(2).AracEkle(vhlist.get(4));
        firmalist.get(2).AracEkle(vhlist.get(5));
        firmalist.get(2).AracEkle(vhlist.get(6));
        firmalist.get(3).AracEkle(vhlist.get(7));
        firmalist.get(3).AracEkle(vhlist.get(8));
        firmalist.get(3).AracEkle(vhlist.get(9));
        firmalist.get(4).AracEkle(vhlist.get(10));
        firmalist.get(4).AracEkle(vhlist.get(11));
        
        firmacb = new JComboBox();
        for (int i = 0; i < firmalist.size(); i++) {
            firmacb.addItem(firmalist.get(i).username);
        }
        firmacb.setBounds(425, 150, 150, 20);
        
        araccb = new JComboBox();
        araccb.setBounds(425, 150, 150, 20);
        
        yeniaraccb = new JComboBox();
        yeniaraccb.setBounds(225, 270, 150, 20);
        yeniaraccb.addItem("Otobüs");
        yeniaraccb.addItem("Tren");
        yeniaraccb.addItem("Uçak");
        yenisefercb = new JComboBox();
        yenisefercb.setBounds(425, 270, 150, 20);
        yenisefercb.addItem("1.Sefer (Tren)");
        yenisefercb.addItem("2.Sefer (Tren)");
        yenisefercb.addItem("3.Sefer (Otobüs)");
        yenisefercb.addItem("4.Sefer (Otobüs)");
        yenisefercb.addItem("5.Sefer (Uçak)");
        yenisefercb.addItem("6.Sefer (Uçak)");
        
        firmaseccb = new JComboBox();
        for (int i = 0; i < firmalist.size(); i++) {
            firmaseccb.addItem(firmalist.get(i).username);
        }
        firmaseccb.setBounds(425, 150, 150, 20);
        
        gunseccb = new JComboBox();
        for (int i = 0; i < 7; i++) {
            gunseccb.addItem((i+4)+" Aralık 2023");
        }
        gunseccb.setBounds(425, 180, 150, 20);
        
        panel1.add(buton1);
        panel2.add(buton2);
        panel3.add(buton3);
        panelgeri.add(butongeri);

        frame.add(username);
        frame.add(password);
        frame.add(mainlabel);
        frame.add(usernamelabel);
        frame.add(passwordlabel);
        frame.add(errorlabel);
        frame.add(butonadmin);
        frame.add(butonfirma);
        frame.add(butonfirmaekle);
        frame.add(butonfirmasil);
        frame.add(butonhizmet);
        frame.add(butonaracekle);
        frame.add(butonaracsil);
        frame.add(butonkz);
        frame.add(butongetir);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panelgeri);
        frame.add(firmacb);
        frame.add(firmacblabel);
        frame.add(hizmetlabel);
        frame.add(yenifirmauslabel);
        frame.add(yenifirmapwlabel);
        frame.add(yeniuserror);
        frame.add(yenius);
        frame.add(yenipw);
        frame.add(araccblabel);
        frame.add(araccb);
        frame.add(yeniaraclabel);
        frame.add(yeniseferlabel);
        frame.add(yeniaraccb);
        frame.add(yenisefercb);
        frame.add(firmaseclabel);
        frame.add(gunseclabel);
        frame.add(firmaseccb);
        frame.add(gunseccb);
        
        panelgeri.setVisible(false);
        username.setVisible(false);
        password.setVisible(false);
        butonadmin.setVisible(false);
        butonfirma.setVisible(false);
        butonfirmaekle.setVisible(false);
        butonaracekle.setVisible(false);
        butonfirmasil.setVisible(false);
        butonaracsil.setVisible(false);
        butonhizmet.setVisible(false);
        butonkz.setVisible(false);
        butongetir.setVisible(false);
        usernamelabel.setVisible(false);
        passwordlabel.setVisible(false);
        errorlabel.setVisible(false);
        firmacb.setVisible(false);
        firmacblabel.setVisible(false);
        hizmetlabel.setVisible(false);
        yenifirmauslabel.setVisible(false);
        yenifirmapwlabel.setVisible(false);
        yeniuserror.setVisible(false);
        yenius.setVisible(false);
        yenipw.setVisible(false);
        araccblabel.setVisible(false);
        araccb.setVisible(false);
        yeniaraclabel.setVisible(false);
        yeniseferlabel.setVisible(false);
        yeniaraccb.setVisible(false);
        yenisefercb.setVisible(false);
        gunseclabel.setVisible(false);
        firmaseclabel.setVisible(false);
        firmaseccb.setVisible(false);
        gunseccb.setVisible(false);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buton1) {
            panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(false);
            frame.getContentPane().setBackground(new Color(247, 159, 121));
            mainlabel.setText("Admin Girişi");
            panelgeri.setVisible(true);
            usernamelabel.setVisible(true);
            passwordlabel.setVisible(true);
            username.setVisible(true);
            password.setVisible(true);
            butonadmin.setVisible(true);
            errorlabel.setVisible(false);
           
        }
        if (e.getSource() == buton2) {
            panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(false);
            frame.getContentPane().setBackground(new Color(186, 146, 221));
            mainlabel.setText("Firma Girişi");
            panelgeri.setVisible(true);
            errorlabel.setVisible(false);
            usernamelabel.setVisible(true);
            passwordlabel.setVisible(true);
            username.setVisible(true);
            password.setVisible(true);
            butonfirma.setVisible(true);

        }
        if (e.getSource() == buton3) {
            panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(false);
            frame.getContentPane().setBackground(new Color(155, 253, 197));
            mainlabel.setText("Kullanıcı Girişi");
            gunseclabel.setVisible(true);
            firmaseclabel.setVisible(true);
            firmaseccb.setVisible(true);
            gunseccb.setVisible(true);
            panelgeri.setVisible(true);
            butongetir.setVisible(true);
            errorlabel.setVisible(false);
        }
        if (e.getSource() == butonadmin) {
            String sifre = new String(password.getPassword());
            if (admin.LogInCheck(username.getText(), sifre)) {
                mainlabel.setText("Hoşgeldin Admin");
                butongeri.setText("Çıkış Yap");
                username.setVisible(false);
                password.setVisible(false);
                butonadmin.setVisible(false);
                butonfirma.setVisible(false);
                errorlabel.setVisible(false);
                usernamelabel.setVisible(false);
                passwordlabel.setVisible(false);
                firmacb.setVisible(true);
                firmacblabel.setVisible(true);
                hizmetlabel.setVisible(true);
                butonfirmaekle.setVisible(true);
                butonfirmasil.setVisible(true);
                butonhizmet.setVisible(true);
                yenifirmauslabel.setVisible(true);
                yenifirmapwlabel.setVisible(true);
                yenius.setVisible(true);
                yenipw.setVisible(true);
                
            } else {
                username.setText(null);
                password.setText(null);
                errorlabel.setVisible(true);
            }

        }
        if (e.getSource() == butonfirma) {
            firma = -1;
            String sifre = new String(password.getPassword());
            for (int i = 0; i < firmalist.size(); i++) {
                if (firmalist.get(i).LogInCheck(username.getText(), sifre)) {
                    firma = i;
                    break;
                }
            }
            if (firma != -1) {
                butongeri.setText("Çıkış Yap");
                username.setVisible(false);
                password.setVisible(false);
                butonfirma.setVisible(false);
                errorlabel.setVisible(false);
                usernamelabel.setVisible(false);
                passwordlabel.setVisible(false);
                araccblabel.setVisible(true);
                yeniaraclabel.setVisible(true);
                yeniseferlabel.setVisible(true);
                yeniaraccb.setVisible(true);
                yenisefercb.setVisible(true);
                butonaracekle.setVisible(true);
                butonaracsil.setVisible(true);
                butonkz.setVisible(true);
                for (int i = 0; i < firmalist.get(firma).araclar.size(); i++) {
                
                araccb.addItem(firmalist.get(firma).araclar.get(i).id);
                
            }
                araccb.setVisible(true);
                mainlabel.setText("Hoşgeldiniz " + firmalist.get(firma).username + " Firması");
                username.setText(null);
                password.setText(null);
            } else {
                username.setText(null);
                password.setText(null);
                errorlabel.setVisible(true);
            }

        }
        if (e.getSource() == butongeri) {
            
            butongeri.setText("Geri Dön");
            araccb.removeAllItems();
            firma = -1;
            username.setText(null);
            password.setText(null);
            panel1.setVisible(true);
            panel2.setVisible(true);
            panel3.setVisible(true);
            panelgeri.setVisible(false);
            username.setVisible(false);
            password.setVisible(false);
            butonadmin.setVisible(false);
            butonfirma.setVisible(false);
            butonfirmaekle.setVisible(false);
            butonfirmasil.setVisible(false);
            butonhizmet.setVisible(false);
            errorlabel.setVisible(false);
            usernamelabel.setVisible(false);
            passwordlabel.setVisible(false);
            firmacb.setVisible(false);
            firmacblabel.setVisible(false);
            hizmetlabel.setVisible(false);
            yenifirmauslabel.setVisible(false);
            yenifirmapwlabel.setVisible(false);
            yeniuserror.setVisible(false);
            yenius.setVisible(false);
            yenipw.setVisible(false);
            araccblabel.setVisible(false);
            araccb.setVisible(false);
            yeniaraclabel.setVisible(false);
            yeniseferlabel.setVisible(false);
            yeniaraccb.setVisible(false);
            yenisefercb.setVisible(false);
            butonaracekle.setVisible(false);
            butonaracsil.setVisible(false);
            butonkz.setVisible(false);
            gunseclabel.setVisible(false);
            firmaseclabel.setVisible(false);
            firmaseccb.setVisible(false);
            gunseccb.setVisible(false);
            butongetir.setVisible(false);
            frame.getContentPane().setBackground(new Color(175, 219, 245));
            mainlabel.setText("Rezervasyon Sitesine Hoşgeldiniz");
        }
        if (e.getSource() == butonfirmaekle) {
            
            boolean a = false;
            for (int i = 0; i < firmalist.size(); i++) {
                if (yenius.getText().equals(firmalist.get(i).username)) {
                   a = true;
                   break;
                }
            }
            if(a==false && !(yenius.getText().equals("")))
            {    
               
            Company newC = new Company(yenius.getText(),yenipw.getText());
            yenius.setText(null);
            yenipw.setText(null);
            yeniuserror.setVisible(false);
            firmalist.add(newC);
            firmacb.addItem(newC.username);
            firmaseccb.addItem(newC.username);
            JOptionPane.showMessageDialog(frame, newC.username+" firması eklendi :)",null,JOptionPane.INFORMATION_MESSAGE);  
            }
            else {
                yenius.setText(null);
                yenipw.setText(null);
                yeniuserror.setVisible(true);
            }
            
            }
        
           if (e.getSource() == butonfirmasil) {
               JOptionPane.showMessageDialog(frame, firmacb.getSelectedItem()+" firması silindi :)",null,JOptionPane.INFORMATION_MESSAGE);  
               firmacb.removeItemAt(firmacb.getSelectedIndex());
               firmaseccb.removeItemAt(firmacb.getSelectedIndex()+1);
               firmalist.remove(firmacb.getSelectedIndex()+1);
              
        } 

        if (e.getSource() == butonhizmet) {
            
            hizmet = Integer.parseInt(JOptionPane.showInputDialog(frame, "Yeni değeri giriniz", null, JOptionPane.QUESTION_MESSAGE));
            hizmetlabel.setText("Hizmet Bedeli : "+hizmet+" TL");
            JOptionPane.showMessageDialog(frame, "Yeni değer: "+hizmet+" TL",null,JOptionPane.INFORMATION_MESSAGE);
            
        }
        if(e.getSource() == butonaracekle){
            switch (yeniaraccb.getSelectedIndex()) {
                case 0:
                    firmalist.get(firma).AracEkle(new Bus("B"+firmalist.get(firma).username+"0"+(araccb.getItemCount()+1),20,"benzin",yenisefercb.getSelectedIndex()));
                    firmalist.get(firma).araclar.get(firmalist.get(firma).araclar.size()-1).setTrip(triplist.get(yenisefercb.getSelectedIndex()));
                    firmalist.get(firma).araclar.get(firmalist.get(firma).araclar.size()-1).trip.tarih = rand.nextInt(upper)+4;
                    break;
                case 1:
                    firmalist.get(firma).AracEkle(new Train("T"+firmalist.get(firma).username+"0"+(araccb.getItemCount()+1),25,"elektrik",yenisefercb.getSelectedIndex()));
                    firmalist.get(firma).araclar.get(firmalist.get(firma).araclar.size()-1).setTrip(triplist.get(yenisefercb.getSelectedIndex()));
                    firmalist.get(firma).araclar.get(firmalist.get(firma).araclar.size()-1).trip.tarih = rand.nextInt(upper)+4;
                    break;
                default:
                    firmalist.get(firma).AracEkle(new Airplane("A"+firmalist.get(firma).username+"0"+(araccb.getItemCount()+1),30,"gaz",yenisefercb.getSelectedIndex()));
                    firmalist.get(firma).araclar.get(firmalist.get(firma).araclar.size()-1).setTrip(triplist.get(yenisefercb.getSelectedIndex()));
                    firmalist.get(firma).araclar.get(firmalist.get(firma).araclar.size()-1).trip.tarih = rand.nextInt(upper)+4;
                    break; 
            }
            
          araccb.addItem(firmalist.get(firma).araclar.get(araccb.getItemCount()).id);
          JOptionPane.showMessageDialog(frame, firmalist.get(firma).araclar.get(firmalist.get(firma).araclar.size()-1).id+" aracı eklendi :)",null,JOptionPane.INFORMATION_MESSAGE);  
        }
        if(e.getSource() == butonaracsil){
            JOptionPane.showMessageDialog(frame, araccb.getSelectedItem()+" aracı kaldırıldı :)",null,JOptionPane.INFORMATION_MESSAGE);  
            araccb.removeItemAt(araccb.getSelectedIndex());
            firmalist.get(firma).AracKaldır(araccb.getSelectedIndex());
           
        }
        if(e.getSource() == butonkz){
            System.out.println(firmalist.get(firma).Kar(hizmet));
           
        }
        if(e.getSource() == butongetir){
            
            System.out.println("Uygun Seferler: ");
            for (int i = 0; i < firmalist.get(firmaseccb.getSelectedIndex()).araclar.size(); i++) {
                if(firmalist.get(firmaseccb.getSelectedIndex()).araclar.get(i).trip.tarih == (gunseccb.getSelectedIndex()+4))
                    System.out.println(firmalist.get(firmaseccb.getSelectedIndex()).araclar.get(i).id);    
            }
        }
        
        
}
}