import java.util.HashMap;
import java.util.Map;

public class DialingCodes {
    private Map<Integer, String> dialingCodes = new HashMap<>(); 

    public Map<Integer, String> getCodes() {
        return this.dialingCodes;
    }

    public void setDialingCode(Integer code, String country) {
        this.dialingCodes.put(code, country);
    }
    
    public String getCountry(Integer code) {
        return this.dialingCodes.get(code);
    }
    
    public void addNewDialingCode(Integer code, String country) {
        if( !this.dialingCodes.containsKey(code) && 
                !this.dialingCodes.containsValue(country) ) setDialingCode(code, country);

    }

    public Integer findDialingCode(String country) {
        for( Map.Entry<Integer, String> entry : this.dialingCodes.entrySet() ) {
            if( entry.getValue().equals(country) ) return entry.getKey();
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        if(this.dialingCodes.containsValue(country)) {
            this.dialingCodes.remove(this.findDialingCode(country));
            this.dialingCodes.put(code, country);
        }
    }

    // public static void main(String[] args) {
    //     DialingCodes dialingCodes = new DialingCodes();
    //     dialingCodes.addNewDialingCode(88, "Japan");
    //     dialingCodes.updateCountryDialingCode(81, "Japan");
    //     System.out.println(dialingCodes.getCodes());

    // }
}
