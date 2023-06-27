public class Task2 {
    public String solution(int AA, int AB, int BB) {
        StringBuilder sb = new StringBuilder();

        while (AA > 0 || AB > 0 || BB > 0) {
            // add BB if it has the highest count and won't cause "BBB"
            if (BB >= AA && BB >= AB && !sb.toString().endsWith("BBB")) {
                sb.append("BB");
                BB--;
            }
            // add AA if it has the highest count and won't cause "AAA"
            else if (AA >= AB && !sb.toString().endsWith("AAA")) {
                sb.append("AA");
                AA--;
            }
            // add AB as a fallback if the above conditions are not met
            else if (AB > 0) {
                sb.append("AB");
                AB--;
            }
            // if we have no ABs left, we need to choose between AA and BB
            else if (AA > 0 && BB > 0) {
                // if AA has the higher count, add it if it won't cause "AAA"
                if (AA >= BB && !sb.toString().endsWith("AAA")) {
                    sb.append("AA");
                    AA--;
                }
                // otherwise, add BB if it won't cause "BBB"
                else if (!sb.toString().endsWith("BBB")) {
                    sb.append("BB");
                    BB--;
                }
            }
            // if we have no ABs, AAs, or BBs left, we're done
            else {
                break;
            }
        }
        System.out.println(sb);
        return sb.toString();
    }

}
