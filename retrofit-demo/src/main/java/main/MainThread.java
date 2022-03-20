package main;

import entity.Song;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import service.SongService;

import java.io.IOException;
import java.util.List;

public class MainThread {
    public static void main(String[] args) throws IOException {
        Song song1 = new Song();
        Song song2 = Song.builder().id(1).status(1).build();

        System.out.println("Demo retrofit");
        //HttpURLConnection: request, response
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder(); //builder

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://music-i-like.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();
        SongService songService = retrofit.create(SongService.class);
        List<Song> listSong = songService.getList().execute().body();
        System.out.println(listSong.size());

        for (Song song :
            listSong){
            System.out.println(song.toString());
        }

    }
}
