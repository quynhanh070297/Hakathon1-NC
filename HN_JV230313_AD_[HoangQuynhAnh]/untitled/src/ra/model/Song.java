package ra.model;

import java.util.Date;
import java.util.Scanner;

public class Song
{
    //▪ songId – mã bài hát – String (Có 4 ký tự và bắt đầu bằng kí tự S, không trùng lặp)
    // ▪ songName – tên bài hát – String (Không được để trống)
    //▪ descriptions – mô tả bài hát – String
    //▪ singer - ca sĩ - Singer (không được null)
    // ▪ songWrWriter - người sáng tác- String (không được để trống)
    // ▪ createdDate- ngày tạo - Date (mặc định là thời gian hệ thống)
    // ▪ songStatus- trạng thái - boolean
    private String songId ;
    private String songName;
    private String descriptions;
    private String singer;
    private String songWriter;
    private Date createdDate;
    private  boolean songStatus;

    public Song()
    {

    }

    public Song(String songId, String songName, String descriptions, String singer, String songWriter, Date createdDate, boolean songStatus)
    {
        this.songId = songId;
        this.songName = songName;
        this.descriptions = descriptions;
        this.singer = singer;
        this.songWriter = songWriter;
        this.createdDate = createdDate;
        this.songStatus = songStatus;
    }

    public String getSongId()
    {
        return songId;
    }
    public String getSongName()
    {
        return songName;
    }

    public void setSongName(String songName)
    {
        this.songName = songName;
    }

    public String getDescriptions()
    {
        return descriptions;
    }

    public void setDescriptions(String descriptions)
    {
        this.descriptions = descriptions;
    }

    public String getSinger()
    {
        return singer;
    }

    public void setSinger(String singer)
    {
        this.singer = singer;
    }

    public String getSongWriter()
    {
        return songWriter;
    }

    public void setSongWriter(String songWriter)
    {
        this.songWriter = songWriter;
    }

    public Date getCreatedDate()
    {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate)
    {
        this.createdDate = createdDate;
    }

    public boolean isSongStatus()
    {
        return songStatus;
    }

    public void setSongStatus(boolean songStatus)
    {
        this.songStatus = songStatus;
    }

    @Override
    public String toString()
    {
        return "Song{" +
                "songId='" + songId + '\'' +
                ", songName='" + songName + '\'' +
                ", descriptions='" + descriptions + '\'' +
                ", singer='" + singer + '\'' +
                ", songWriter='" + songWriter + '\'' +
                ", createdDate=" + createdDate +
                ", songStatus=" + (songStatus?"Hoat Dong":"Khong hoat dong") +
                '}';
    }

    public void display()
    {
        System.out.println(toString());
    }

    public void inputData()
    {
        Scanner scanner = new Scanner(System.in);

        boolean checkID = false;

       do {
           System.out.println("Nhập mã sản phẩm (độ dài 4 ký tự, bắt đầu bằng S): ");
           String inputID= scanner.nextLine();
            if (inputID.length() == 4 && inputID.charAt(0) == 'S') {
                checkID = true;
             songId = inputID;
            } else {System.out.println("Mã sản phẩm không hợp lệ. Vui lòng nhập lại.");}
       }while (!checkID);

        System.out.println("Moi ban nhap vao ten  bai hat");
        songName= scanner.nextLine();
        if ( songName== null ||  songName.isEmpty())
        {
            System.err.println("Khong duoc de trong");
        }
        System.out.println("Moi ban nhap vao mo ta bai hat");
        descriptions= scanner.nextLine();
        System.out.println("Moi ban nhap vao ten casi");
        singer= scanner.nextLine();
        if ( singer== null ||  singer.isEmpty())
        {
            System.err.println("Khong duoc de trong");
        }
        System.out.println("Moi ban nhap vao ten tac gia");
        songWriter= scanner.nextLine();
        if ( songWriter== null ||  songWriter.isEmpty())
        {
            System.err.println("Khong duoc de trong");
        }
        createdDate = new Date();
        System.out.println("Moi ban nhap vao trang thai bai hat");
        songStatus= Boolean.parseBoolean(scanner.nextLine());
    }
}
