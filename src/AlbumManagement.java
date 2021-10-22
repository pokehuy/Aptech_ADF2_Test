import java.util.*;

public class AlbumManagement {
    int flag = 1;
    int flag1 = 1;
    int flag2 = 1;
    int i = 0;
    public List<Album> initiateAlbumList(){
        List<Album> listAlbums = new ArrayList<Album>();
        Scanner sc  = new Scanner(System.in);
        do {
            Album album = new Album();
            System.out.println("Nhap ten album: ");
            album.setName(sc.nextLine());
            List<Artist> musicians = new ArrayList<Artist>();
            List<Track> tracks = new ArrayList<Track>();
            album.setTracks(tracks);
            album.setMusicians(musicians);
            do {
                System.out.println("Nhap ten artist: ");
                Artist artist = new Artist();
                artist.setName(sc.nextLine());
                musicians.add(artist);
                System.out.println("Nhap tiep Artist bam 1; thoat bam 0");
                flag1 = Integer.parseInt(sc.nextLine());
            } while(flag1 == 1);
            do{
                System.out.println("Nhap ten Track: ");
                Track track = new Track();
                track.setName(sc.nextLine());
                System.out.println("Nhap view count: ");
                track.setViewCount(Integer.parseInt(sc.nextLine()));
                tracks.add(track);
                System.out.println("Nhap tiep Track bam 1; thoat bam 0");
                flag2 = Integer.parseInt(sc.nextLine());
            } while (flag2 == 1);
            listAlbums.add(album);
            i++;
            if(i > 1){
                System.out.println("Nhap tiep album bam 1, thoat bam 0");
                flag = Integer.parseInt(sc.nextLine());
            }
        } while (flag == 1 );
        return listAlbums;
    }

    public static Track getMaxViewCount(List<Album> lists) {
        Track max = lists
                .stream()
                .map(a -> a.getTracks()
                        .stream()
                        .max(Comparator.comparing(Track::getViewCount))
                        .get())
                .max(Comparator.comparing(Track::getViewCount))
                .get();
        return max;
    }

    public static Track getMinViewCount(List<Album> lists) {
        Track min= lists
                .stream()
                .map(a -> a.getTracks()
                        .stream()
                        .min(Comparator.comparing(Track::getViewCount))
                        .get())
                .min(Comparator.comparing(Track::getViewCount))
                .get();
        return min;
    }

    public static long countTrack(List<Album> lists) {
        long count = lists.stream().map(l -> l.getTracks().stream().count()).reduce(0l, Long::sum);
        return count;
    }
}
