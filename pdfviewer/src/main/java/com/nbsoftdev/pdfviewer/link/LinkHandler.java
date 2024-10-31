package com.nbsoftdev.pdfviewer.link;


import com.nbsoftdev.pdfviewer.model.LinkTapEvent;

public interface LinkHandler {

    void handleLinkEvent(LinkTapEvent event);
}
