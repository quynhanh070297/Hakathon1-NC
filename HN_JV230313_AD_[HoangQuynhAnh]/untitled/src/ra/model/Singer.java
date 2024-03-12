package ra.model;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Singer
{

    //singerId – mã ca sĩ – int (Tự động tăng)▪
    // singerName – tên ca sĩ – String (Không được để trống)▪
    // age – ttuổi – int (Phải lớn hơn 0)▪
    // nationality – quốc tịch – String (không được để trống)▪
    // gender -
    // giới tính - boolean▪
    // genre - thể loại - String (Không được để trống)
    private int singerId ;
    private static int singerIdcount = 1;
    private String singerName ;
    private int age;
    private String nationality;
    private boolean gender;
    private String genre;

    public Singer()
    {
        this.singerId= singerIdcount++;
    }

    public Singer(int singerId, int singerIdcount, int age, String nationality, boolean gender, String genre)
    {
        this.singerId = singerId;
        this.singerIdcount = singerIdcount;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
        this.genre = genre;
    }

    public int getSingerId()
    {
        return singerId;
    }

    public void setSingerId(int singerId)
    {
        this.singerId = singerId;
    }

    public int getSingerIdcount()
    {
        return singerIdcount;
    }

    public void setSingerIdcount(int singerIdcount)
    {
        this.singerIdcount = singerIdcount;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getNationality()
    {
        return nationality;
    }

    public void setNationality(String nationality)
    {
        this.nationality = nationality;
    }

    public boolean isGender()
    {
        return gender;
    }

    public void setGender(boolean gender)
    {
        this.gender = gender;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    @Override
    public String toString()
    {
        return "Singer{" +
                "singerId=" + singerId +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", gender=" + (gender?"Nam":"Nu") +
                ", genre='" + genre + '\'' +
                '}';
    }
    public void display()
    {
        System.out.println(toString());
    }
   public void inputData()
   {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Moi ban nhap vao ten ca si");
       singerName = scanner.nextLine();
       if ( singerName == null ||  singerName.isEmpty())
       {
           System.err.println("Khong duoc de trong");
       }
       System.out.println("Moi ban nhap tuoi casi");
       age = Integer.parseInt(scanner.nextLine());
       while (age<0)
       {
           System.out.println("Tuoi phai lon hon 0, moi ban nhap lai");
           age = Integer.parseInt(scanner.nextLine());
       }
       System.out.println("Moi ban nhap vao quoc tich ca si");
       nationality = scanner.nextLine();
       if ( nationality == null ||  nationality.isEmpty())
       {
           System.err.println("Khong duoc de trong");
       }
       System.out.println("Moi ban nhap vao gioi tinh ca si");
       gender = Boolean.parseBoolean(scanner.nextLine());
       System.out.println("Moi ban nhap vao the loai");
       genre = scanner.nextLine();
       if ( genre == null ||  genre.isEmpty())
       {
           System.err.println("Khong duoc de trong");
       }
   }
}
