package com.sowmya.SOLIDPrinciples.LSP.BadCode;

public class ReadOnlyFile extends File{
    @Override
    public void write() {
        throw new UnsupportedOperationException("Cant write to a read only file");
    }
}
