package com.sowmya.SOLIDPrinciples.ISP.BadCode;

import javax.print.Doc;

interface Machine {
    void print(Document doc);
    void scan(Document doc);
    void copy(Document doc);
}
