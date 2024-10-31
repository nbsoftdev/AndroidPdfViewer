package com.nbsoftdev.pdfviewer.source;

import android.content.Context;

import com.nbsoftdev.pdfviewer.shockwave.pdfium.PdfDocument;
import com.nbsoftdev.pdfviewer.shockwave.pdfium.PdfiumCore;

import java.io.IOException;

public interface DocumentSource {
    PdfDocument createDocument(Context context, PdfiumCore core, String password) throws IOException;
}
