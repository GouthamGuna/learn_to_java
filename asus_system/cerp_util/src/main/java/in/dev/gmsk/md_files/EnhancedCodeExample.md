# Enhanced Code Example

 **Enhanced the filter the option code**

    import java.util.HashMap;
    import java.util.Map;
    import java.util.Vector;
    import java.util.Enumeration;
    
    public class EnhancedCodeExample {
    public static void main(String[] args) {
    // Assuming vo is an instance of your VO class
    // Initialize vo with appropriate values
    
            Map<String, String> map = new HashMap<>();
            Vector<String> vec = new Vector<>();
    
            if (!vo.getLocationId().isEmpty()) {
                map.put("scd.`locationid`", vo.getLocationId());
                vec.add("scd.`locationid`");
            }
    
            if (!vo.getAccyearId().isEmpty()) {
                map.put("scd.`accyearid`", vo.getAccyearId());
                vec.add("scd.`accyearid`");
            }
    
            if (!vo.getClassId().isEmpty()) {
                map.put("scd.`classid`", vo.getClassId());
                vec.add("scd.`classid`");
            }
    
            if (!vo.getSpecId().isEmpty()) {
                map.put("scd.`specializationid`", vo.getSpecId());
                vec.add("scd.`specializationid`");
            }
    
            if (!vo.getSectionId().isEmpty() && !vo.getSectionId().equals("0")) {
                map.put("scd.`sectionid`", vo.getSectionId());
                vec.add("scd.`sectionid`");
            }
    
            if (!vo.getStatus().isEmpty()) {
                map.put("stu.`status`", vo.getStatus());
                vec.add("stu.`status`");
            }
    
            String wheresql = vec.stream()
                    .map(key -> key + "='" + map.get(key) + "'")
                    .reduce("", (acc, val) -> acc.isEmpty() ? val : acc + " and " + val);
    
            String finalquery = wheresql.isEmpty()
                    ? query + " ORDER BY cls.`position`, specializationname, studentname"
                    : query + " " + wheresql + " ORDER BY cls.`position`, specializationname, studentname";
    
            // Now use finalquery to prepare your statement (pstmt)
            // ...
        }
    }