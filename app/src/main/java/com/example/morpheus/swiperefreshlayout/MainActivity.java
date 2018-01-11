package com.example.morpheus.swiperefreshlayout;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener
{
    private int contador;
    private TextView txtTexto;
    private SwipeRefreshLayout contenedor;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contenedor = (SwipeRefreshLayout)findViewById(R.id.contenedor);
        txtTexto = (TextView)findViewById(R.id.txtTexto);

        contador = 0;
        txtTexto.setText("Contador = " + String.valueOf(contador));
        contenedor.setOnRefreshListener(this);
    }

    //Cuando se jala hacia abajo el Layout
    @Override
    public void onRefresh()
    {
        contador++;
        txtTexto.setText("Contador = " + String.valueOf(contador));
        contenedor.setRefreshing(false);
    }
}
