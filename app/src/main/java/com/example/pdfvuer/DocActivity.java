package com.example.pdfvuer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DocActivity extends AppCompatActivity {
    String filePath = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc);

        PDFView pdfView = findViewById(R.id.pdfView);
        filePath = getIntent().getStringExtra("path");

        File file = new File();
        Uri path = Uri.fromDile(file);
        pdfView.fromUri(path).load();

    }
}