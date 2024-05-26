import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class LongTrackFinder {

    // Original
    public Set<String> findLongTracks(List<Album> albums) {
        Set<String> trackNames = new HashSet<>();
        for (Album album : albums) {
            for (Track track : album.getTrackList()) {
                if (track.getLength() > 60) {
                    String name = track.getName();
                    trackNames.add(name);
                }
            }
        }
        return trackNames;
    }

    // Refactored
    public Set<String> findLongTracksRefactored(List<Album> albums) {
        return albums.stream()
                .flatMap(album -> album.getTracks())
                .filter(track -> track.getLength() > 60)
                .map(Track::getName)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        List<Album> albums = SampleData.albums.collect(Collectors.toList());

        LongTrackFinder trackFinder = new LongTrackFinder();
        
        // Original
        Set<String> orginalTrackFinder = trackFinder.findLongTracks(albums);
        System.out.println("Original Long Tracks: " + orginalTrackFinder);

        // Refactored
        Set<String> refactoredTrackFinder = trackFinder.findLongTracksRefactored(albums);
        System.out.println("Refactored Long Tracks: " + refactoredTrackFinder);
    }
}
