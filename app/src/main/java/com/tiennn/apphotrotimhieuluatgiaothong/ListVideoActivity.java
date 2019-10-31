package com.tiennn.apphotrotimhieuluatgiaothong;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Method;

public class ListVideoActivity extends AppCompatActivity {
    String API_KEY = "AIzaSyB4VA5OIWwh4Ap-PU_8QsEuyXutWf_YwnA";
    String ID_PLAY_LIST ="PL-Jb0pGe73AHx9g8ERZfelLqKe0XRaxIO";
    String URL_JSON = "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&playlistId="+ ID_PLAY_LIST +"&key="+ API_KEY +"&maxResults=50;";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_video);
        getJsonYoutube(URL_JSON);
    }
    private void getJsonYoutube(String url){
        final RequestQueue requestQueue = Volley.newRequestQueue(ListVideoActivity.this);
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Toast.makeText(ListVideoActivity.this,requestQueue.toString(),Toast.LENGTH_SHORT).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(ListVideoActivity.this,"loi",Toast.LENGTH_SHORT).show();
                    }
                }
        );
        requestQueue.add(jsonObjectRequest);
    }
}
