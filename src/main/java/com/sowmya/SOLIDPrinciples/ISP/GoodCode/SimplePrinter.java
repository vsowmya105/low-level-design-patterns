package com.sowmya.SOLIDPrinciples.ISP.GoodCode;

import com.sowmya.SOLIDPrinciples.ISP.BadCode.Document;

public class SimplePrinter implements Printer{
    @Override
    public void print(Document document) {
        System.out.println("Printing the document...");
    }
}
