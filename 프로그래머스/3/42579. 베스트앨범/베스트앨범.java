import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreTotal = new HashMap<>();
        Map<String, Map<Integer, Integer>> genreSongs = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];
            
            genreTotal.put(genre, genreTotal.getOrDefault(genre, 0) + play);

            genreSongs.putIfAbsent(genre, new HashMap<>());
            genreSongs.get(genre).put(i, play);
        }

        List<String> sortedGenres = new ArrayList<>(genreTotal.keySet());
        sortedGenres.sort((a, b) -> genreTotal.get(b) - genreTotal.get(a));

        List<Integer> answer = new ArrayList<>();

        for (String genre : sortedGenres) {
            Map<Integer, Integer> songs = genreSongs.get(genre);

            List<Map.Entry<Integer, Integer>> sortedSongs = new ArrayList<>(songs.entrySet());
            sortedSongs.sort((a, b) -> {
                if (b.getValue().equals(a.getValue())) {
                    return a.getKey() - b.getKey(); 
                }
                return b.getValue() - a.getValue(); 
            });

            for (int i = 0; i < Math.min(2, sortedSongs.size()); i++) {
                answer.add(sortedSongs.get(i).getKey());
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
