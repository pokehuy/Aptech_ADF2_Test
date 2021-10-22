// muốn chạy Question2 phải comment file này lại vì trùng main function
import java.util.List;

public class Main {
    public static void main(String[] args){
        AlbumManagement start = new AlbumManagement();
        List<Album> lists = start.initiateAlbumList();
        for(Album l : lists) {
            System.out.println("ALBUM: ");
            System.out.println(l.getName());
            System.out.println("TRACK + VIEWS :");
            for(Track t : l.getTracks()){
                System.out.println(t.getName() + ":" + t.getViewCount());
            }
            System.out.println("ARTISTS: ");
            for(Artist a : l.getMusicians()){
                System.out.println(a.getName());
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Track with max views: " + start.getMaxViewCount(lists).getName() + " : " + start.getMaxViewCount(lists).getViewCount());
        System.out.println("Track with min views: " + start.getMinViewCount(lists).getName() + " : " + start.getMinViewCount(lists).getViewCount());
        System.out.println("Number of tracks in album list: " + start.countTrack(lists));
    }
}
