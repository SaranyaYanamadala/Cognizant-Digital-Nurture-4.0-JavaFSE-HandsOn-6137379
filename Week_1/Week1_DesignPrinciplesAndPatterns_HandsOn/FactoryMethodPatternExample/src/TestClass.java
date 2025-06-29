public class TestClass {
    public static void main(String[] args) {
        WordFactory wordDoc = new WordFactory();
        WordDocument word = wordDoc.createDocument();
        word.open();

        PDFFactory pdfDoc = new PDFFactory();
        PDFDocument pdf = pdfDoc.createDocument();
        pdf.open();

        ExcelFactory excelDoc = new ExcelFactory();
        ExcelDocument excel = excelDoc.createDocument();
        excel.open();
    }
}
