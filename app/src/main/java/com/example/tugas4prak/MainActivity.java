package com.example.tugas4prak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MakananAdapter adapter;
    private ArrayList<Makanan> makananArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recycleview);
        adapter = new MakananAdapter(makananArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        makananArrayList = new ArrayList<>();
        makananArrayList.add(new Makanan("Mie Aceh", "Asal : Provinsi Aceh", "Masakan khas Aceh yang dibuat dengan kuah kari kental.",R.drawable.mieaceh));
        makananArrayList.add((new Makanan("Kerak Telor","Asal : DKI Jakarta", "Ciri khas kerak telor adalah gurih dan legit.",R.drawable.keraktelor)));
        makananArrayList.add((new Makanan("Rendang", "Asal : Sumatra Barat", "Ciri khasnya santan ,rempah mengeluarkan minyak, kuah kemerahan dan berminyak.",R.drawable.rendang)));
        makananArrayList.add((new Makanan("Pempek","Asal : Sumatera Selatan", "Pempek terbuat dari olahan sagu dan ikan plus tambahan kuah coklat yang dinamai cukpo.",R.drawable.pempek)));
        makananArrayList.add((new Makanan("Papeda", "Asal : Papua", "Papeda sejenis bubur sagu dengan kuah kuning plus ikan tongkol atau mubara yang dibumbui kunyit.", R.drawable.papeda)));
        makananArrayList.add((new Makanan("Nasi Liwet", "Asal : Solo, Jawa Tengah", "Nasi liwet berisi nasi yang dimasak dengan santan dan kaldu ayam, serta ditambahkan serai dan daun salam.", R.drawable.nasiliwet)));
        makananArrayList.add((new Makanan("Gado Gado", "Asal : Jakarta", "hidangan yang berisi tauge,kentang, bayam, dan lain sebagainya kemudian disiram dengan saus kacang yang manis, pedas, dan gurih.", R.drawable.gadogado)));
    }
}