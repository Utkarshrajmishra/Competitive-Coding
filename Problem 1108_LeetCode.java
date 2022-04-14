class Solution {
    public String defangIPaddr(String address) {
         StringBuilder defanggedIP = new StringBuilder();
        for(int i = 0; i < address.length(); i ++) {
            if(address.charAt(i) == '.') {
                defanggedIP.append("[.]");
            } else {
                defanggedIP.append(address.charAt(i));
            }
        }
        
        return defanggedIP.toString();
    }
}
