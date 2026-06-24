package solution.week1.DesignAndPrinciples.FACTORY_METHOD.FactoryMethodPatternExample.src.factory;

import document.*;

public class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}