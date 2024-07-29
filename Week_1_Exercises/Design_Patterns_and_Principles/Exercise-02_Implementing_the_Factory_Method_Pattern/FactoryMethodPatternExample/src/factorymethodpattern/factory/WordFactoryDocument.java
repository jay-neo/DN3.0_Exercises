package factorymethodpattern.factory;
import factorymethodpattern.document.Document;
import factorymethodpattern.document.WordDocument;

public class WordFactoryDocument extends DocumentFactory {

	@Override
	public Document createDocument() {
        return new WordDocument();
    }
		
}
