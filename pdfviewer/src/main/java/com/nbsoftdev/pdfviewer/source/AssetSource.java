package com.nbsoftdev.pdfviewer.source;


import android.content.Context;
import android.os.ParcelFileDescriptor;

import com.nbsoftdev.pdfviewer.shockwave.pdfium.PdfDocument;
import com.nbsoftdev.pdfviewer.shockwave.pdfium.PdfiumCore;
import com.nbsoftdev.pdfviewer.util.FileUtils;

import java.io.File;
import java.io.IOException;

public class AssetSource implements DocumentSource {

    private final String assetName;

    public AssetSource(String assetName) {
        this.assetName = assetName;
    }

    @Override
    public PdfDocument createDocument(Context context, PdfiumCore core, String password) throws IOException {
        File f = FileUtils.fileFromAsset(context, assetName);
        ParcelFileDescriptor pfd = ParcelFileDescriptor.open(f, ParcelFileDescriptor.MODE_READ_ONLY);
        return core.newDocument(pfd, password);
    }
}