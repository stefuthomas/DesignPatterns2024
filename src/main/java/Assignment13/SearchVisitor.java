package Assignment13;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private List<String> searchResults = new ArrayList<>();
    private String searchCriteria;

    @Override
    public void visit(File file) {
        if (file.getName().contains(searchCriteria)) {
            searchResults.add(file.getName());
        }
    }

    @Override
    public void visit(Directory directory) {
    }

    public List<String> getSearchResults() {
        return searchResults;
    }

    public void setSearchCriteria(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }
}
