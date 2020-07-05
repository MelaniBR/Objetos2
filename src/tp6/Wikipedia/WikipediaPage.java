package tp6.Wikipedia;

import java.util.List;
import java.util.Map;

public interface WikipediaPage {
	public String getPage();
	public List<WikipediaPage> getLinks();
	Map<String, WikipediaPage> getInfobox();
}
