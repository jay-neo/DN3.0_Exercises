package factorymethodpattern.factory;
import factorymethodpattern.document.Document;
import factorymethodpattern.document.ExcelDocument;

public class ExcelFactoryDocument extends DocumentFactory{

	@Override
	public Document createDocument() {
		// TODO Auto-generated method stub
		 return new ExcelDocument();
	}

}
