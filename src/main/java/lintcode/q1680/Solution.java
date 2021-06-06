package lintcode.q1680;


import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    Applicant[] toApplicants(int[] cost, int[] start, int[] end) {
        Applicant[] applicants = new Applicant[cost.length];
        for (int i = 0; i < cost.length; i++) {
            applicants[i] = new Applicant(cost[i], start[i], end[i]);
        }
        return applicants;
    }

    /**
     * @param remain: the number of classrooms available for rent
     * @param cost:   the number of classrooms you need to borrow
     * @param start:  the start day you borrow the classroom
     * @param end:    the end day you borrow the classroom
     * @return: which applicant to modify the order
     */
    public int getApplicant(int[] remain, int[] cost, int[] start, int[] end) {
        Applicant[] applicants = toApplicants(cost, start, end);
        for (int i = 0; i < applicants.length; i++) {
            for (int day = applicants[i].start; day <= applicants[i].end; day++) {
                remain[day - 1] -= applicants[i].cost;
                if (remain[day - 1] < 0) {
                    return i+1;
                }
            }
        }
        return 0;
    }

    static class ApplicantComparator implements Comparator<Applicant> {
        @Override
        public int compare(Applicant o1, Applicant o2) {
            return o1.start - o2.start;
        }
    }

    static class Applicant {
        int cost;
        int start;
        int end;

        public Applicant(int cost, int start, int end) {
            this.cost = cost;
            this.start = start;
            this.end = end;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Applicant applicant = (Applicant) o;

            if (cost != applicant.cost) return false;
            if (start != applicant.start) return false;
            return end == applicant.end;
        }

        @Override
        public int hashCode() {
            int result = cost;
            result = 31 * result + start;
            result = 31 * result + end;
            return result;
        }
    }


}
