package htmlparse;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

public class HtmlParser extends AbstractTransformer {

	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		String result[] = null;
		if(src instanceof String) {
			Document doc = Jsoup.parse((String)src);
			Elements links = doc.getElementsByTag("span");
			
			for(Element el : links) {
				result = el.text().split(" ");
				
			}
		}
		
		return result;
	}

	
	
}
