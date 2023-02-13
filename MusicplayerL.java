import java.util.Scanner;
// this is Musicplayer just like a app 
class MusicplayerL {
    static int count = 0;
    static String[] Songs = new String[200];

    
    public static void addSong(String songName) {
       for(int i=0;i<Songs.length;i++){
           if(Songs[i]==null){
               Songs[i]=songName;
               break;
            }
        }
    }
    
    // Searching method 
    

    public static void SearchSong(String Songname) {
        
        boolean find=false;
        System.out.println("\n This is your searched song: \n");
        for (int i = 0; i < Songs.length; i++) {
            if (Songs[i] == null)
            continue;
            else if (Songs[i].equalsIgnoreCase(Songname)) {
                System.out.println("Your song is  ["+Songs[i]+"] at index "+i);
                find=true;
            }
            
        }
        if(find==false)System.out.println("your searched song doesn't exist ");
        
    }
    
    
    public static void updateSong(String oldSong){
        
        boolean find=false;
        Scanner scan=new Scanner(System.in);
       

        for (int i = 0; i < Songs.length; i++) {
            if (Songs[i] == null)
                continue;
            else if (Songs[i].equalsIgnoreCase(oldSong)) {
                System.out.println("Enter new song name to update ");
                String newSong=scan.nextLine();
                Songs[i]=newSong;
                find=true;
                break;
            }

        }
        
        if(find==false)System.out.println("your searched song doesn't exist ");
    }

    public static void deleteSong(){
int size=Songs.length;
        boolean find=false;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a song name to Delete : ");
    String oldSongName=scan.nextLine().trim();   
 
    for (int i = 0; i < Songs.length; i++) {
        if (Songs[i] == null)
        continue;
         if (Songs[i].equalsIgnoreCase(oldSongName)) {

            for(int j=i;j<(Songs.length-1);j++){
                Songs[j]=Songs[j+1];
            }
            Songs[size-1]=null;
            find=true;
            System.out.println("song deleted  successfully ");
            break;
        }
        
    }

    if(find==false)System.out.println("your searched song doesn't exist ");
    
}




    public static void displaySongs() {
        for (String i : Songs) {
            if (i == null)
                continue;
            System.out.println(i);
        }
    }

}

public class MusicplayerL {
    public static void main(String[] args) {

        char ch;
do{

    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to SongPlay :");
System.out.println("  1 - Add new Song ");
System.out.println("  2 - Search  Song ");
  System.out.println("  3 - Update  Song ");
  System.out.println("  4 - Delete  a  Song ");
  System.out.println("  5 - Display all playlist ");
  System.out.print("Please Enter your choice : ");
  int choice=sc.nextInt();
  switch(choice)
  {
      case 1:{
          Scanner scan=new Scanner(System.in);
          System.out.println("Enter the song name ");
          String newSong=scan.nextLine().trim();
          MusicPlayer.addSong(newSong);
          break;
        }
        case 2:{
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter Song name to search ");
            String searchSong=scan.nextLine().trim();
            MusicPlayer.SearchSong(searchSong);
            break;
        }
        case 3:{
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a song name to update ");
            String oldSong=scan.nextLine().trim();
            MusicPlayer.updateSong(oldSong);
           
    break;
}
case 4:{
    MusicPlayer.deleteSong();
    break;
}

case 5:{
    MusicPlayer.displaySongs();
    break;
}

}
System.out.println("Do you want to continue : (y/n) ");
 ch=sc.next().charAt(0);
}
while(ch=='y' || ch=='Y');


    }
}

