public class MusicParser {
    public static List<Integer> parseMusic(String music) {
        
        String[] notes = music.split(" ");
        
        
        List<Integer> durations = new ArrayList<>();
        
        
        for (String note : notes) {
            if (note.equals("o")) {
                
                durations.add(4);
            } else if (note.endsWith("|")) {
                
                int duration = 2; 
                if (note.startsWith(".")) {
                    
                    duration = 1;
                }
                durations.add(duration);
            }
        }
        
        return durations;
    }
}