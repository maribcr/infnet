package br.com.luisferreira.autenticacaofirebase;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IService {
    @GET("dadosAtividades.php")
    Call<ListView> listListView();
}