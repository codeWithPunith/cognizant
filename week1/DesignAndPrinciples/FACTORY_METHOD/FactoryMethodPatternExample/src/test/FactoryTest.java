package solution.week1.DesignAndPrinciples.FACTORY_METHOD.FactoryMethodPatternExample.src.test;

import factory.*;
import document.*;

public class FactoryTest {
    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.createDocument().open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        pdfFactory.createDocument().open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        excelFactory.createDocument().open();
    }
}