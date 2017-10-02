package br.com.luisferreira.autenticacaofirebase;

import retrofit2.Retrofit;

public class Service {
    public static void Service(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://infnet.educacao.ws/dadosAtividades.php/")
                .build();
        IService service = retrofit.create(IService.class);
    }
}
