public class PDFFactory extends DocumentFactory {
    public PDFDocument createDocument() {
        return new PDFImplementation();
    }
}
