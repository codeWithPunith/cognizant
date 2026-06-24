package solution.week1.DesignAndPrinciples.FACTORY_METHOD.FactoryMethodPatternExample.src.factory;

import document.*;

public class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}