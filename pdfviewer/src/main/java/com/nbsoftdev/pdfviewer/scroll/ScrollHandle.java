package com.nbsoftdev.pdfviewer.scroll;


import com.nbsoftdev.pdfviewer.PDFView;

public interface ScrollHandle {

    
    void setScroll(float position);

    
    void setupLayout(PDFView pdfView);

    
    void destroyLayout();

    
    void setPageNum(int pageNum);

    
    boolean shown();

    
    void show();

    
    void hide();

    
    void hideDelayed();
}
