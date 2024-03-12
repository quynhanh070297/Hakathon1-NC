package ra.run;

import com.sun.tools.javac.Main;
import ra.model.Singer;
import ra.model.Song;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MusicManagement
{
    private static Singer[] singers = new Singer[20];
    private static Song[] songs = new Song[20];
    private static Scanner scanner = new Scanner(System.in);
    private static int arrLength = 0;
    private static int singerLenght = 0;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("**********************MUSIC-MANAGEMENT ************************");
            System.out.println("1.Quản lý ca sĩ");
            System.out.println("2.Quản lý bài hát");
            System.out.println("3.Tìm kiếm bài hát");
            System.out.println("0. Thoát");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice)
            {
                case 1:
                    singerMana();
                    break;
                case 2:
                    songMana();
                    break;
                case 3:
                    searchMana();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }

    public static void songMana()
    {
        int choice;

        {
            System.out.println("**********************SONG-MANAGEMENT************************");
            System.out.println("1.Nhập vào số lượng bài hát cần thêm ");
            System.out.println("2. Hiển thị danh sách tất cả bài hát đã lưu trữ");
            System.out.println("3.Thay đổi thông tin bài hát theo mã id");
            System.out.println("4. Xóa bài hát theo mã id");
            System.out.println("0. Quay lai");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Số Bài hát bạn muốn thêm :");
                    int numSong = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < numSong; i++)
                    {
                        Song newsong = new Song();
                        newsong.inputData();
                        songs[i] = newsong;
                    }
                    break;
                case 2:
                    for (int i = 0; i < arrLength; i++)
                    {
                       songs[i].display();
                    }
                    break;
                case 3:
                    scanner = new Scanner(System.in);
                    System.out.println("Nhập ID sản phẩm cần update:");
                    String updateId = scanner.nextLine();
                    boolean check = false;
                    for (int i = 0; i < arrLength; i++)
                    {
                        if (Objects.equals(songs[i].getSongId(), updateId))
                        {
                            check = true;
                            System.out.println("Nhập thông tin bạn muốn update:");
                            songs[i].inputData();
                            arrLength++;
                        }
                    }
                    if (!check)
                    {
                        System.out.println("Không tìm thấy sản phẩm có mã: " + updateId);
                    }
                    break;
                case 4:
                    scanner = new Scanner(System.in);
                    System.out.println("Nhập mã sản phẩm cần xóa:");
                    String delSongId = scanner.nextLine();
                    boolean check1 = false;
                    for (int i = 0; i < arrLength; i++)
                    {
                        if (Objects.equals(songs[i].getSongId(), delSongId))
                        {
                            check1 = true;
                            for (int j = i; j < arrLength - 1; j++)
                            {
                                songs[j] = songs[j + 1];
                            }
                            arrLength--;
                            System.out.println("Đã xóa sản phẩm có mã: " + delSongId);
                            break;
                        }
                    }
                    if (!check1)
                    {
                        System.out.println("Không tìm thấy sản phẩm có mã: " + delSongId);
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }

    public static void singerMana()
    {
        int choice;
        do
        {
            System.out.println("**********************SINGER-MANAGEMENT************************");
            System.out.println("1.Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2.Hiển thị danh sách tất cả ca sĩ đã lưu trữ");
            System.out.println("3.Thay đổi thông tin ca sĩ theo mã id");
            System.out.println("4.Xóa ca sĩ theo mã id (kiểm tra xem nếu ca sĩ có bài hát thì không xóa được)");
            System.out.println("0. Quay lai");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Số Ca 1si bạn muốn thêm :");
                    int numSinger = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < numSinger; i++)
                    {
                        Singer newSinger = new Singer();
                        newSinger.inputData();
                        singers[i] = newSinger;
                        singerLenght++;
                    }
                    break;
                case 2:

                    for (int i = 0; i < singerLenght; i++)
                    {
                        singers[i].display();
                    }
                    break;
                case 3:
                    scanner = new Scanner(System.in);
                    System.out.println("Nhập ID ca si cần update:");
                    int updateSinger = Integer.parseInt(scanner.nextLine());
                    boolean check = false;
                    for (int i = 0; i < singerLenght; i++)
                    {
                        if (Objects.equals(singers[i].getSingerId(), updateSinger))
                        {
                            check = true;
                            System.out.println("Nhập thông tin bạn muốn update:");
                            singers[i].inputData();
                        }
                    }
                    if (!check)
                    {
                        System.out.println("Không tìm thấy ca si có mã: " + updateSinger);
                    }

                    break;
                case 4:
                    scanner = new Scanner(System.in);
                    System.out.println("Nhập ID ca si can xoa:");
                  int delSingerId = Integer.parseInt(scanner.nextLine());
                    boolean check1 = false;
                    for (int i = 0; i < singerLenght; i++)
                    {
                        if (Objects.equals(singers[i].getSingerId(), delSingerId))
                        {
                            check1 = true;
                            for (int j = i; j < singerLenght - 1; j++)
                            {
                                singers[j] =  singers[j + 1];
                            }
                            singerLenght--;
                            System.out.println("Đã xóa sản phẩm có mã: " + delSingerId);
                            break;
                        }
                    }
                    if (!check1)
                    {
                        System.out.println("Không tìm thấy sản phẩm có mã: " + delSingerId);
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);

    }

    public static void searchMana()
    {

        int choice;
        do
        {
            System.out.println("**********************SEARCH-MANAGEMENT************************");
            System.out.println("1.Tìm kiếm bài hát theo tên ca sĩ hoặc thể loại");
            System.out.println("2.Tìm kiếm ca sĩ theo tên hoặc thể loại ");
            System.out.println("3.Hiển thị danh sách bài hát theo thứ tự tên tăng dần");
            System.out.println("4.Hiển thị 10 bài hát được đăng mới nhất");
            System.out.println("0. Quay lai");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice)
            {
                case 1:
                     scanner = new Scanner(System.in);
                    System.out.println("Mời bạn nhập tên ca si hoac the loai de tim bai hat");
                    String input = scanner.nextLine();
                    boolean isName = false;
                    for (int i = 0; i < arrLength; i++) {
                        if (songs[i].getSongWriter().contains(input) || singers[i].getGenre().contains(input)){
                            System.out.println(songs[i].getSongName());
                            isName= true;
                        }
                    }if (!isName){
                    System.out.println("Không tồn tại bài hát ");
                }
                    break;
                case 2:
                    scanner = new Scanner(System.in);
                    System.out.println("Mời bạn nhập tên ca si hoac the loai:");
                    String input2 = scanner.nextLine();
                    boolean isNameSing = false;
                    for (int i = 0; i < arrLength; i++) {
                        if (songs[i].getSongWriter().contains(input2) || singers[i].getGenre().contains(input2)){
                            System.out.println(songs[i].getSongWriter());
                            System.out.println(singers);
                            isName= true;
                        }
                    }if (!isNameSing){
                    System.out.println("Không tồn tại bài hát ");
                }
                    break;
                case 3:
//                    for (int i = 0; i < arrLength; i++)
//                    {
//                        Arrays.sort(songs[i].getSongName());
//                    }
//                    for (int i = 0; i < arrLength; i++)
//                    {
//                        songs[i].display();
//                    }
//                    //System.out.println(myStr1.compareTo(myStr2));
                    break;
                case 4:
                    System.out.println(" 10 bai hat duoc dang moi nhat la");
                    for (int i = arrLength-10; i < arrLength; i++)
                    {
                        System.out.println(songs[i].getSongName());
                    }
                    break;
                case 0:

                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (true);
    }

}
