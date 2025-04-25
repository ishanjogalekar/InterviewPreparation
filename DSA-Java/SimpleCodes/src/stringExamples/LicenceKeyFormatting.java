package stringExamples;

public class LicenceKeyFormatting {
    public String reformatLicenceKey(String str, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if(str.charAt(i)=='-'){
                continue;
            }
            if(count == k){
                sb.append("-");
                count=0;
            }
            sb.append(str.charAt(i));
            count++;
        }
        return sb.reverse().toString().toUpperCase();
    }

    public static void main(String[] args) {
        String str = "2-5g-3-J";
        int k = 2;
        LicenceKeyFormatting licenceKeyFormatting = new LicenceKeyFormatting();
        System.out.println(licenceKeyFormatting.reformatLicenceKey(str, k));
    }
}
