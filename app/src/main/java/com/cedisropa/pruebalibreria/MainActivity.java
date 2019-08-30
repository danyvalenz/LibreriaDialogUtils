package com.cedisropa.pruebalibreria;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cedisropa.dialogutils.DialogUtils;
import com.cedisropa.dialogutils.TipoDialogo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog dialogo = DialogUtils.crearDialogo(TipoDialogo.MENSAJE, this,
                "Aviso", "Esto es solo un mensaje");
        dialogo.show();

        DialogUtils.mostrarDialogo(TipoDialogo.ADVERTENCIA, this, null,
                "No tienes permisos");

        DialogUtils.mostrarDialogo(TipoDialogo.ERROR, this, null,
                "Ocurrió algo que no debió pasar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                DialogUtils.mostrarDialogo(TipoDialogo.OPCION, MainActivity.this,
                        "confirmación", "Es necesario reportar");
                //finish();

            }
        });
    }
}
