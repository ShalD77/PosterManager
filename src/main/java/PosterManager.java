public class PosterManager {

    protected String[] movies = new String[0];
    protected int limit;

    public PosterManager() {
        this.limit = 10;

    };

    public PosterManager(int limit) {
        this.limit = limit;
    }


    public void add(String movie) {
        String[] poster = new String[movies.length + 1];
        System.arraycopy(movies, 0, poster, 0, movies.length);
        int lastIndex = poster.length - 1;
        poster[lastIndex] = movie;
        movies = poster;

    }

    public String[] findAll(){
        return movies;
    }

    public String[] findLast(){
        int resultLength;
        if (movies.length < limit){
            resultLength = movies.length;
        }else {
            resultLength = limit;
        }

        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
         tmp [i] = movies[movies.length - 1 -i ];
        }
        return tmp;
    }


}


