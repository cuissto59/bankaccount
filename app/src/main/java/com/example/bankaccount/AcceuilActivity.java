package com.example.bankaccount;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.bankaccount.adapter.CustomListAdapter;
import com.example.bankaccount.model.Service;

import java.util.ArrayList;
import java.util.List;

public class AcceuilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceuil);

        List<Service> image_details = getListData();
        System.out.println("hello");
        System.out.println(image_details.get(2).toString());
        final ListView listView = (ListView) findViewById(R.id.ServiceView);
        listView.setAdapter(new CustomListAdapter(this, image_details));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Service service = (Service) o;
                Toast.makeText(AcceuilActivity.this, "Selected :" + " " + service.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private List<Service> getListData(){
        List<Service> list = new ArrayList<>();
        Service Facture = new Service("fac","Facture internet","500DH","3/11/2021");
        Service Emission = new Service("test","Emission d'un","5000,0DH","7/11/2021");
        Service Paiment = new Service("test","Paiment d'un","3000,0DH","5/11/2021");
        Service Paiment_type = new Service("test","Paiment par carte","800,0DH","08/11/2021");

        list.add(Facture);
        list.add(Emission);
        list.add(Paiment);
        list.add(Paiment_type);

        return list;
    }
}