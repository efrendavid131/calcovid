package com.covid.calcovid;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.ContextMenu;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Spinner Edd;
    CheckBox a, b, c, d, e;
    RadioButton hombre, mujer, pb, pn, sp, o;
    TextView factores, numfactores, con;
    Button cal,borrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Edd = findViewById(R.id.spedad);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Edad, android.R.layout.simple_spinner_item);
        Edd.setAdapter(adapter);

        factores = findViewById(R.id.txtfr);
        numfactores = findViewById(R.id.txtnfr);
        hombre = findViewById(R.id.rbtnH);
        mujer = findViewById(R.id.rbtnM);
        pb = findViewById(R.id.rbtnPb);
        pn = findViewById(R.id.rbtnPn);
        sp = findViewById(R.id.rbtnS);
        o = findViewById(R.id.rbtnO);
        cal = findViewById(R.id.btncalcu);
        a = findViewById(R.id.chbxHiper);
        b = findViewById(R.id.chbxDiab);
        c = findViewById(R.id.chbxEpoc);
        d = findViewById(R.id.chbxErenal);
        e = findViewById(R.id.chbxInmu);
        con = findViewById(R.id.txtcon);
        borrar=findViewById(R.id.btnclear);

    }
    public int contador=0;
    public void cont(View view) {

        if (pb.isChecked() == true) {
               int z=contador+1;
            numfactores.setText(String.valueOf(z));
             z= contador;
        }
        if (pn.isChecked() == true) {

            int z=contador+1;
            numfactores.setText(String.valueOf(z));
            z= contador;
        }
        if (sp.isChecked() == true) {

            int z=contador+1;
            numfactores.setText(String.valueOf(z));
            z= contador;
        }
        if (o.isChecked() == true) {

            numfactores.setText(String.valueOf(contador+1));
            contador = contador;
        }
        if (a.isChecked() == true) {

            int z=contador+1;
            numfactores.setText(String.valueOf(z));
            z= contador;
        }
        if (b.isChecked() == true) {

            int z=contador+1;
            numfactores.setText(String.valueOf(z));
            z= contador;
        }
        if (c.isChecked() == true) {
            int z=contador+1;
            numfactores.setText(String.valueOf(z));
            z= contador;
        }
        if (d.isChecked() == true) {
            numfactores.setText(String.valueOf(contador+1));
            contador = contador;
        }
        if (e.isChecked() == true) {
            numfactores.setText(String.valueOf(contador+1));
            contador = contador;
        }
        /*if (pb.isChecked() == false) {
            int x = contador - 1;
            numfactores.setText(String.valueOf(x));
            x = contador;
        }
        if (pn.isChecked() == false) {
            int x = contador - 1;
            numfactores.setText(String.valueOf(x));
            x = contador;
        }
        if (sp.isChecked() == false) {
            int x = contador - 1;
            numfactores.setText(String.valueOf(x));
            x = contador;
        }
        if (o.isChecked() == false) {
            int x = contador - 1;
            numfactores.setText(String.valueOf(x));
            x = contador;
        }
        if (a.isChecked() == false) {
            int x = contador - 1;
            numfactores.setText(String.valueOf(x));
            x = contador;
        }
        if (b.isChecked() == false) {
            int x = contador - 1;
            numfactores.setText(String.valueOf(x));
            x = contador;
        }
        if (c.isChecked() == false) {
            int x = contador - 1;
            numfactores.setText(String.valueOf(x));
            x = contador;
        }
        if (d.isChecked() == true) {
            int x = contador - 1;
            numfactores.setText(String.valueOf(x));
            x = contador;
        }
        if (e.isChecked() == false) {
            int x = contador - 1;
            numfactores.setText(String.valueOf(x));
            x = contador;
        }*/
    }

    public void genero(View gen) {
        if (mujer.isChecked() == true) {
            String msj = "Mujer";
            con = (TextView) findViewById(R.id.txtfr);
            factores.setText(con.getText().toString() + "" + msj);
        }
        if (hombre.isChecked() == true) {
            String msj = "Hombre";
            con = (TextView) findViewById(R.id.txtfr);
            factores.setText(con.getText().toString() + "\n" + msj);
        }

    }

    public void peso(View pp) {
        if (pb.isChecked() == true) {
            String pso = "Peso Bajo";
            con = (TextView) findViewById(R.id.txtfr);
            factores.setText(con.getText().toString() + "\n" + pso);
        }
        if (pn.isChecked() == true) {
            String pso = "Peso Normal";
            con = (TextView) findViewById(R.id.txtfr);
            factores.setText(con.getText().toString() + "\n" + pso);
        }
        if (sp.isChecked() == true) {
            String pso = "Sobrepeso";
            con = (TextView) findViewById(R.id.txtfr);
            factores.setText(con.getText().toString() + "\n" + pso);
        }
        if (o.isChecked() == true) {
            String pso = "Obecidad";
            con = (TextView) findViewById(R.id.txtfr);
            factores.setText(con.getText().toString() + "\n" + pso);
        }
    }

    public void padecimientos(View pd) {
        if (a.isChecked() == true) {
            String pso = "Hipertencion";
            con = (TextView) findViewById(R.id.txtfr);
            factores.setText(con.getText().toString() + "\n" + pso);
        }
        else if (a.isChecked()==false){
            con = (TextView) findViewById(R.id.txtfr);
            factores.setText(con.getText().toString() + "\n")  ;
        }
    }

    public void pade(View pd) {
        if(e.isChecked()==true){
            String pso="Inmunosupresión (por ejemplo cáncer,lupus etc.)";
            con=(TextView)findViewById(R.id.txtfr);
            factores.setText(con.getText().toString() +"\n"+pso);;
        }
        if (a.isChecked()==false){
            con = (TextView) findViewById(R.id.txtfr);
            factores.setText(con.getText().toString() + "\n");
        }
    }


    public void pad(View pd) {

        if (d.isChecked() == true) {
            String pso = "Enfermedad Renal Crónica";
            con = (TextView) findViewById(R.id.txtfr);
            factores.setText(con.getText().toString() + "\n" + pso);
        }
    }

    public void pa(View pd) {
        if (c.isChecked() == true) {
            String pso = "Enfermedad Pulmonar / Obstrucción Crónica (EPOC)";
            con = (TextView) findViewById(R.id.txtfr);
            factores.setText(con.getText().toString() + "\n" + pso);
        }
    }

    public void p(View pd) {
        if (b.isChecked() == true) {
            String pso = "Diabetes";
            con = (TextView) findViewById(R.id.txtfr);
            factores.setText(con.getText().toString() + "\n" + pso);
        }
    }
    public void clear(View v){
        factores.setText("");
        numfactores.setText("");

    }
}

