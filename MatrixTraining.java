package org.d3ifcool.onebrain.Training;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import org.d3ifcool.onebrain.R;

/**
 * Created by acer on 08/10/2017.
 */

public class MatrixTraining extends AppCompatActivity{
    WebView webview;


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_training);

        WebView web = (WebView) findViewById(R.id.matrixview);
        web.loadUrl("file:///android_asset/brain_matrix/index.html");
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

}
