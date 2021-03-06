package com.example.muzeumfrontendjavafx;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class SzoborApi {
    private static final String BASE_URL = "http://localhost:8000";
    public static final String SZOBOR_API_URL = BASE_URL + "/api/szobor";

    public static List<Szobor> getSzobrok() throws IOException {
        Response response = RequestHandler.get(SZOBOR_API_URL);
        String json = response.getContent();
        Gson jsonConvert = new Gson();
        if (response.getResponseCode() >= 400){
            String message = jsonConvert.fromJson(json, ApiError.class).getMessage();
            throw new IOException(message);
        }
        Type type = new TypeToken<List<Szobor>>(){}.getType();
        return jsonConvert.fromJson(json,type);
    }

    public static Szobor szoborHozzaadasa(Szobor ujSzobor) throws IOException {
        Gson jsonConvert = new Gson();
        String szoborJson = jsonConvert.toJson(ujSzobor);
        Response response = RequestHandler.post(SZOBOR_API_URL, szoborJson);

        String json = response.getContent();
        if (response.getResponseCode() >= 400){
            String message = jsonConvert.fromJson(json, ApiError.class).getMessage();
            throw new IOException(message);
        }
        return jsonConvert.fromJson(json, Szobor.class);
    }
    public static Szobor szoborModositasa(Szobor modositando) throws IOException {
        Gson jsonConvert = new Gson();
        String szoborJson = jsonConvert.toJson(modositando);
        Response response = RequestHandler.put(SZOBOR_API_URL + "/" + modositando.getId(), szoborJson);

        String json = response.getContent();
        if (response.getResponseCode() >= 400){
            String message = jsonConvert.fromJson(json, ApiError.class).getMessage();
            throw new IOException(message);
        }
        return jsonConvert.fromJson(json, Szobor.class);
    }

    public static boolean szoborTorlese(int id) throws IOException {
        Response response = RequestHandler.delete(SZOBOR_API_URL+ "/" + id);

        Gson jsonConvert = new Gson();
        String json = response.getContent();
        if (response.getResponseCode() >= 400){
            String message = jsonConvert.fromJson(json, ApiError.class).getMessage();
            throw new IOException(message);
        }
        return response.getResponseCode() == 204;
    }
}
