class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> newSet = new HashSet<>();
        for(List<String> path : paths) {
            newSet.add(path.get(0));
        }
        for(List<String> path : paths) {
            String candidate = path.get(1);
            if(newSet.contains(candidate)) {
                continue;
            } else {
                return candidate;
            }
        }
        return "";
    }
}