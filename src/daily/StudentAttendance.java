package daily;

class StudentAttendance {
    public boolean checkRecord(String s) {
        int aNum = 0;
        int lateNum = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                lateNum++;
                if (lateNum >= 3) {
                    return false;
                }
            } else {
                lateNum = 0;
                if (s.charAt(i) == 'A') {
                    aNum++;
                    if (aNum >= 2) {
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
