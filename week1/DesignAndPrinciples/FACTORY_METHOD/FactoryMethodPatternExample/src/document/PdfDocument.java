
package solution.week1.DesignAndPrinciples.FACTORY_METHOD.FactoryMethodPatternExample.src.document;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document...");
    }
}