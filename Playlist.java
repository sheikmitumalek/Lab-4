public class Playlist 
{
private Song first;
public Playlist()//for creating new list
{
   first=null;
}
public void addSong(Song s)
{
   if(first==null) 
   {
       s.setNext(first);
       first=s;
       return;
   }
     Song temp=first;//add song at last
   while(temp.getNext()!=null)
   {
       temp=temp.getNext();
   }
   temp.setNext(s);
}
public Song listenToSong()
{
   Song temp=first;
   first=first.getNext();//return song from the top list
   return temp;// return to next song
}
public void printPlyalist() 
{
   Song temp=first;
   System.out.println("Playlist");
   System.out.println("----------");
   while(temp!=null) {
       System.out.println(temp.getTrack());
       temp=temp.getNext();
   }
}
}