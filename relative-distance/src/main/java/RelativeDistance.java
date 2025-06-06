import java.util.List;
import java.util.Map;

class RelativeDistance {
    private Map<String, List<String>>  familyTree;

    RelativeDistance(Map<String, List<String>>  familyTree) {
        this.familyTree = familyTree;
    }

    int degreeOfSeparation(String personA, String personB) {
        if (personA == null || personB == null) {
            return -1;
        }
        if (personA.equals(personB)) {
            return 0;
        }
        
        List<String> parentsOfA = familyTree.get(personA);
        if (parentsOfA != null) {
            for (String parent : parentsOfA) {
                int degrees = degreeOfSeparation(parent, personB);
                if (degrees != -1) {
                    return degrees + 1;
                }
            }
        }
        return -1;
    }
}
