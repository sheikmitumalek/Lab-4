public class Song //song class
{
   private String track;
   private Song next;
public Song() 
{
   track="";
   next=null;
}
public Song(String track) 
{
   this.track=track;
   next=null;
}
public Song getNext() //return next
   {
       return next;
   }
public void setNext(Song next) //setNext method
{
       this.next = next;
   }
public String getTrack() //return track method
{
       return track;
   }
public void setTrack(String track) //setTrack method
{
       this.track = track;
   }
}