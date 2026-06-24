package solution.week1.DesignAndPrinciples.FACTORY_METHOD.FactoryMethodPatternExample.src.document;

public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Spreadsheet...");
    }
}