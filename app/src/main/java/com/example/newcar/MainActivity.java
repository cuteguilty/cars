package com.example.newcar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    //ArrayList<String> selectedUsers = new ArrayList<String>();
    //ArrayList<Car> cars;
    StateCar adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Car> cars = new ArrayList<Car>();
        if(cars.size()==0){
            cars.add(new Car ("Chery Arrizo 6", "Сзади места не очень много, но особо не кто не жалуется", R.drawable.chery, "шт."));
            cars.add(new Car ("Chery Arrizo 3", "Простой ручник, а не ножник как на Камри", R.drawable.chery3, "шт."));
            cars.add(new Car ("Chery Arrizo EX", "Двигатель простой 3S-FE не D4, рядная 4ка 16 клапанная", R.drawable.arizo, "шт."));
            cars.add(new Car ("Mercedes-Benz S500", "Задняя ручка открывания багажника", R.drawable.tiggo, "шт."));
        }
        ListView productList = findViewById(R.id.productList);
        adapter = new StateCar(this, R.layout.list_item, cars);
        productList.setAdapter(adapter);
    }



    private void setInitialData(){


    }

}