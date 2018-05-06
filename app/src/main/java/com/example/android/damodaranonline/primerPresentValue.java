package com.example.android.damodaranonline;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.barteksc.pdfviewer.PDFView;


public class primerPresentValue extends Fragment {


    PDFView pdfView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_primer_accounting, container, false);

        pdfView = v.findViewById(R.id.pdfView);
        pdfView.fromAsset("3.pdf").load();
        return v;
    }
}
