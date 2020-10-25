import java.util.ArrayList;
import java.util.LinkedList;
public class MyApp 
{
   public static void addToPlaylist(Playlist play,ArrayList<MyQueue> allTheWeeks) 
   {
       for (int i = 0; i < allTheWeeks.size(); i++) 
       {
           MyQueue Q=allTheWeeks.get(i);
           LinkedList<Song> list=Q.getListOfSong();
           for(int num=0; num<list.size(); num++) 
           {
               play.addSong(list.get(num));
           }
       }
   }


public static void readDataFromFiles(ArrayList<MyQueue> allTheWeeks,String myFiles[]) 
{
       for (int i=0; i < myFiles.length; i++)
       {
       MyQueue dataExtract = new MyQueue(myFiles[i]);
       allTheWeeks.add(dataExtract);
       }
   }


public static void main(String args[]) 
{
   String myFiles[]= {"week1.txt", "week2.txt", "week3.txt", "week4.txt"};//store for input file to read and run
   ArrayList<MyQueue> allTheWeeks = new ArrayList<MyQueue>();
   readDataFromFiles(allTheWeeks,myFiles);
  
   Playlist play1=new Playlist();
   addToPlaylist(play1,allTheWeeks);
  
   play1.printPlyalist();
   System.out.println();
   SongHistoryList history=new SongHistoryList();
  
   history.addSong(play1.listenToSong());
   history.addSong(play1.listenToSong());
   history.addSong(play1.listenToSong());
   history.addSong(play1.listenToSong());
  
   history.printHistory();
   System.out.println();
   System.out.println("Latest song listen: "+history.lastListened().getTrack());
   }
}